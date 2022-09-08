package main

import "fmt"

func main() {
	var i = 1
	fmt.Println("i对应的存储空间的地址为：", &i)

	var ptr = &i
	fmt.Println(ptr)
	fmt.Println("ptr指针指向的具体数值为：", *ptr)
}
