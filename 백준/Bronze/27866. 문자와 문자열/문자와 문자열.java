import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        
        StringTokenizer st1 = new StringTokenizer(reader.readLine());
        int i = Integer.parseInt(st1.nextToken());
        
        System.out.println(s.substring((i-1), i));
        
        reader.close();
    }
    
    public static void main(String[] args) throws IOException {
        solution();
    }
}