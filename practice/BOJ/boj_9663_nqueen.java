import java.util.*;

public class boj_9663_nqueen {
    static int N, count;
    static int[] chess; // 가로 제외 -> index == row, chess[index] == column, chess[1] = 3; -> 1행3열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        chess = new int[N];

        sc.close();

        nQueen(0); // dfs - depth

        System.out.println(count);
    }

    private static boolean play(int i) { // i : row 번호
        for (int j = 0; j < i; j++) {
            if ((chess[i] == chess[j]) // 같은 열 번호 비교
                    || (Math.abs(chess[i] - chess[j]) == Math.abs(i - j)) // 같은 대각선 비교
            ) {
                return false;
            }
        }
        return true;
    }

    private static void nQueen(int depth) {
        if (depth > 0 && !play(depth - 1)) { // backtracking - 가지치기 -> 완전탐색 방지
            return;
        }

        if (depth >= N) { // 퀸이 N개 만큼 놓임
            count++;
            return;
        }

        for (int col = 0; col < N; col++) { // depth : 행, chess[depth] : 열
            chess[depth] = col;
            nQueen(depth + 1);
        }
    }
}
