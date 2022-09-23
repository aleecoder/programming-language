package main

import "fmt"

// Teacher 定义老师的结构体
type Teacher struct {
	Name string
	Sex  string
	Age  int
}

// Run 方法是作用在指定的数据类型并和指定的数据类型绑定，
// 因此自定义类型，都可以有方法，而不仅仅是struct
// Run 跑步方法
func (t *Teacher) Run() {
	fmt.Println(t.Name, "正在操场跑步……")
}

// Eat 吃方法
func (t *Teacher) Eat(i int) int {
	fmt.Println(t.Name, "正在吃……")
	return i
}

// 如果一个类型实现了String()这个方法，那么fmt.Println默认会调用这个变量的String()进行输出
// 相当于Java中的 toString()
func (t *Teacher) String() string {
	return fmt.Sprintf("Teacher{Name = %v, Sex = %v, Age = %v}", t.Name, t.Sex, t.Age)
}

// Struct Teacher has methods on both value and pointer receivers.
// Such usage is not recommended by the Go Documentation.
/*func (t Teacher) String() string {
	return fmt.Sprintf("Teacher{Name = %v, Sex = %v, Age = %v}", t.Name, t.Sex, t.Age)
}*/
