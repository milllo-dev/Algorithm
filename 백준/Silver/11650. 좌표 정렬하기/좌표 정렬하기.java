import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] pos;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(st.nextToken());
        pos = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            pos[i][0] = Integer.parseInt(st.nextToken());
            pos[i][1] = Integer.parseInt(st.nextToken());
        }

        int[][] sorted = Arrays.stream(pos).sorted((o1, o2) -> {
            int result = Integer.compare(o1[0], o2[0]);
            if (result != 0)
                return result;

            return Integer.compare(o1[1], o2[1]);
        }).toArray(int[][]::new);

        for (int[] arr : sorted) {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}