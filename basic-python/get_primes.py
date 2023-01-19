from math import sqrt


def isPrime(x):
    """
    判断一个数是否为素数
    :param x: int
    :return: boolean
    """
    if x <= 1:
        return False
    for i in range(2, int(sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True


def getRangePrimes(start, end):
    """
    获取[start,end]之间的所有素数
    :param start: 开始的正整数
    :param end: 结束的正整数
    :return: 素数列表
    """
    primes = []
    for i in range(start, end + 1):
        if isPrime(i):
            primes.append(i)
    return primes


if __name__ == '__main__':
    print(getRangePrimes(1, 100))
