package main

import "fmt"

// Student 定义学生的结构体
type Student struct {
	Name string
	Sex  string
	Age  int
}

func (s Student) String() string {
	return fmt.Sprintf("Student{Name = %v, Sex = %v, Age = %v}", s.Name, s.Sex, s.Age)
}
