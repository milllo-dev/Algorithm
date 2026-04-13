import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        int result = 0;

        String[] str = { "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "" };
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = reader.readLine().split("");

        for (int j = 0; j < inputStr.length; j++) {
            for (int i = 0; i < str.length; i++) {
                if (str[i].contains(inputStr[j])) {
                    result += (i + 2);
                }
            }
        }

        System.out.println(result);
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}