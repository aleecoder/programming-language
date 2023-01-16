#include <stdio.h>
#include "student.h"

void read(FILE *fp, int index);

int main() {
    FILE *fp = fopen("student.data", "r");
    if (fp) {
        fseek(fp, 0L, SEEK_END);
        long size = ftell(fp);
        int number = size / sizeof(Student);
        int index = 0;
        printf("There are %d data in total,check which: ", number);
        scanf("%d", &index);
        read(fp, index - 1);
        fclose(fp);
    }
    return 0;
}

void read(FILE *fp, int index) {
    fseek(fp, index * sizeof(Student), SEEK_SET);
    Student s;
    if (fread(&s, sizeof(Student), 1, fp) == 1) {
        printf("The %dth student:\n", index + 1);
        printf("\tname:%s\n", s.name);
        printf("\tgender:");
        switch (s.gender) {
            case 0:
                printf("man\n");
                break;
            case 1:
                printf("woman\n");
                break;
            default:
                printf("don't know\n");
        }
        printf("\tage:%d\n", s.age);
    }
}