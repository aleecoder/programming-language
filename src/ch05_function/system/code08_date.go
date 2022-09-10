package main

import (
	"fmt"
	"time"
)

func main() {
	// time.Now() return a struct 'Time'
	var now time.Time = time.Now()
	fmt.Println(now) // 2022-09-10 17:59:00.8646929 +0800 CST m=+0.002565001
	// 日期的格式化
	// 将日期以'年月日时分秒'的格式输出为字符串
	dateStr := fmt.Sprintf("%d-%d-%d %d:%d:%d\n",
		now.Year(), now.Month(), now.Day(), now.Hour(), now.Minute(), now.Second())
	fmt.Println(dateStr)
	// 按照指定格式（这个参数字符串的各个数字必须是固定的）
	format := now.Format("2006/01/02 15:04:05")
	fmt.Println(format)
}
