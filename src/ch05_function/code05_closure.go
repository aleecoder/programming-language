package main

import "fmt"

// 闭包就是能够读取其他函数内部变量的函数
// 返回的是一个匿名函数，但是这个匿名函数引用到函数外的变量/参数 ,因此这个匿名函数就和变量/参数形成一个整体，构成闭包
// 闭包本质依旧是一个匿名函数，只是这个函数引入外界的变量/参数
// 匿名函数 + 引用的变量/参数 = 闭包

// Σ
func getSigmaSum() func(i int) int {
	sum := 0
	// 匿名函数中引用的变量会一直保存在内存中，可以一直使用
	return func(num int) int {
		sum += num
		return sum
	}
}

func main() {
	f := getSigmaSum()
	sum := 0
	for i := 1; i <= 100; i++ {
		// f(1) = 1
		// f(2) = 3
		// f(3) = 6
		// ...
		// f(100) = 5050
		sum = f(i)
	}
	fmt.Println("Σ(1 -> 100) = ", sum)
}
