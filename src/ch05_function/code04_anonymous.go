package main

import "fmt"

var gf = func(x int, y int) int {
	return x + y
}

// golang支持匿名函数，如果某个函数只是希望使用一次，可以考虑使用匿名函数
func main() {
	// [1] 定义匿名函数，定义的同时调用
	sum := func(x int, y int) int {
		return x + y
	}(100, 200)
	fmt.Println(sum)
	// [2] 将匿名函数赋给一个变量，再通过该变量来调用匿名函数
	af := func(x int, y int) int {
		return x + y
	}
	sum = af(200, 300)
	fmt.Println(sum)
	// [3] 将匿名函数赋值给全局变量，实现在整个程序中可调用
	sum = gf(300, 400)
	fmt.Println(sum)
}
