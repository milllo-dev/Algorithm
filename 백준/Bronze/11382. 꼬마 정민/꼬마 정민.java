import java.util.*;
import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        
        // 자료형 허용 범위 수를 제대로 파악하고 사용할 것.
        // 1 ~ 10^12까지가 입력 수의 범위
        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());
        Long c = Long.parseLong(st.nextToken());
        System.out.printf("%d", (a + b + c));
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}