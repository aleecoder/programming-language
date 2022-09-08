package main

import "fmt"

// 逻辑运算符
func main() {
	// 与逻辑
	fmt.Println(true && true)
	fmt.Println(true && false)
	fmt.Println(false && true)
	fmt.Println(false && false)
	fmt.Println("-------------")

	// 或逻辑
	fmt.Println(true || true)
	fmt.Println(true || false)
	fmt.Println(false || true)
	fmt.Println(false || false)
	fmt.Println("-------------")

	// 非逻辑
	fmt.Println(!true)
	fmt.Println(!false)
}
