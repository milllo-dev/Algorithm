import java.util.*;
import java.io.*;

public class Main {
    static List<String> list = new LinkedList<>();
    static int N;
    static int cursor;
    static String[] testCase;
    static boolean isLast;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(st.nextToken());
        testCase = new String[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine());
            testCase[i] = st.nextToken();
        }

        Arrays.toString(args);

        for (String s : testCase) {
            validate(s);
            System.out.println(String.join("", list));
        }
    }

    private static void validate(String s) {
        cursor = 0;
        list = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c == '<') {
                if (cursor > 0)
                    cursor--;
            } else if (c == '>') {
                if (cursor < list.size())
                    cursor++;
            } else if (c == '-') {
                if (cursor > 0) {
                    list.remove(cursor - 1);
                    cursor--;
                }
            } else {
                list.add(cursor, String.valueOf(c));
                cursor++;
            }
        }
    }
}
