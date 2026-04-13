import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");

        // result
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < alphabet.length; i++) {
            result.put(alphabet[i], -1);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = reader.readLine().split("");

        for (int j = 0; j < str.length; j++) {
            if (result.get(str[j]) != -1) {
                continue;
            }
            result.put(str[j], j);
        }

        for (int value : result.values()) {
            writer.write(value + " ");
        }

        writer.flush();
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}