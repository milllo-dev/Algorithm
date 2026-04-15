import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int max = 0;
        int row = 0;
        int col = 0;
        int[][] matrix = new int[9][9];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < 9; i++) {
            String[] str = reader.readLine().split(" ");
            for(int j = 0; j < str.length; j++) {
                int num = Integer.parseInt(str[j]);
                matrix[i][j] = num;
                if(max < num) {
                    max = num;
                    row = i;
                    col = j;
                }
            }
        }
        
        System.out.println(max);
        System.out.println((row+1) + " " + (col+1));
        
        reader.close();
    }
}