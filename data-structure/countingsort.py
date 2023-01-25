# -*- coding: utf-8 -*-
"""
运动会班级人数统计排序
文件file.txt中保存了若干条参加运动会学生的报名记录，每条记录的形式为"班级号_学号"
将每个班级报名情况按参加运动会人数从多到少排列（假设不存在人数相同的情况）并输出，
输出结果如下：
A1 -> ['12','05','07','04']
A4 -> ['23','03','11']
A3 -> ['12','01']
A2 -> ['07']
"""


def func(stu_list):
    d = {}
    for item in stu_list:
        r = item.split('_')
        x, y = r[0], r[1].strip()
        if x not in d:
            d[x] = [y]
        else:
            d[x] += [y]
    sorted(d.items(), key=lambda t: len(t[1]), reverse=True)
    return d


if __name__ == '__main__':
    try:
        with open('file.txt') as f:
            stuList = f.readlines()
    except Exception as err:
        print(err)
    else:
        for item in func(stuList).items():
            print(item[0], '->', item[1])
