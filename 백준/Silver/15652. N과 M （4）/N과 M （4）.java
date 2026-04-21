import java.io.*;
import java.util.*;

public class Main {
    static int N, R;
    static int[] input;
    static int[] results;

    private static void combination(int idx, int start) throws IOException {
        if (idx >= R) {
            for (int i = 0; i < results.length; i++) {
                System.out.print(results[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < N; i++) {
            results[idx] = input[i];
            combination(idx + 1, i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        input = new int[N];
        results = new int[R];

        for (int i = 0; i < N; i++) {
            input[i] = i + 1;
        }

        combination(0, 0);

        reader.close();
    }
}
