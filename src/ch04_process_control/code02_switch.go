package main

import "fmt"

func getScore() int {
	score := 0
	fmt.Print("请输入成绩：")
	_, err := fmt.Scanf("%d", &score)
	if err != nil {
		fmt.Println(">>>输入格式不正确！")
	}
	return score / 10
}
func main() {
	// switch后是一个表达式：常量值、变量、一个有返回值的函数等
	// case后面的值如果是常量值(字面量)，则要求不能重复
	// case后的各个值的数据类型，必须和 switch 的表达式数据类型一致
	// case后面可以带多个值，使用逗号间隔
	// case后面不需要带break
	// default语句不是必须的，位置也是随意的
	// switch后也可以不带表达式，当做if分支来使用
	// switch后也可以直接声明/定义一个变量，分号结束，不推荐
	// switch穿透，利用fallthrough关键字，如果在case语句块后增加fallthrough ,则会继续执行下一个case,也叫switch穿透
	switch getScore() {
	case 10, 9:
		fmt.Println("A")
		fallthrough
	case 8, 7:
		fmt.Println("B")
	case 6:
		fmt.Println("C")
	default:
		fmt.Println("E")
	}
}
