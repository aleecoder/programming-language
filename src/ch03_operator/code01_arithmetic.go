package main

import "fmt"

// 算术运算符
func main() {
	// + （1）表示正数；（2）相加运算；（3）字符串拼接
	// / int数据类型运算，结果为int类型；浮点类型运算，结果为浮点类型
	// % 取模运算 x%y = x - x/y * y
	// golang中，++、--操作只能单独使用，不能参与到运算中，且只能在变量的后面
	m, n := 101, 20
	fmt.Println(m + n)
	fmt.Println(m - n)
	fmt.Println(m * n)
	fmt.Println(m / n)
	fmt.Println(m % n)
	var s = "abc" + "abd"
	fmt.Println(s)
	n++
	m--
	sum := 0
	sum += m
	println(sum)
}
