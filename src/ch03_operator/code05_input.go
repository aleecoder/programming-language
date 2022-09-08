package main

import "fmt"

// 键盘录入学生的年龄、姓名、成绩、是否为VIP
func main() {
	var name string
	var age byte
	var score float32
	var isVIP bool
	// 方式1
	fmt.Print("请输入学生的姓名：")
	fmt.Scanln(&name)

	fmt.Print("请输入学生的年龄：")
	fmt.Scanln(&age)

	fmt.Print("请输入学生的成绩：")
	fmt.Scanln(&score)

	fmt.Print("请输入是否为VIP：")
	fmt.Scanln(&isVIP)

	fmt.Printf("name = %v,age = %v,score = %v,isVIP = %v\n", name, age, score, isVIP)

	// 方式2
	fmt.Println(">>> 请录入学生的姓名、年龄、成绩、是否为VIP，以空格进行分隔......")
	_, err := fmt.Scanf("%s %d %f %t", &name, &age, &score, &isVIP)
	if err != nil {
		return
	}
	fmt.Printf("name = %v,age = %v,score = %v,isVIP = %v", name, age, score, isVIP)
}
