import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        int[] whole = {1, 1, 2, 2, 2, 8};
        int[] result = new int[6];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        for(int i = 0; i < 6; i++) {
            int cnt = Integer.parseInt(st.nextToken());
            writer.write((whole[i] - cnt) + " ");
        }
        
        writer.flush();
        reader.close();
    }
    
    public static void main(String[] args) throws IOException {
        solution();    
    }
}