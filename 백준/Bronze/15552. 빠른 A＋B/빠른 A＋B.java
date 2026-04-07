import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws IOException {
        // java의 빠른 입출력
        // 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간 초과가 날 수 있다고 한다.
        // java의 경우 Scanner -> BufferedReader / System.out.println() -> BufferedWriter를 바꿔 사용
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(st1.nextToken());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            writer.write((a + b) + "\n");
        }

        writer.flush();
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}