import java.util.*;

class Solution {
    static int m, n;
    static int[] xp = { 0, 0, 1, -1 };
    static int[] yp = { 1, -1, 0, 0 };

    static char[] bucket;
    static boolean[][] isVisited;

    public static boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;

        isVisited = new boolean[m][n];
        bucket = new char[word.length()];

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (check(0, word, i, j, board)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean check(int idx, String word, int x, int y, char[][] board) {
        if (idx == word.length()) {
            System.out.println(Arrays.toString(bucket));
            return true;
        }

        // 1. 유효성 검사 (이동할 수 있는 위치인지?)
        // 2. 이미 방문한 위치인지?
        // 3. 현재 board의 character가 비교군 word의 문자와 같은지
        if (!isValid(x, y) || isVisited[y][x] || board[y][x] != word.charAt(idx)) {
            return false;
        }

        isVisited[y][x] = true;
        bucket[idx] = board[y][x];

        for (int k = 0; k < 4; k++) {
            int dx = x + xp[k];
            int dy = y + yp[k];

            if (check(idx + 1, word, dx, dy, board)) {
                return true;
            }
        }

        isVisited[y][x] = false;

        return false;
    }

    private static boolean isValid(int x, int y) {
        if (x >= 0 && x < n && y >= 0 && y < m) {
            return true;
        }
        return false;
    }
}