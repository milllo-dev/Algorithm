import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = reader.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] aMatrix = new int[n][m];
        int[][] bMatrix = new int[n][m];

        for (int i = 0; i < n * 2; i++) {
            String[] raw = reader.readLine().split(" ");
            for (int j = 0; j < raw.length; j++) {
                int num = Integer.parseInt(raw[j]);
                if (i < n) {
                    aMatrix[i % n][j] = num;
                } else {
                    bMatrix[i % n][j] = num;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                System.out.print(aMatrix[k][l] + bMatrix[k][l] + " ");
            }
            System.out.println();
        }

        reader.close();
    }
}