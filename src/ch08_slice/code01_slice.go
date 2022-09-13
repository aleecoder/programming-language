package main

import (
	"fmt"
	"unsafe"
)

// type slice
type slice struct {
	array unsafe.Pointer // 指向数据缓冲区的指针
	len   int            // 当前数据缓冲区使用的size
	cap   int            // 当前缓冲区的容量
}

func info(slice []int) {
	fmt.Println("slice = ", slice)
	fmt.Printf("切片底层数组的指针：%p\n", &slice)
	fmt.Println("切片元素个数：", len(slice))
	fmt.Println("切片的容量：", cap(slice))
}

func main() {
	// 定义切片
	// 方式一：构建在数组之上
	arr := [7]int{0, 1, 2, 3, 4, 5, 6}
	slice := arr[1:3] // [1,3)
	fmt.Println("arr = ", arr)
	fmt.Printf("数组的首地址：%p\n", &arr)
	info(slice)
	// 改变切片的值，会影响到原数组
	slice[1] = 100
	fmt.Println("arr = ", arr)
	fmt.Println("slice = ", slice)

	// 方式二：通过make内置函数来创建切片
	// make(type, len, [cap])
	fmt.Println("--------------------")
	slice2 := make([]int, 4, 20)
	slice2[0] = 11
	slice2[2] = 22
	info(slice2)

	// 方式三：定一个切片，直接指定具体数组
	fmt.Println("--------------------")
	slice3 := []int{1, 3, 5, 7, 9}
	info(slice3)

	// 遍历
	for k, v := range slice3 {
		fmt.Printf("slice3[%d] = %v\n", k, v)
	}

	// 切片可以继续切片
	fmt.Println("--------------------")
	slice4 := slice3[1:3]
	fmt.Println("slice3 = ", slice3)
	fmt.Println("slice4 = ", slice4)

	// 切片可以动态增长
	fmt.Println("--------------------")
	//slice5 := append(slice4, 90, 100)
	slice4 = append(slice4, 90, 100)
	fmt.Println("slice4 = ", slice4)
	//fmt.Println("slice5 = ", slice5)

	// 将切片追加给切片
	fmt.Println("--------------------")
	slice2 = []int{11, 22, 33, 44, 55} // 对切片重新赋值
	slice3 = []int{111, 222, 333, 444, 555}
	fmt.Println("slice4 = ", slice4)
	slice4 = append(slice2, slice3...)
	fmt.Println("slice2 = ", slice2)
	fmt.Println("slice3 = ", slice3)
	fmt.Println("slice4 = ", slice4)
}
