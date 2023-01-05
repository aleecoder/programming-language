package main

import (
	"fmt"
	"reflect"
	"strings"
)

type student struct {
	Id   int
	Name string
}

func (s student) Love() {
	fmt.Printf("%v love you!!!\n", strings.ToTitle(s.Name))
}
func (s student) Read(book string) {
	fmt.Printf("%v is reading %v\n", s.Name, book)
}
func (s student) printInfo() {
	fmt.Printf("info::student{%v,%v}", s.Id, s.Name)
}

// 结构体数据类型的反射
func sReflect(i interface{}) {
	rType := reflect.TypeOf(i)
	rValue := reflect.ValueOf(i)
	fmt.Println(rType, rValue)
	fmt.Printf("The type of 'rType' is %T\n", rType)
	fmt.Printf("The type of 'rValue' is %T\n", rValue)
	// rValue转成空接口
	ri := rValue.Interface()
	// 类型断言
	s, err := ri.(student)
	if err != true {
		return
	}
	fmt.Printf("info::student{%v,%v}", s.Id, s.Name)
	// 获取变量的类别
	fmt.Printf("The kind of variable is %v\n", rType.Kind())
	fmt.Printf("The kind of variable is %v\n", rValue.Kind())
	// 获取变量的类型
	fmt.Printf("The type of variable is %T\n", s)
}

// 通过反射操作结构体的属性和方法
func g(i interface{}) {
	val := reflect.ValueOf(i)
	for i := 0; i < val.NumField(); i++ {
		fmt.Printf("The value of the %dth field is %v\n", i, val.Field(i))
	}
	fmt.Println(">>> Invoke properties and methods...")
	// public的方法才可以通过反射进行调用
	val.Method(0).Call(nil)
	// 调用Read方法
	var params []reflect.Value
	params = append(params, reflect.ValueOf("Golang"))
	res := val.Method(1).Call(params)
	fmt.Println("The return of Read methods is", res)
}

// 通过反射修改结构体变量的值
func k(i interface{}) {
	val := reflect.ValueOf(i)
	val.Elem().Field(1).SetString("Join")
}

func main() {
	stu := student{180512201, "tom"}
	sReflect(stu)
	g(stu)
	k(&stu)
	stu.printInfo()
}
