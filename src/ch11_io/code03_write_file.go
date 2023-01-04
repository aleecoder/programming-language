package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	file, err := os.OpenFile("data.txt", os.O_RDWR|os.O_APPEND|os.O_CREATE, 0777)
	if err != nil {
		fmt.Println(err)
		return
	}
	// 关闭文件
	defer func(file *os.File) {
		err := file.Close()
		if err != nil {
			fmt.Println(err)
		}
	}(file)
	// 创建写入缓冲流
	writer := bufio.NewWriter(file)
	for i := 0; i < 10; i++ {
		_, err := writer.WriteString("hello golang \n")
		if err != nil {
			fmt.Println(err)
			return
		}
	}
	// 刷新缓冲区
	err = writer.Flush()
	if err != nil {
		fmt.Println(err)
		return
	}
	// 权限控制
	println(os.FileMode(0777).String())
}
