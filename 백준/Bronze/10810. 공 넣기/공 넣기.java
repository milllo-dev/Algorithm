import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        int cnt = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st0 = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st0.nextToken());
        int m = Integer.parseInt(st0.nextToken());

        int[] bucket = new int[n];

        while (cnt < m) {
            StringTokenizer st1 = new StringTokenizer(reader.readLine());
            int i = Integer.parseInt(st1.nextToken());
            int j = Integer.parseInt(st1.nextToken());
            int k = Integer.parseInt(st1.nextToken());

            for (int o = i - 1; o < j; o++) {
                bucket[o] = k;
            }
            cnt++;
        }

        for (int l = 0; l < bucket.length; l++) {
            writer.write(bucket[l] + " ");
        }

        writer.flush();
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}