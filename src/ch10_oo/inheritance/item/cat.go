// TODO: golang中的继承是真正意义上的继承吗？
// 严格意义来说，golang中没有继承，它是一个“语法糖”

package item

import (
	"fmt"
)

type Cat struct {
	// 加入匿名结构体
	Animal
}

func (c *Cat) Scratch() {
	fmt.Println(c.GetName(), ": 会挠人...")
}

//func (c *Cat) String() string {
//	return fmt.Sprintf("Cat{name = %v, age = %v}", c.Name, c.Age)
//}
