#include <stdio.h>

//C语言不允许函数的嵌套定义
//如果是空参数，建议加上void
void cheer(void);

int main() {
    //TODO:这样调用，不会出现结果，为什么呢？
    //TODO:学到指针，再看
    cheer;
    return 0;
}

void cheer() {
    printf("cheer!");
}