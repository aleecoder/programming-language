def hanoi(a, b, c, n):
    """
    汉诺塔，从a移动到b
    :param a: 源位置
    :param b: 目标位置
    :param c: 辅助位置
    :param n: 盘子个数
    """
    if n == 1:
        move(a, c)
    else:
        hanoi(a, c, b, n - 1)
        move(a, b)
        hanoi(c, b, a, n - 1)


def move(a, b):
    print(a, "->", b)


if __name__ == '__main__':
    hanoi('a', 'b', 'c', 3)
