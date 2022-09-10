package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {
	// golang中，汉字是utf-8字符集，每个汉字3个字节
	str := "golang够浪"
	// 按字节统计字符串的长度
	fmt.Println(len(str))
	// 对字符串进行遍历
	// 方法一：利用键值循环for-range
	for i, value := range str {
		fmt.Printf("str[%d] = %c\n", i, value)
	}
	// 方法二：利用切片
	r := []rune(str)
	for i := 0; i < len(r); i++ {
		fmt.Printf("%c", r[i])
		if i == len(r)-1 {
			fmt.Println()
		}
	}
	// 字符串 -> 整数
	n, _ := strconv.Atoi("520")
	fmt.Printf("The data type of 'n' is %T，its value is %v\n", n, n)
	// 整数 -> 字符串
	s := strconv.Itoa(520)
	fmt.Printf("The data type of 's' is %T，its value is %v\n", s, s)
	// 统计一个字符串指定的子串个数
	count := strings.Count("golangandjava", "an")
	fmt.Println(count)
	// 不区分大小写的字符串比较
	// 区分大小写的字符串比较使用 ==
	fold := strings.EqualFold("hello", "HELLO")
	fmt.Println(fold)
	// 返回子串在字符串第一次出现的索引值，如果没有返回-1
	index := strings.Index("golangandjava", "an")
	fmt.Println(index)
	// 字符串的替换
	// n可以指定替换的个数，n=-1表示全部替换
	replace := strings.Replace("golangandjavagolanggolang", "golang", "go", 2)
	fmt.Println(replace)
	// 按照指定的某个字符作为为分割标识，将一个学符串拆分成字符串数组
	split := strings.Split("golang-java-python-golang-php-c++-c-scala-r", "-")
	fmt.Println(split)
	// 将字符串的字母进行大小写的转换
	fmt.Println(strings.ToUpper("golang"))
	fmt.Println(strings.ToLower("GOLANG"))
	// 去掉字符串左右两边的空格
	fmt.Println(strings.TrimSpace("  golang is golang                    "))
	// 去掉字符串左右两边指定的字符
	fmt.Println(strings.Trim("~golang is ~ golang ~", "~"))
	// 去掉字符串左边指定的字符
	fmt.Println(strings.TrimLeft("~golang is ~ golang ~", "~"))
	// 去掉字符串右边指定的字符
	fmt.Println(strings.TrimRight("~golang is ~ golang ~", "~"))
	// 判断字符串是否以指定的字符串开头
	prefix := strings.HasPrefix("https://golang.google.cn/", "https")
	fmt.Println(prefix)
	// 判断字符串是否以指定的字符串结尾
	suffix := strings.HasSuffix("https://golang.google.cn/", ".org")
	fmt.Println(suffix)
}
