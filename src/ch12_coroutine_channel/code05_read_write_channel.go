package main

// 使用协程和管道协同操作数据
import (
	"fmt"
	"sync"
)

var group sync.WaitGroup

func writeChannel(ic chan int) {
	defer group.Done()
	for i := 0; i < 10; i++ {
		ic <- i
		fmt.Println("The data written is", i)
		//time.Sleep(time.Second)
	}
	close(ic)
}

func readChannel(ic chan int) {
	defer group.Done()
	for v := range ic {
		fmt.Println("The data read is", v)
		//time.Sleep(time.Second)
	}
}
func main() {
	group.Add(2)
	ic := make(chan int, 10)
	//当只向管道写数据时，会出现阻塞
	go writeChannel(ic)
	go readChannel(ic)
	group.Wait()
}
