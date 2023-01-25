# -*- coding: utf-8 -*-
"""
词频统计
"""
poem_EN = 'Life can be good, Life can be bad, Life is mostly cheerful, But sometimes sad.Life can be dreams, ' \
          'Life can be great thoughts; Life can mean a person, Sitting in court. Life can be dirty, Life can even be ' \
          'painful; But life is what you make it, So try to make it beautiful. '
poem_list = poem_EN.split()
p_dict = {}
for item in poem_list:
    if item[-1] in ',.\'";':
        item = item[:-1]
    p_dict[item] = p_dict.get(item, 0) + 1
print(p_dict)
