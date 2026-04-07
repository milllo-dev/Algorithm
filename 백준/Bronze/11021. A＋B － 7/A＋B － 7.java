import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(st.nextToken());

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < t; i++) {
            StringTokenizer st0 = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st0.nextToken());
            int b = Integer.parseInt(st0.nextToken());
            writer.write("Case #" + (i + 1) + ": " + (a + b) + "\n");
        }

        writer.flush();
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}