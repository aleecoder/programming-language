# -*- coding: utf-8 -*-
"""
BMI计算
"""


class BMI:
    def __init__(self, height, weight):
        self.bmi = weight / height ** 2

    def printBMI(self):
        print("Your BMI is {:.1f}".format(self.bmi))


class ChinaBMI(BMI):
    def printBMI(self):
        print("你的BMI是{:.1f}.".format(self.bmi))
        if self.bmi < 18.5:
            print("你的身体偏瘦！相关疾病发病的危险性低（但其他疾病危险性增加）！")
        elif self.bmi < 24:
            print("你的身体正常！相关疾病发病的危险性平均水平！")
        elif self.bmi < 27:
            print("你的身体偏胖！相关疾病发病的危险性增加！")
        elif self.bmi < 30:
            print("你的身体肥胖！相关疾病发病的危险性中度增加！")
        else:
            print("你的身体重度肥胖！相关疾病发病的危险性严重增加！")


if __name__ == '__main__':
    h = float(input("Your height: "))
    w = float(input("Your weight: "))
    x = ChinaBMI(h, w)
    x.printBMI()
