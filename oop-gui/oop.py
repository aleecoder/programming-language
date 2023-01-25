# -*- coding: utf-8 -*-
"""
面向对象
class ClassName(object):
    "define ClassName class"
    class_suite
"""


class Dog:
    counter = 0

    def __init__(self, name):
        """
        对象的初始化方法 __init__
        创建完对象后，python自动调用的第一个方法为 __init__()
        实例对象作为方法的第一个参数（self）被传递进去，调用类创建实例对象时的参数都传给__init__()
        """
        self.name = name
        # 类属性和实例无关，修改类属性需要使用类名
        Dog.counter += 1

    def greet(self):
        print("Hi,I am called {} {}.".format(self.name, Dog.counter))


class BarkingDog(Dog):
    # def __init__(self, name):
    #     super().__init__(name)

    def greet(self):
        print("Woof! I am {},my number is {}.".format(self.name, Dog.counter))


if __name__ == '__main__':
    dog = Dog("Sara")
    dog.greet()

    bark = BarkingDog("Zoe")
    bark.greet()
    # dog.greet()
