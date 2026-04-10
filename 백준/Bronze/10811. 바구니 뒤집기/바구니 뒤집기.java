import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st0 = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st0.nextToken());
        int m = Integer.parseInt(st0.nextToken());

        int[] bucket = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            bucket[i] = i + 1;
        }

        for (int j = 0; j < m; j++) {
            StringTokenizer st1 = new StringTokenizer(reader.readLine());
            int startNum = Integer.parseInt(st1.nextToken()) - 1;
            int endNum = Integer.parseInt(st1.nextToken()) - 1;

            reverse(bucket, startNum, endNum);
        }

        for (int num : bucket) {
            System.out.print(num + " ");
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void reverse(int[] arr, int start, int end) {
        while ((start) < (end)) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;

            start++;
            end--;
        }
    }
}