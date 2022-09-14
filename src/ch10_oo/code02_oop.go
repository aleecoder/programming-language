package main

import (
	"fmt"
	"learn-go/src/ch10_oo/item"
)

func main() {
	cat := item.Cat{Name: "tom", Age: 3}
	fmt.Println(&cat)
	tomcat := item.NewTomcat("tomcat", 5)
	fmt.Println(tomcat)

	r1 := item.GetInstance()
	r2 := item.GetInstance()
	fmt.Println(r1 == r2)
}
