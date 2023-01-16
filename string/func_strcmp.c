#include <stdio.h>
#include <string.h>

//int strcmp(const char *s1,const char *s2);
//比较两个字符串，返回
//  0: s1==s2
//  1: s1>s2
//  -1: s1<s2
int _strcmp(const char *s1, const char *s2) {
    while (*s1 == *s2 && *s1 != '\0') {
        s1++;
        s2++;
    }
    return *s1 - *s2 > 0 ? 1 : *s1 - *s2 == 0 ? 0 : -1;
}

int main() {
    char s1[] = "abc";
    char s2[] = "cabc";
//    int res = strcmp(s1, s2);
    int res = _strcmp(s1, s2);
    printf("%d :: ", res);
    switch (res) {
        case 0:
            printf("s1=s2");
            break;
        case 1:
            printf("s1>s2");
            break;
        case -1:
            printf("s1<s2");
            break;
    }
    return 0;
}