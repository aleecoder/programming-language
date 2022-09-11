package main

import (
	"errors"
	"fmt"
)

func showError(i int, j int) {
	fmt.Println(i / j)
	fmt.Println("showError function function is finished.")
}

func handingError(i int, j int) {
	// 利用defer+recover内置函数捕获错误
	defer func() {
		e := recover()
		if e != nil {
			fmt.Println("panic: ", e)
		}
	}()
	fmt.Println(i / j)
	fmt.Println("handingError function function is finished.")
}

func defError(i int, j int) error {
	if j == 0 {
		return errors.New("integer divide by zero")
	}
	fmt.Println(i / j)
	fmt.Println("defError function function is finished.")
	return nil
}
func main() {
	// panic: runtime error: integer divide by zero
	//
	// goroutine 1 [running]:
	// main.showError(0x4956a9?, 0x60?)
	//	 D:/WorkSpace/Go/learn-go/src/ch06_error_handling/code01_error.go:6 +0xc5
	// main.main()
	//	 D:/WorkSpace/Go/learn-go/src/ch06_error_handling/code01_error.go:41 +0x25
	//showError(1, 0)
	//handingError(1, 0)
	err := defError(1, 0)
	if err != nil {
		fmt.Println("error:: ", err)
		panic(err)
	}
	fmt.Println("main function is finished.")
}
