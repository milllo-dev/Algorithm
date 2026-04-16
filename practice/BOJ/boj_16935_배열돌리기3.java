
import java.io.*;
import java.util.*;

public class boj_16935_배열돌리기3 {
    static int N, M, R;
    static int[][] matrix;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st0 = new StringTokenizer(reader.readLine(), " ");

        N = Integer.parseInt(st0.nextToken());
        M = Integer.parseInt(st0.nextToken());
        R = Integer.parseInt(st0.nextToken());

        matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer st1 = new StringTokenizer(reader.readLine(), " ");
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        st0 = new StringTokenizer(reader.readLine(), " ");
        for (int i = 0; i < R; i++) {
            switch (Integer.parseInt(st0.nextToken())) {
                case 1:
                    one();
                case 2:
                    two();
                case 3:
                    three();
                case 4:
                    forth();
                case 5:
                    clock();
                case 6:
                    unClock();
            }
        }

        reader.close();

        // 결과 출력
        StringBuilder sb = new StringBuilder();

        for (int[] outArr : matrix) {
            for (int intVar : outArr) {
                sb.append(intVar).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void one() {
        // 1. n1 + n2 = n-1 인 행 끼리 swap
        for (int i = 0; i < matrix.length / 2; i++) {
            int diff = (N - 1) - i;
            int[] swap = matrix[diff];
            matrix[diff] = matrix[i];
            matrix[i] = swap;
        }
    }

    public static void two() {
        // 2. m1 + m2 = m-1
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int diff = (M - 1) - j;
                int swap = matrix[i][j];
                matrix[i][j] = matrix[i][diff];
                matrix[i][diff] = swap;
            }
        }
    }

    public static void three() {
        // 3. 시계방향 90도
        int[][] result = new int[M][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int diff = N - 1 - i;
                result[j][diff] = matrix[i][j];
            }
        }

        int tmp = M;
        M = N;
        N = tmp;
        matrix = result;
    }

    public static void forth() {
        int[][] result = new int[M][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int diff = M - 1 - j;
                result[diff][i] = matrix[i][j];
            }
        }

        int tmp = M;
        M = N;
        N = tmp;
        matrix = result;
    }

    // 시계방향으로 돌리기
    public static void clock() {
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < M / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[N / 2 + i][j];
                matrix[N / 2 + i][j] = matrix[N / 2 + i][M / 2 + j];
                matrix[N / 2 + i][M / 2 + j] = matrix[i][M / 2 + j];
                matrix[i][M / 2 + j] = tmp;
            }
        }
    }

    // 반시계 방향으로 돌리기
    public static void unClock() {
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < M / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][M / 2 + j];
                matrix[i][M / 2 + j] = matrix[N / 2 + i][M / 2 + j];
                matrix[N / 2 + i][M / 2 + j] = matrix[N / 2 + i][j];
                matrix[N / 2 + i][j] = tmp;
            }
        }
    }
}