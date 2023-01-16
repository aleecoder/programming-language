#include <stdio.h>

#define SIZE 3
#define WINNER_O 0
#define WINNER_X 1
#define WINNER_And -1

int calRowAndCol(int board[SIZE][SIZE]);

int calDiag(int board[SIZE][SIZE]);

void showResult(int rrc, int rd);

//读入#字棋矩阵，判断玩家输赢情况
int main() {
    int board[SIZE][SIZE];
    //读入矩阵
    for (int i = 0; i < SIZE; ++i) {
        for (int j = 0; j < SIZE; ++j) {
            scanf("%d", &board[i][j]);
        }
    }
    //输出结果
    showResult(calRowAndCol(board), calDiag(board));
    return 0;
}

int calRowAndCol(int board[SIZE][SIZE]) {
    int result = WINNER_And;
    for (int i = 0; i < SIZE; i++) {
        int numOfRowO = 0, numOfColO = 0;
        int numOfRowX = 0, numOfColX = 0;
        for (int j = 0; j < SIZE; j++) {
            //检查行
            if (board[i][j] == 0) numOfRowO++;
            else numOfRowX++;
            //检查列
            if (board[j][i] == 0) numOfColO++;
            else numOfColX++;
        }
        //统计结果
        if (numOfRowO == SIZE || numOfColO == SIZE) {
            result = WINNER_O;
            break;
        }
        if (numOfRowX == SIZE || numOfColX == SIZE) {
            result = WINNER_X;
            break;
        }
    }
    return result;
}

int calDiag(int board[SIZE][SIZE]) {
    int result = WINNER_And;
    int numOfMDiagO = 0, numOfMDiagX = 0;
    int numOfDiagO = 0, numOfDiagX = 0;
    for (int i = 0; i < SIZE; ++i) {
        //检查主对角线
        if (board[i][i] == 0) numOfMDiagO++;
        else numOfMDiagX++;
        //检查副对角线
        if (board[i][SIZE - i - 1] == 0) numOfDiagO++;
        else numOfDiagX++;
    }
    if (numOfDiagO == SIZE || numOfMDiagO == SIZE) {
        result = WINNER_O;
    }
    if (numOfDiagX == SIZE || numOfMDiagX == SIZE) {
        result = WINNER_X;
    }
    return result;
}

void showResult(int rrc, int rd) {
    if (rrc == WINNER_O || rd == WINNER_O) {
        printf("The winner is O!");
    } else if (rrc == WINNER_X || rd == WINNER_X) {
        printf("The winner is X!");
    } else {
        printf("It's a and bureau!");
    }
}