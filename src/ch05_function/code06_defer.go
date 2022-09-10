package main

import "fmt"

// 在函数中，经常需要创建资源，为了在函数执行完毕后，及时的释放资源，golang提供defer关键字

func f(i int, j int) int {
	// 程序遇到defer关键字，不会立即执行它后面的语句，而是压入栈中
	// 也会将相关的值同时拷贝入栈中，不会随着函数后面的变化而变化
	defer fmt.Println("[3] defer::i = ", i)
	defer fmt.Println("[2] defer::j = ", j)
	// 并没有改变defer中的 i、j 的值
	i += 100
	j += 100
	sum := i + j
	fmt.Printf("[1] f::sum(%v,%v) = %v\n", i, j, sum)
	return sum
}

func main() {
	// 注意程序执行的顺序
	fmt.Println("[4] main::", f(1, 1))
}
