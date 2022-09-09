package main

import "fmt"

func main() {
	sum := 0
	// break
	for i := 1; i <= 100; i++ {
		sum += i
		if sum >= 360 {
			fmt.Println(i)
			break
		}
	}
	fmt.Println("sum = ", sum)
	fmt.Println("-----------------------")

	// 灵活的for
	j := 0
	for j < 2 {
		fmt.Println("hello")
		j++
	}
	fmt.Println("-----------------------")

	// 双循环
	for i := 0; i < 5; i++ {
		for j := 0; j < 10; j++ {
			fmt.Printf("i= %d,j= %d\n", i, j)
			if i == 2 && j == 2 {
				// 结束的是离break最近的循环
				break
			}
		}
	}
	fmt.Println("-----------------------")
	// 加标签
label:
	for i := 0; i < 5; i++ {
		for j := 0; j < 10; j++ {
			fmt.Printf("i= %d,j= %d\n", i, j)
			if i == 2 && j == 2 {
				// break外层的循环
				break label
			}
		}
	}
	fmt.Println("-----------------------")
	// continue
	for i := 1; i <= 100; i++ {
		if i%6 != 0 {
			continue
		}
		fmt.Print(i, " ")
	}
	fmt.Println("\n-----------------------")
	// for range
	str := "hello golang语言"
	for i, val := range str {
		fmt.Printf("str[%d] = %c\n", i, val)
		//fmt.Printf("%c", val)
	}

	// 死循环
	//for {
	//	fmt.Println("死循环......")
	//}
}
