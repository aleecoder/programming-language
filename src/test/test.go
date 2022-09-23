// 单例模式

package main

import "fmt"

func main() {
	// 测试单例模式
	i := GetInstance()
	j := GetInstance()
	fmt.Println(i == j)
}
