package main

import (
	"fmt"
	"os"
)

func main() {
	file, err := os.Open("README.md")
	if err != nil {
		fmt.Println("open file error:", err)
		return
	}
	fmt.Println(file)
	err = file.Close()
	if err != nil {
		fmt.Println("close file error:", err)
	}
}
