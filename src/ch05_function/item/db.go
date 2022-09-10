// Package item 一个目录下不能有重名的函数
package item

import "fmt"

var Name string

func init() {
	Name = "item::Name"
	fmt.Println("[0] package item::init() function is executed...")
}

// GetScore 首字母大写，相当于Java中的public
func GetScore() {
	fmt.Println("package item -> GetScore")
}

// 首字母小写，相当于Java中的private
func getId() {
	fmt.Println("package item -> getId")
}
