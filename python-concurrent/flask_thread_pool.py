import flask
import json
import time
from concurrent.futures import ThreadPoolExecutor

app = flask.Flask(__name__)
pool = ThreadPoolExecutor()


def read_file():
    time.sleep(0.1)
    return "file result"


def read_db():
    time.sleep(0.2)
    return "db result"


def read_api():
    time.sleep(0.3)
    return "api result"


@app.route("/")
def index():
    result_file = pool.submit(read_file)
    result_db = pool.submit(read_db)
    result_api = pool.submit(read_api)

    return json.dumps({
        "result_file": result_file.result(),
        "result_db": result_db.result(),
        "result_api": result_api.result(),
    })


if __name__ == '__main__':
    app.run()

"""
不使用线程池的运行时间

$ time curl http://127.0.0.1:5000/
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100    84  100    84    0     0    265      0 --:--:-- --:--:-- --:--:--   266
{"result_file": "file result", "result_db": "db result", "result_api": "api result"}

real    0m0.454s
user    0m0.015s
sys     0m0.000s
"""

"""
使用线程池的运行时间
$ time curl http://127.0.0.1:5000/
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100    84  100    84    0     0    271      0 --:--:-- --:--:-- --:--:--   272
{"result_file": "file result", "result_db": "db result", "result_api": "api result"}

real    0m0.394s
user    0m0.000s
sys     0m0.031s

"""
