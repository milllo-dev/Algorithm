class Solution {
    public void solveSudoku(char[][] board) {
        char[][] copy = new char[board.length][];

        for(int i = 0; i < board.length; i++) {
            copy[i] = board[i].clone();
        }

        backTracking(copy, 0);

        for(int i = 0; i < board.length; i++) {
            board[i] = copy[i].clone();
        }
    }

    private boolean backTracking(char[][] board, int n) {
        // 81개 격자 모두 확인
        if(n == 81) {
            return true;
        }

        int row = n / 9;
        int col = n % 9;

        // 격자가 빈 공간인 경우 다음 격자 확인
        if(board[row][col] != '.') {
            return backTracking(board, n + 1);
        } else {
            for(int i = 0; i < 9; i++) {
                char nextValue = (char)(49 + i);

                // 현재 위치에 선택한 수가 유효한지 체크
                if(!isValid(board, row, col, nextValue)) continue;

                board[row][col] = nextValue;

                if(backTracking(board, n + 1)) return true;

                // 값이 해당 위치에 맞지 않는다면 다시 빈 칸으로 변경
                board[row][col] = '.';
            }
        }

        return false;
    }

    private boolean isValid(char[][] board, int row, int col, char value) {
        // row check
        for(int i = 0; i < 9; i++) {
            if(board[i][col] == value) return false;
        }

        for(int i = 0; i < 9; i++) {
            if(board[row][i] == value) return false;
        }

        int subRow = (row / 3) * 3;
        int subCol = (col / 3) * 3;

        for(int dr = 0; dr < 3; dr++) {
            for(int dc = 0; dc < 3; dc++) {
                if(board[subRow + dr][subCol + dc] == value) return false;
            }
        }

        return true;
    }
}