import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st0 = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st0.nextToken());

        int[] arr = new int[n];

        StringTokenizer st1 = new StringTokenizer(reader.readLine());

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st1.nextToken());

            max = Math.max(max, value);
            min = Math.min(min, value);
        }

        System.out.printf("%d %d\n", min, max);

        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}