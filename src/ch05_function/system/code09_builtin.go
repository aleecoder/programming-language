package main

import "fmt"

// golang内置函数
func main() {
	// func len(v Type) int
	// 内建函数len返回 v 的长度，这取决于具体类型：
	// 数组：v中元素的数量
	// 数组指针：*v中元素的数量（v为nil时panic）
	// 切片、映射：v中元素的数量；若v为nil，len(v)即为零
	// 字符串：v中字节的数量
	// 通道：通道缓存中队列（未读取）元素的数量；若v为 nil，len(v)即为零

	// func new(Type) *Type
	// 内建函数new分配内存。其第一个实参为类型，而非值。其返回值为指向该类型的新分配的零值的指针
	// 分配内存，主要用来分配值类型（int系列, float系列, bool, string、数组和结构体struct）
	var num *int = new(int)
	fmt.Printf("num 的数据类型：%T\n"+
		"num 的值：%v\n"+
		"num 的地址：%v\n"+
		"num 指针指向的值：%v\n", num, num, &num, *num)

	// func make(Type, size IntegerType) Type
	// 内建函数make分配并初始化一个类型为切片、映射、或通道的对象。其第一个实参为类型，而非值。
	// make的返回类型与其参数相同，而非指向它的指针。其具体结果取决于具体的类型
	// 切片：size指定了其长度。该切片的容量等于其长度。切片支持第二个整数实参可用来指定不同的容量；
	//     它必须不小于其长度，因此 make([]int, 0, 10) 会分配一个长度为0，容量为10的切片。
	// 映射：初始分配的创建取决于size，但产生的映射长度为0。size可以省略，这种情况下就会分配一个
	//     小的起始大小。
	// 通道：通道的缓存根据指定的缓存容量初始化。若 size为零或被省略，该信道即为无缓存的。
	// 分配内存，主要用来分配引用类型（指针、slice切片、map、管道chan、interface 等）
}
