import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] input;
    static int[] numbers;

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new int[N];
        numbers = new int[M];

        for (int i = 0; i < N; i++) {
            input[i] = i + 1;
        }

        reader.close();

        permutation(0);

        bw.flush();
        bw.close();
    }

    private static void permutation(int idx) throws IOException {
        if (idx >= M) {
            for (int i = 0; i < M; i++) {
                bw.write(numbers[i] + " ");
                // System.out.print(numbers[i] + " ");
            }
            // System.out.println();
            bw.newLine();
            return;
        }

        for (int i = 0; i < N; i++) {

            numbers[idx] = input[i];
            permutation(idx + 1);
        }
    }
}