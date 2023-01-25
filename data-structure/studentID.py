# -*- coding: utf-8 -*-
"""
生成符合要求的学号
"""

import random


def func(data):
    """
    利用班级信息的字典数据随机选择班级并生成一个随机的学号
    学号共6位，前4位为班级编号，后2位为某同学在班级中的序号，如A00101
    序号从01开始顺序编号，并且不能超过该班级学生总数
    :param data:
    :return:
    """
    cls_no = random.choice(list(data.keys()))
    stu_no = random.randint(1, data.get(cls_no))
    return "{}{:02}".format(cls_no, stu_no)


if __name__ == '__main__':
    data = {'A001': 32, 'A002': 47, 'B001': 39, 'B002': 42}
    result = set()
    while len(result) < 10:
        result.add(func(data))
    print(result)
