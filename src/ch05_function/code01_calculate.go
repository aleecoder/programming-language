package main

import "fmt"

// golang中，不支持函数的重载
func add(x int, y int) int {
	return x + y
}

// 支持对函数返回值命名
func cal(x int, y int) (sum int, sub int) {
	sum = x + y
	sub = x - y
	return
}

// golang中，基本数据类型和数组默认是值传递
// 如果希望在函数内能修改函数外的变量，可以传入变量的地址&，函数内以指针的方式操作变量
func swap(a *int, b *int) {
	temp := *a
	*a = *b
	*b = temp
}

func main() {
	a, b := 1, 2
	fmt.Println(add(1, 2))
	sum, sub := cal(a, b)
	fmt.Println("sum = ", sum, " sub = ", sub)
	// golang中，函数也是一种数据类型，可以赋值给一个变量，则该变量就是一个函数类型的变量。
	// 通过该变量可以对函数调用
	f := swap
	fmt.Printf("i的数据类型是: %T\nswap函数的数据类型是: %T\n", f, swap)

	fmt.Printf("交换前：a = %v,b = %v\n", a, b)
	f(&a, &b)
	//swap(&a, &b)
	fmt.Printf("交换后：a = %v,b = %v", a, b)
}
