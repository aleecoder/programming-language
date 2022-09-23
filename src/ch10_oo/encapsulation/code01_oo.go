package main

import "fmt"

type integer int

// golang中的方法作用在指定的数据类型上的，和指定的数据类型绑定，
// 因此自定义类型，都可以有方法，而不仅仅是struct，比如int , float32等都可以有方法
func (i *integer) printI() {
	fmt.Println("i = ", *i)
}

func main() {
	// 创建Teacher结构体的实例（对象）
	// 方式一：t的类型是 main.Teacher
	//var t Teacher	// main.Teacher

	// 方式二：t的类型是 main.Teacher
	var t = Teacher{ // main.Teacher
		"tom",
		"man",
		18,
	}
	// 方式三：t的类型是 *main.Teacher
	//t := new(Teacher) // *main.Teacher

	// 方式四：t的类型是 *main.Teacher
	//t := &Teacher{
	//	"tom",
	//	"man",
	//	18,
	//}
	t.Name = "kat"
	fmt.Printf("t 结构体的数据类型：%T\n", t)
	fmt.Println("t = ", &t)

	// 结构体之间的转换
	s := Student{
		"pig",
		"man",
		20,
	}
	fmt.Println("转换前的s：", s)
	// 结构体是用户单独定义的类型
	// 和其它类型进行转换时需要有完全相同的字段（名字、个数和类型）
	s = Student(t)
	fmt.Println("转换后的s：", s)

	// 方法
	t.Run()
	eat := t.Eat(100)
	fmt.Println(eat)

	i := integer(20)
	i.printI()
}
