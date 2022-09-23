package main

import (
	"fmt"
	"learn-go/src/ch10_oo/inheritance/item"
)

func main() {
	//cat1 := item.Cat{}
	//cat1.Name = "tom1"
	//cat1.Age = 3
	//
	//cat2 := item.Cat{"tom2", 3} // error
	//cat3 := item.Cat{
	//	Animal: item.Animal{Name: "tom3", Age: 3},
	//}
	//fmt.Println(cat3)

	cat := &item.Cat{}
	fmt.Println(cat)
	cat.SetName("my love cat")
	//cat.age = 3	// error
	fmt.Println(cat)
	cat.Shout()
	cat.Scratch()

}
