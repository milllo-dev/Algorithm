import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        int cnt = 0;
        int max = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int num = Integer.parseInt(st.nextToken());
            if(max < num) {
                max = num;
                cnt = i+1;
            }
        }
       
        System.out.println(max);
        System.out.println(cnt);
        reader.close();
    }
    
    public static void main(String[] args) throws IOException {
        solution();
    }
}