import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String line = reader.readLine();
            if (line == null)
                break;
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            writer.write((a + b) + "\n");
        }

        writer.flush();
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}