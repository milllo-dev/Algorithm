import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        String qr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\\$%*+-./:";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st0 = new StringTokenizer(reader.readLine());
        int cnt = Integer.parseInt(st0.nextToken());

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st1 = new StringTokenizer(reader.readLine());
            int testCnt = Integer.parseInt(st1.nextToken());
            String[] strArr = st1.nextToken().split("");
            multiple(strArr, testCnt, writer);
        }

        writer.flush();
        reader.close();
    }

    public static void multiple(String[] arr, int count, BufferedWriter writer) throws IOException {
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < count; k++) {
                writer.write(arr[j]);
            }
        }
        writer.write("\n");
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}