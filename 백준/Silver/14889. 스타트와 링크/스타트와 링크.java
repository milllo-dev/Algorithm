import java.io.*;
import java.util.*;

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