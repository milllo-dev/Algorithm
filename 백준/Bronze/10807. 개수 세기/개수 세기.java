import java.util.*;
import java.io.*;

public class Main {
    public static void solution() throws IOException {
        int result = 0;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int[] intArr = new int[n];
        
        StringTokenizer st1 = new StringTokenizer(reader.readLine());
        
        for(int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(st1.nextToken());
        }
        
        StringTokenizer st2 = new StringTokenizer(reader.readLine());
        int v = Integer.parseInt(st2.nextToken());
        
        for(int j = 0; j < intArr.length; j++) {
            if(intArr[j] == v) {
                result+=1;
            }
        }
        
        System.out.print(result);
        
        reader.close();
    }
    
    public static void main(String[] args) throws IOException {
        solution();    
    }
}