import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        String rawlfNum = st.nextToken();
        String rawrgNum = st.nextToken();

        StringBuilder leftSB = new StringBuilder(rawlfNum);
        leftSB.reverse();
        int left = Integer.parseInt(leftSB.toString());
        StringBuilder rightSB = new StringBuilder(rawrgNum);
        rightSB.reverse();
        int right = Integer.parseInt(rightSB.toString());

        System.out.println(left < right ? right : left);

        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}