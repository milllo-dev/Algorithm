import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        for (String prefix : croatia) {
            input = input.replace(prefix, "#");
        }

        System.out.println(input.length());
        reader.close();
    }
}