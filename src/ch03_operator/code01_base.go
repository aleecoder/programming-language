package main

import "fmt"

// ArithmeticOperator arithmetic operator
func ArithmeticOperator() {
	m, n := 101, 20
	fmt.Println(m + n)
	fmt.Println(m - n)
	fmt.Println(m * n)
	fmt.Println(m / n)

	var s = "abc" + "abd"
	fmt.Println(s)
}

func main() {
	ArithmeticOperator()
}
