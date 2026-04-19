
import java.io.*;
import java.util.*;

public class 큰수의법칙 {

    static int N, M, K;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        int result = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortedArr = Arrays.stream(arr).sorted().toArray();

        System.out.println(Arrays.toString(sortedArr));
        
        int max1 = sortedArr[N - 1];
        int max2 = sortedArr[N - 2];

        while (M >= 1) {
            for (int i = 0; i < K; i++) {
                result += max1;
                M--;
            }

            result += max2;
            M--;
        }

        System.out.println(result);

        reader.close();

    }
}
