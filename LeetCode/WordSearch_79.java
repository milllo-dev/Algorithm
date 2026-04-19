class Solution {
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static char[][] b;
    static String wrd;
    static boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        b = board;
        wrd = word;

        visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                visited[i][j] = false;
            }
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(solution(i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean solution (int x, int y, int w) {
        boolean result = false;

        if(!visited[x][y] && (b[x][y] == wrd.charAt(w))) {
            if(w == (wrd.length() - 1)) {
                return true;
            }

            visited[x][y] = true;

            for(int i = 0; i < dx.length; i++) {
                if(isPossible(x + dx[i], y + dy[i])) {
                        if(solution(x + dx[i], y + dy[i], w + 1)) {
                            result = true;
                        }
                }
            }

            visited[x][y] = false;
        }

        return result;
    }

    static boolean isPossible(int x, int y) {
        if(x >= 0 && x < b.length && y >= 0 && y < b[0].length) {
            return true;
        }
        return false;
    }
}