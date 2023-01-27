import concurrent.futures
from blog_spider import *

with concurrent.futures.ThreadPoolExecutor() as pool:
    htmls = pool.map(craw, urls)
    htmls = list(zip(urls, htmls))
    for url, html in htmls:
        print(url, len(html))

print("craw over")

with concurrent.futures.ThreadPoolExecutor() as pool:
    futures = {}
    for url, html in htmls:
        future = pool.submit(parse, html)
        futures[future] = url
    # for future, url in futures.items():
    #     print(url, future.result())
    for future in concurrent.futures.as_completed(futures):
        url = futures[future]
        print(url, future.result())

