import java.util.*;
import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[1]);
        System.out.print(a / b);
    }
    
    public static void main(String[] args) throws IOException {
        solution();
    }
}