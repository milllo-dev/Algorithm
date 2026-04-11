import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        int result = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st0 = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st0.nextToken());

        String[] str = reader.readLine().split("");
        for (int i = 0; i < n; i++) {
            result += Integer.parseInt(str[i]);
        }

        System.out.println(result);

        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}