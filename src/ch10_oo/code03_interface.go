package main

import "fmt"

type Greet interface {
	sayHello()
}

// E 空接口
type E interface {
}
type Chinese struct {
	name string
}

func (c Chinese) sayHello() {
	fmt.Println("你好！")
}

// 中国人独有的方法
func (c Chinese) eat() {
	fmt.Println("Chinese::I like eating!")
}

type American struct {
	name string
}

func (c American) sayHello() {
	fmt.Println("Hello!")
}

// 美国人独有的方法
func (c American) think() {
	fmt.Println("American::I like thinking!")
}

// 多态参数
func greet(g Greet) {
	g.sayHello()
	//断言
	//if chinese, err := g.(Chinese); err {
	//	chinese.eat()
	//}
	switch t := g.(type) {
	case Chinese:
		t.eat()
	case American:
		t.think()
	}
}

// 多态数组
var arr [2]Greet

func main() {
	c := Chinese{}
	a := American{}
	greet(c)
	greet(a)
	//多态数组
	arr[0] = Chinese{"Zhang Hong"}
	arr[1] = American{"Tom"}
	fmt.Println(arr)
	//空接口
	var e E = c
	var e2 interface{} = a
	fmt.Println(e)
	fmt.Println(e2)
}
