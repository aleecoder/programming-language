package main

import (
	"fmt"
	"learn-go/src/ch05_function/item"
)

var name = setName()

func setName() string {
	fmt.Println(`[1] the global variable "name" is executed...`)
	return "golang"
}

// init函数：初始化函数，用来进行初始化的操作
// 每一个源文件都可以包含一个init函数，该函数会在main函数执行前，被golang运行框架调用
func init() {
	fmt.Println("[2] package main::init() function is executed...")
}

func main() {
	// 程序执行顺序：item::init() -> name -> init() -> main()
	// 结论：import -> global variable -> init() -> main()
	fmt.Println("[3] main() function is executed...")
	name = item.Name
	fmt.Println("package main::name = ", name)
}
