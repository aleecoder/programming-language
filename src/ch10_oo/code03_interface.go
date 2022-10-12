package main

import "fmt"

type Greet interface {
	sayHello()
}

type Chinese struct {
}

func (c Chinese) sayHello() {
	fmt.Println("你好！")
}

type American struct {
}

func (c American) sayHello() {
	fmt.Println("Hello!")
}

func greet(g Greet) {
	g.sayHello()
}

func main() {
	c := Chinese{}
	a := American{}
	greet(c)
	greet(a)
}
