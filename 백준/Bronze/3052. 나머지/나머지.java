import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        int b = 42;
        Set<Integer> set = new HashSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int num = Integer.parseInt(st.nextToken());

            int divNum = num % b;
            set.add(divNum);
        }

        System.out.println(set.size());
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}