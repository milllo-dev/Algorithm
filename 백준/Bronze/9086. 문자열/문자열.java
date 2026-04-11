import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st0 = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(st0.nextToken());

        for (int i = 0; i < t; i++) {
            String[] str = reader.readLine().split("");
            writer.write(str[0] + str[str.length - 1] + "\n");
        }

        writer.flush();
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}