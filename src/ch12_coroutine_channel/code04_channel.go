package main

import "fmt"

func main() {
	var iChan = make(chan int, 3) //定义并初始化管道，默认为双向管道
	//var wChan = make(chan<- int, 3) //定义并初始化只写管道
	//var rChan = make(<-chan int, 3) //定义并初始化只读管道
	fmt.Printf("The value of iChan is %v\n", iChan)
	//向管道写入数据
	for i := 0; i < 3; i++ {
		iChan <- i
	}
	close(iChan) //关闭管道，可读不可写
	fmt.Printf("The actual length of the channel is %v.\n", len(iChan))
	fmt.Printf("The capacity of the channel is %v.\n", cap(iChan))
	//读取管道中的数据
	n := <-iChan
	fmt.Println("Read the first element of the channel:", n)
	//遍历管道，注意先将其关闭
	for v := range iChan {
		fmt.Println("value:", v)
	}
}
