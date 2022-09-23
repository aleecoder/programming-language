package item

import "fmt"

type Animal struct {
	Name string
	age  int
}

func (a *Animal) Shout() {
	fmt.Println(a.Name, ": 大声喊叫...")
}

func (a *Animal) String() string {
	return fmt.Sprintf("Animal{name = %v, age = %v}", a.Name, a.age)
}

func (a *Animal) SetName(name string) {
	a.Name = name
}

func (a *Animal) GetName() string {
	return a.Name
}
