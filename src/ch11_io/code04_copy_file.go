package main

import (
	"fmt"
	"os"
)

func main() {
	sourceFile := "data.txt"
	targetFile := "copy.txt"
	// 读取数据
	data, err := os.ReadFile(sourceFile)
	if err != nil {
		fmt.Println(err)
		return
	}
	// 写入数据
	err = os.WriteFile(targetFile, data, 0777)
	if err != nil {
		fmt.Println(err)
	}
}
