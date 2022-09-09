package main

import (
	"fmt"
	"math"
)

func main() {
	count := 0.0
	fmt.Print("请输入数字：")
	_, err := fmt.Scanf("%f", &count)
	if err != nil {
		fmt.Println(">>>输入格式不正确！")
		return
	}
	// 在golang里，if后面可以并列的加入变量的定义
	if sum := math.Max(count, 100); count >= 0 {
		fmt.Println(">>>非负数")
		fmt.Println(sum)
	} else {
		fmt.Println(">>>负数")
	}
}
