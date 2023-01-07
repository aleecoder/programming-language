package main

import (
	"fmt"
	"time"
)

func main() {
	ic := make(chan int, 10)
	sc := make(chan string, 10)
	go func() {
		ic <- 1
		time.Sleep(time.Second * 5)
	}()
	go func() {
		sc <- "hello golang"
		time.Sleep(time.Second * 5)
	}()

	select {
	case v := <-ic:
		fmt.Println("ic::", v)
	case v := <-sc:
		fmt.Println("sc::", v)
	default:

	}
}
