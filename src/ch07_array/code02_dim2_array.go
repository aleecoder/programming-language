package main

import "fmt"

func printArray2(arr *[3][4]int) {
	for _, i := range arr {
		for _, j := range i {
			fmt.Print(j, "\t")
		}
		fmt.Println()
	}
}

func printArray2Address(arr *[3][4]int) {
	for i := 0; i < len(arr); i++ {
		fmt.Printf("arr[%d]的地址：%p\n", i, &arr[i])
	}
	fmt.Println("----------------------------")
	for i := 0; i < len(arr); i++ {
		for j := 0; j < len(arr); j++ {
			// Loc(arr[i]) = Loc(arr[i][0])
			// 二维数组arr[m][n]
			// 按行存储：Loc(arr[i][j]) = Loc(arr[0]) + (i*n+j)*d
			// 按列存储：Loc(arr[i][j]) = Loc(arr[0]) + (j*n+i)*d
			fmt.Printf("arr[%d][%d]的地址：%p\n", i, j, &arr[i][j])
		}
	}
}

func main() {
	//var arr [3][4]int // [[0 0 0 0] [0 0 0 0] [0 0 0 0]]
	// 定义并初始化二维数组
	arr := [3][4]int{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
	fmt.Println(arr)
	// 遍历二维数组
	printArray2(&arr)
	// 二维数组的内存地址
	printArray2Address(&arr)
}
