import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] input;
    static int[] numbers;
    static boolean[] isSelected;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new int[N];
        isSelected = new boolean[N];
        numbers = new int[M];

        for (int i = 0; i < N; i++) {
            input[i] = i + 1;
        }

        reader.close();

        permutation(0);
    }

    private static void permutation(int idx) throws IOException {
        if (idx >= M) {
            for (int i = 0; i < M; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isSelected[i])
                continue;
            numbers[idx] = input[i];
            isSelected[i] = true;
            permutation(idx + 1);
            isSelected[i] = false;
        }
    }
}