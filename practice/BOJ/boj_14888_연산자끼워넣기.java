import java.io.*;
import java.util.*;

public class Main {
    // Permutation 함정 문제
    // 완전탐색, BackTracking, DFS, Recursion
    static int N;
    static int[] numbers; // 수의 배열
    static int[] operators; // 연산자 배열
    static int[] results;
    static int max = -1_000_000_000;
    static int min = 1_000_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        N = Integer.parseInt(st.nextToken());
        numbers = new int[N];
        operators = new int[4]; // 더하기, 빼기, 곱하기, 나누기

        st = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1, numbers[0]); // 다음 계산 번지, 중간 합계 값

        System.out.println(max);
        System.out.println(min);

        reader.close();
    }

    private static void dfs(int idx, int sum) throws IOException { // 다음 계산 번지, 중간 합계 값
        // base case
        if (idx == N) {
            min = Math.min(min, sum);
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                // 연산 시작
                operators[i]--;

                if (i == 0)
                    dfs(idx + 1, sum + numbers[idx]);
                if (i == 1)
                    dfs(idx + 1, sum - numbers[idx]);
                if (i == 2)
                    dfs(idx + 1, sum * numbers[idx]);
                if (i == 3)
                    dfs(idx + 1, sum / numbers[idx]);

                // 연산이 끝난 후 다시 원상복귀 해야함
                operators[i]++;
            }
        }

    }
}
