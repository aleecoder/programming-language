package main

// 多个协程操纵同一数据
import (
	"fmt"
	"sync"
)

var i int
var g sync.WaitGroup

// 使用互斥锁同步协程
var lock sync.Mutex

func add() {
	defer g.Done()
	for j := 0; j < 10000; j++ {
		lock.Lock()
		i++
		lock.Unlock()
	}
}

func sub() {
	defer g.Done()
	for j := 0; j < 10000; j++ {
		lock.Lock()
		i--
		lock.Unlock()
	}
}

func main() {
	g.Add(2)
	go add()
	go sub()
	g.Wait()
	fmt.Println(i)
}
