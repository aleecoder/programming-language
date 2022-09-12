package main

import (
	"errors"
	"fmt"
)

func initArray(arr *[5]int) {
	//arr := [...]int{1, 2, 3, 4, 5}
	for i := 0; i < len(arr); i++ {
		fmt.Printf("请录入第%v个整数：", i+1)
		_, err := fmt.Scanln(&arr[i])
		if err != nil {
			return
		}
	}
}

func updateArray(arr *[5]int, index int, value int) {
	if index < 0 || index >= 5 {
		err := errors.New("runtime error: 数组越界错误！")
		panic(err)
	}
	arr[index] = value
}

func printArray(arr *[5]int) {
	for i, value := range arr {
		fmt.Printf("arr[%d] = %v\n", i, value)
	}
}

func printArrayAddress(arr *[5]int) {
	fmt.Printf("arr[]的内存地址：%p\n", &arr) // 0xc000010480
	for i := 0; i < len(arr); i++ {
		// Loc(arr[i]) = Loc(arr[0]) + d*i，其中，数组每个空间占用的字节数取决于数组类型，记为d
		fmt.Printf("arr[%d]的内存地址：%p\n", i, &arr[i])
	}
}

func main() {
	// 定义数组
	var arr [5]int // [0 0 0 0 0]
	printArrayAddress(&arr)
	// 数组初始化
	initArray(&arr)
	// 数组的遍历
	printArray(&arr)
	updateArray(&arr, 4, 500)
	fmt.Printf("arr = %v\n", arr)
	// 数组的长度属于类型的一部分
	fmt.Printf("arr的数据类型 = %T\n", arr) // [5]int
}
