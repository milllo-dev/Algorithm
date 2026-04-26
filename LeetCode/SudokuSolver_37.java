import java.io.*;
import java.util.*;

public class SudokuSolver_37 {
    public static void main(String[] args) throws IOException {

    }

    public static void solveSudoku(char[][] board) {
        // 1. 행 내 숫자는 중복되지 않게 1 ~ 9 까지의 수를 담는다
        // 2. 열 내 숫자는 중복되지 않게 1 ~ 9 까지의 수를 담는다
        // 3. 3x3 격자 내 숫자는 중복되지 않게 1 ~ 9 까지의 수를 담는다
        // fin. 위 모든 제약 조건을 만족하면서 중복되지 않아야 한다
    }

    public static boolean backtracking(char[][] board, int n) throws IOException {
        // base case
        // 9x9 총 81칸의 수를 확인한다
        if (n == 81) {
            return true;
        }

        // 0x0 부터 8x9까지 차례로 확인
        int row = n / 9, col = n % 9;

        // 해당 격자가 빈 값이 아닌 경우 다음 격차를 탐색한다 (재귀함수 호출)
        if (board[row][col] != '.')
            return backtracking(board, n + 1);
        else {
            // 빈 값인 경우 1 ~ 9까지의
            for (int i = 0; i < 9; i++) {
                char nextValue = (char) (49 + i);
                if (!isFilled(board, row, col, nextValue))
                    continue;
                board[row][col] = nextValue;
                if (backtracking(board, n + 1))
                    return true;
                board[row][col] = '.';
            }
        }
        return false;
    }

    private static boolean isFilled(char[][] board, int row, int col, char value) {
        // 열(column)을 순회하며 유효성 검사
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == value)
                return false;
        }

        // 행(row)을 순회하며 유효성 검사
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == value)
                return false;
        }

        int subRow = (row / 3) * 3;
        int subCol = (col / 3) * 3;

        // 3x3 격자 내 유효성 검사
        for (int dr = 0; dr < 3; dr++) {
            for (int dc = 0; dc < 3; dc++) {
                if (board[subRow + dr][subCol + dc] == value)
                    return false;
            }
        }

        return true;
    }
}