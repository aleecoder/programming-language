package main

import "fmt"

// 赋值运算符
func main() {
	a := 1
	b := 2
	fmt.Printf("before swap: a = %v,b=%v", a, b)
	temp := a
	a = b
	b = temp
	fmt.Printf("\nafter swap: a = %v,b=%v", a, b)
}
