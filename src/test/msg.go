package main

import (
	"fmt"
	"sync"
)

type msg struct {
}

// GetInstance 单例模式
var instance *msg
var once sync.Once

//func GetInstance() *msg {
//	if instance == nil {
//		instance = &msg{} // not thread safe
//	}
//	return instance
//}

func GetInstance() *msg {
	once.Do(func() {
		fmt.Println("第一次创建对象……")
		instance = &msg{}
	})
	return instance
}
