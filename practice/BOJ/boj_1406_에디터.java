import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int cursor;
    static List<String> str;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        str = new ArrayList<>();
        str.add(st.nextToken());
        cursor = str.size();
        st = new StringTokenizer(reader.readLine());

        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            String command = st.nextToken();
            String adding = st.nextToken();

            if (command == "P") {
                System.out.println(adding);
                str.add(cursor, adding);
                cursor++;
            } else if (command == "L") {
                if (cursor > 0)
                    cursor--;
            } else if (command == "D") {
                if (cursor < str.size())
                    cursor++;
            } else if (command == "B") {
                if (cursor > 0) {
                    str.remove(--cursor);
                    cursor++;
                }
            }

        }

        System.out.println(str);
    }
}
