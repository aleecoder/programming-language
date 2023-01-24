import os
import shutil


# 统计文件的行数
def fileLinesCount(filename):
    try:
        with open(filename) as f:
            data = f.readlines()
    except Exception as err:
        print(err)
    lens = len(data)
    print(filename.split('\\')[0] + ' has ' + str(lens) + ' lines. ')


if __name__ == '__main__':
    path = './'
    out_path = './output'
    for file_name in os.listdir(path):
        if file_name.endswith('.txt'):
            file_path = os.path.join(path, file_name)
            fileLinesCount(file_path)
            if os.path.exists(out_path):
                shutil.rmtree(out_path)
            os.makedirs(out_path)
