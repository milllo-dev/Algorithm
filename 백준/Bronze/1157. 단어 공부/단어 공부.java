import java.io.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int count = 0;
        String maxKey = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split("");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            map.put(str[i].toUpperCase(), map.getOrDefault(str[i].toUpperCase(), 0) + 1);
        }

        int max = Collections.max(map.values());

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == max) {
                count++;
                maxKey = e.getKey();
            }
        }

        System.out.println(count > 1 ? "?" : maxKey);
        reader.close();
    }
}