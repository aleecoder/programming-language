package main

import (
	"fmt"
	"reflect"
)

// 基本数据类型的反射
func bReflect(i interface{}) {
	rType := reflect.TypeOf(i)
	rValue := reflect.ValueOf(i)
	fmt.Println(rType, rValue)
	// 查看反射获得的变量类型
	fmt.Printf("The type of 'rType' is %T\n", rType)
	fmt.Printf("The type of 'rValue' is %T\n", rValue)
	// 获取rValue的值，调用Int()方法
	sum := 100 + rValue.Int()
	fmt.Println("sum =", sum)
	// rValue转成空接口
	ri := rValue.Interface()
	// 类型断言
	n := ri.(int) + 200
	fmt.Println("n =", n)
}

// 反射修改变量的值
func f(i interface{}) {
	rValue := reflect.ValueOf(i)
	rValue.Elem().SetInt(100)
}

func main() {
	num := 10
	bReflect(num)
	f(&num)
	fmt.Println(num)
}
