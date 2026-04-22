import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        bw.write((int) (Math.pow(2, N) - 1) + "\n");

        recursion(N, 1, 2, 3);

        bw.flush();

        br.close();
        bw.close();
    }

    public static void recursion(int n, int x, int z, int y) throws IOException {
        if (n == 1) {
            bw.write(x + " " + y + "\n");
            return;
        }

        recursion(n - 1, x, z, y);
        bw.write(x + " " + y + "\n");
        recursion(n - 1, z, x, y);
    }
}