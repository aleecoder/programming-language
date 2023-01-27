import flask
import math
import json
from concurrent.futures import ProcessPoolExecutor

app = flask.Flask(__name__)


def isPrime(number):
    if number == 2:
        return True
    if number < 2 or number % 2 == 0:
        return False
    sqrt_n = int(math.floor(math.sqrt(number)))
    for i in range(3, sqrt_n + 1, 2):
        if number % i == 0:
            return False
    return True


@app.route('/is_prime/<numbers>')
def api_is_prime(numbers):
    number_list = [int(x) for x in numbers.split(',')]
    results = pool.map(isPrime, number_list)
    return json.dumps(dict(zip(number_list, results)))


if __name__ == '__main__':
    # 进程池必须放在函数声明的后面，且在main里
    pool = ProcessPoolExecutor()
    app.run()
