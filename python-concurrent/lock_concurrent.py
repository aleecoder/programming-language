import threading
import time

lock = threading.Lock()


class Account:
    def __init__(self, balance):
        self.balance = balance


def draw(account, amount):
    with lock:
        if account.balance >= amount:
            time.sleep(0.1)
            print('线程{}取钱成功！'.format(threading.current_thread().name))
            account.balance -= amount
            print("线程{}的余额为{}!".format(threading.current_thread().name, account.balance))
        else:
            print('线程{}取钱失败，余额不足！'.format(threading.current_thread().name))


if __name__ == '__main__':
    account = Account(1000)
    ta = threading.Thread(name='ta', target=draw, args=(account, 800))
    tb = threading.Thread(name='tb', target=draw, args=(account, 800))

    ta.start()
    tb.start()
