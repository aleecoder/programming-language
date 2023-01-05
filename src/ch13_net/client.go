package main

import (
	"bufio"
	"fmt"
	"net"
	"os"
)

func main() {
	fmt.Println("start client...")
	conn, err := net.Dial("tcp", "127.0.0.1:8888")
	if err != nil {
		fmt.Println(err)
		return
	}
	fmt.Println("connect success: ", conn.RemoteAddr())
	// 终端标准输入，客户端发送数据
	fmt.Print("Please enter the data to be sent: ")
	reader := bufio.NewReader(os.Stdin)
	str, err := reader.ReadString('\n')
	if err != nil {
		fmt.Println(err)
		return
	}
	n, err := conn.Write([]byte(str))
	if err != nil {
		fmt.Println(err)
	}
	fmt.Printf("The terminal data is successfully sent through the client, totaling %d bytes.", n)
}
