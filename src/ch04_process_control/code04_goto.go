package main

import "fmt"

// goto语句可以无条件转移到程序中指定的行
// goto语句通常与条件语句配合使用，可以用来实现条件转移
// 一般不建议使用goto
func main() {
	for i := 1; i <= 10; i++ {
		fmt.Println("hello golang ", i)
		if i == 5 {
			goto label
		}
	}
label:
	fmt.Println("》》》goto")
}
