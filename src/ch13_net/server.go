package main

import (
	"fmt"
	"net"
)

func main() {
	fmt.Println("start server...")
	// 监听
	listener, err := net.Listen("tcp", "127.0.0.1:8888")
	if err != nil {
		fmt.Println(err)
		return
	}
	fmt.Println("wait client to connect...")
	for {
		conn, err := listener.Accept()
		if err != nil {
			fmt.Println(err)
			continue
		}
		fmt.Println("connect success :", conn.RemoteAddr().String())
		// 准备一个协程，处理客户端服务请求
		go process(conn)
	}
}

func process(conn net.Conn) {
	defer func(conn net.Conn) {
		err := conn.Close()
		if err != nil {
			fmt.Println(err)
		}
	}(conn)
	for {
		// 创建切片，将读取的数据放入切片
		buf := make([]byte, 1024)
		n, err := conn.Read(buf)
		if err != nil {
			return
		}
		fmt.Print("Data received by the server: ", string(buf[0:n]))
	}
}
