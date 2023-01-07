package main

import (
	"fmt"
	"strconv"
	"sync"
)

var wg sync.WaitGroup

func printS() {
	defer wg.Done()
	for i := 0; i < 10; i++ {
		fmt.Println("printS::hello golang", strconv.Itoa(i))
	}
}
func div(i int, j int) {
	defer wg.Done()
	defer func() {
		err := recover()
		if err != nil {
			fmt.Println("div", err)
		}
	}()
	fmt.Println(i / j)
}
func main() {
	// 启动多个协程,主死从随
	wg.Add(2)
	go div(1, 0)
	go printS()
	wg.Wait()
}
