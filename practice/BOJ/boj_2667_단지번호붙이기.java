import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] grid;

    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(st.nextToken());
        grid = new int[N][N];

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] str = reader.readLine().split("");
            for (int j = 0; j < str.length; j++) {
                grid[i][j] = Integer.parseInt(str[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 1) {
                    result.add(dfs(i, j));
                }
            }
        }

        System.out.println(result.size());

        for (int num : result.stream().sorted().mapToInt(Integer::intValue).toArray()) {
            System.out.println(num);
        }

        reader.close();
    }

    static int dfs(int y, int x) {
        grid[y][x] = 0;
        int count = 1;

        for (int i = 0; i < dx.length; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if (grid[ny][nx] == 1) {
                    count += dfs(ny, nx);
                }
            }
        }
        return count;
    }
}