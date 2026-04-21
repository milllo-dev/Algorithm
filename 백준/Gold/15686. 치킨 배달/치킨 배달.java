import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] grid;

    static int min = Integer.MAX_VALUE;

    // 선택된 치킨집 인덱스
    static int[] selected;

    // 가정집 위치
    static List<int[]> home;
    // 치킨집 위치
    static List<int[]> chicken;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        grid = new int[N][N];

        home = new ArrayList<>();
        chicken = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            for (int j = 0; j < N; j++) {

                int value = Integer.parseInt(st.nextToken());
                grid[i][j] = value;

                if (value == 2) {
                    chicken.add(new int[] { i, j });
                } else if (value == 1) {
                    home.add(new int[] { i, j });
                }
            }
        }

        reader.close();

        // 치킨집 선택 개수
        selected = new int[M];

        combination(0, 0);

        System.out.println(min);
    }

    private static void combination(int idx, int start) {
        // 치킨집은 M개 선택가능
        if (idx == M) {
            int total = 0;

            // 집 위치별 치킨집 까지의 거리 비교
            for (int i = 0; i < home.size(); i++) {

                // 가정집 위치 좌표
                int hx = home.get(i)[0];
                int hy = home.get(i)[1];

                int minDist = Integer.MAX_VALUE;

                // M개의 치킨집 마다 가정집까지의 거리를 각각 비교
                for (int j = 0; j < M; j++) {
                    // 선택된 치킨집 위치 좌표
                    int[] c = chicken.get(selected[j]);

                    // 거리는 양수 -> 절대값 비교
                    int dist = Math.abs(hx - c[0]) + Math.abs(hy - c[1]);
                    minDist = Math.min(minDist, dist);
                }

                // 선택한 치킨집과 각 가정집까지의 거리를 누적합산
                total += minDist;
            }

            // 누적합산 거리와 최소값을 비교해서 그 중 더 작은 값을 리턴
            min = Math.min(total, min);
            // 즉, 치킨집별 각 가정집까지의 거리를 전부 누적 합산해서 현재 최솟값과 비교
            return;
        }

        // 치킨집 선택하기 -> 조합 생성
        // 즉, 치킨집을 선택하고, 해당 치킨집과 각 가정집까지의 조합 생성
        for (int k = start; k < chicken.size(); k++) {
            selected[idx] = k;
            combination(idx + 1, k + 1);
        }
    }
}