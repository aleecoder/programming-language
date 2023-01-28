import asyncio
import aiohttp
import time
from blog_spider import urls

# 设置并发度
semaphore = asyncio.Semaphore(30)


# 定义协程
async def async_craw(url):
    async with semaphore:
        async with aiohttp.ClientSession() as session:
            async with session.get(url) as resp:
                result = await resp.text()
                print(f"craw url:{url}, {len(result)}")


loop = asyncio.get_event_loop()
tasks = [loop.create_task(async_craw(url)) for url in urls]

if __name__ == '__main__':
    start = time.time()
    loop.run_until_complete(asyncio.wait(tasks))
    end = time.time()
    print(f"use time:{end - start} seconds.")
