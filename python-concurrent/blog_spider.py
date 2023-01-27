import requests
from bs4 import BeautifulSoup

urls = [f"https://www.cnblogs.com/#p{page}" for page in range(1, 51)]


def craw(url):
    """ 生产者 """
    r = requests.get(url)
    return r.text


def parse(html):
    """ 消费者 """
    soup = BeautifulSoup(html, 'lxml')
    links = soup.find_all('a', class_='post-item-title')
    return [(link['href'], link.get_text()) for link in links]

