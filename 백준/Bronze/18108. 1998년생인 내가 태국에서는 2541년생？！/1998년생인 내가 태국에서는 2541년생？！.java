import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int year = Integer.parseInt(str);
        System.out.print(year - 543);
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
