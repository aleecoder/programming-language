# -*- coding: utf-8 -*-
"""
List processing
"""


def cleanList(lst):
    cleaned_list = []
    for item in lst:
        for ch in item:
            if not ch.isalpha():
                item = item.replace(ch, '')
        cleaned_list.append(item)
    return cleaned_list


coffee = ['32Latte', '_American30', '/34Cappuccino', 'Mocha35']
if __name__ == "__main__":
    cleaned_coffee = cleanList(coffee)
    for k, v in zip(range(1, len(cleaned_coffee) + 1), cleaned_coffee):
        print(k, v)
