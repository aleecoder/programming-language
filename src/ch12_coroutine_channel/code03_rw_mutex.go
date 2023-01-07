package main

import (
	"fmt"
	"sync"
	"time"
)

// 读写锁
var rwLock sync.RWMutex
var count sync.WaitGroup

func read() {
	defer count.Done()
	rwLock.RLock() // 只读数据时，该锁不产生影响
	fmt.Println("Start reading data...")
	time.Sleep(time.Second)
	fmt.Println("Read data successfully!")
	rwLock.RUnlock()
}

func write() {
	defer count.Done()
	rwLock.Lock()
	fmt.Println("Start writing data...")
	time.Sleep(time.Second * 10)
	fmt.Println("Write data successfully!")
	rwLock.Unlock()
}
func main() {
	count.Add(6)
	// 读多写少
	for i := 0; i < 5; i++ {
		go read()
	}
	go write()
	count.Wait()
}
