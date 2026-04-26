import java.io.*;
import java.util.*;

/*
    - 각 팀의 능력치 합을 계산해 차이의 최솟값을 구하는 문제
    - N명을 두 팀으로 정확히 N/2명씩 나누는 모든 경우의 수를 탐색
    - N <= 20 -> 최대 경우의 수는 20C10 = 184,756 -> 완전탐색 가능
    - 순서 상관없는 팀 나누기 -> 조합 문제
    - 비트마스킹으로도 가능
    - DFS 개념으로 조합 생성하는 방식이 정석
*/

public class Main {
    static int N;
    static int[][] grid;
    static boolean[] team;

    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(st.nextToken());
        grid = new int[N][N];
        team = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        recursion(0, 0);

        reader.close();

        System.out.println(min);
    }

    private static void recursion(int cnt, int start) {
        // base case
        if (cnt == N / 2) {
            int sum0 = 0;
            int sum1 = 0;

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (team[i] && team[j])
                        sum1 += grid[i][j] + grid[j][i];
                    if (!team[i] && !team[j])
                        sum0 += grid[i][j] + grid[j][i];
                }
            }

            min = Math.min(min, Math.abs(sum0 - sum1));
            return;
        }

        for (int i = start; i < N; i++) {
            team[i] = true;
            recursion(cnt + 1, i + 1);
            team[i] = false;
        }
    }
}