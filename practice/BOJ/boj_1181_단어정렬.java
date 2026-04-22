import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static String[] words;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(st.nextToken());
        words = new String[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            words[i] = st.nextToken();
        }

        String[] secondSorted = Arrays.stream(words)
                .sorted(Comparator.comparingInt(String::length).thenComparing(s -> s)).toArray(String[]::new);

        String[] dupCheck = Arrays.stream(secondSorted).distinct().toArray(String[]::new);

        for (String str : dupCheck) {
            System.out.println(str);
        }
    }
}