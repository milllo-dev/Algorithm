import java.io.*;
import java.util.*;

public class 일이될때까지 {
    static int N, K;
    public static void main(String[] args) throws IOException {
        int result = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        while(N != 1) {
            if(N % K == 0) {
                N = (N / K);
            } else {
                N -= 1;
            }
            result++;
        }

        System.out.println(result);
        reader.close();
    }
}
