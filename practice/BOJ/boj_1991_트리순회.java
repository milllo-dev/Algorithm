import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static String root;
    static String left;
    static String right;
    static Map<String, List<String>> map;

    public static void main(String[] args) throws IOException {
        map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            root = st.nextToken();
            left = st.nextToken();
            right = st.nextToken();

            List<String> sub = new ArrayList<>();
            sub.add(left);
            sub.add(right);

            map.put(root, sub);
        }

    }

    private static void foward() {

    }

    private static void middle() {

    }

    private static void backward() {

    }
}