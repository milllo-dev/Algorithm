import java.io.*;
import java.util.*;


public class Main {
    public static void solution() throws IOException {
        List result = new ArrayList<Integer>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        StringTokenizer st1 = new StringTokenizer(reader.readLine());
        for(int i = 0; i < n; i++) {
            int lx = Integer.parseInt(st1.nextToken()); 
            
            if (lx < x) {
                //result.add(lx);
                writer.write(lx + " ");
            }
        }
        writer.flush();
        reader.close();
    }
    
    public static void main(String[] args) throws IOException {
        solution();
    }
    
}