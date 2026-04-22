import java.io.*;
import java.util.*;

public class Main {
    static int N = 9;
    static int R = 7;
    static int[] input;
    static int[] results;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        input = new int[N];
        results = new int[R];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            input[i] = Integer.parseInt(st.nextToken());
        }

        combination(0, 0);
    }

    private static void combination(int idx, int start) throws IOException {
        if (idx >= R) {
            int sum = Arrays.stream(results).sum();
            if (sum == 100) {
                for (int i : results) {
                    System.out.println(i);
                }
            }
            return;
        }
        for (int i = start; i < N; i++) {
            results[idx] = input[i];
            combination(idx + 1, i + 1);
        }
    }
}