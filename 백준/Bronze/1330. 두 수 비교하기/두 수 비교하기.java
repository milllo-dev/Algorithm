import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b)
            System.out.print(">");
        else if (a < b)
            System.out.print("<");
        else
            System.out.print("==");
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}