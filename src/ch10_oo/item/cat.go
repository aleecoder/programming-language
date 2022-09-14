package item

import (
	"fmt"
	"sync"
)

type Cat struct {
	Name string
	Age  int
}

func (c *Cat) String() string {
	return fmt.Sprintf("Cat{name = %v, age = %v}", c.Name, c.Age)
}

type tomcat struct {
	name string
	age  int
}

func NewTomcat(name string, age int) *tomcat {
	return &tomcat{name: name, age: age}
}

func (t *tomcat) SetName(name string) {
	t.name = name
}

func (t *tomcat) GetName() string {
	return t.name
}

func (t *tomcat) SetAge(age int) {
	t.age = age
}

func (t *tomcat) GetAge() int {
	return t.age
}

func (t *tomcat) String() string {
	return fmt.Sprintf("Tomcat{name = %v, age = %v}", t.GetName(), t.GetAge())
}

type rei struct {
	name string
	age  int
}

// GetInstance 单例模式
var instance *rei
var once sync.Once

//func GetInstance() *rei {
//	if instance == nil {
//		instance = &rei{} // not thread safe
//	}
//	return instance
//}

func GetInstance() *rei {
	once.Do(func() {
		fmt.Println("第一次创建对象……")
		instance = &rei{}
	})
	return instance
}
