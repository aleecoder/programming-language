package main

import (
	"fmt"
	"learn-go/src/ch05_function/item"
)

// 可变参数
func myGirlfriends(girls ...string) {
	// 函数内部处理可变参数时，将可变参数当做切片来处理
	for i, girl := range girls {
		fmt.Printf("我的第%d个女朋友是%v\n", i, girl)
	}
}

// 自定义数据类型
type g func(...string)

// 函数是一种数据类型，因此在golang中，函数可以作为形参，并且调用（把函数本身当做一种数据类型）
func function(f g) {
	f("婷婷", "芳芳")
}

func main() {
	f := myGirlfriends
	function(f)
	item.GetScore()
}
