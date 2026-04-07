import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st0 = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(st0.nextToken());

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < t; i++) {
            StringTokenizer st1 = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            writer.write(String.format("Case #%d: %d + %d = %d\n", i + 1, a, b, a + b));
        }

        writer.flush();
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}