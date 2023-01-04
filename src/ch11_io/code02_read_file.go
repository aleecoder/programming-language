package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
)

func main() {
	/**
	一次性读入
	*/
	data, err := os.ReadFile("README.md")
	if err != nil {
		fmt.Println(err)
	}
	fmt.Println(string(data))
	/**
	缓冲读入
	*/
	file, err := os.Open("info.log")
	if err != nil {
		fmt.Println(err)
	}
	defer func(file *os.File) {
		err := file.Close()
		if err != nil {
			fmt.Println(err)
		}
	}(file)
	// 创建文件读取流
	reader := bufio.NewReader(file)
	for {
		str, err := reader.ReadString('\n')
		if err == io.EOF {
			break
		}
		fmt.Print(str)
	}
	fmt.Print("read done!")
}
