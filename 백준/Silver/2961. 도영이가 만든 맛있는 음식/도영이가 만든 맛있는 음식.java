import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int min = Integer.MAX_VALUE;
    static int[][] ingred;
    static boolean[] isSelected;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(st.nextToken());

        ingred = new int[N][2];
        isSelected = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            ingred[i][0] = Integer.parseInt(st.nextToken());
            ingred[i][1] = Integer.parseInt(st.nextToken());
        }

        subset(0);
        System.out.println(min);
    }

    private static void subset(int idx) {
        if (idx >= N) {
            int sours = 1;
            int bitters = 0;
            for (int i = 0; i < N; i++) {
                if (isSelected[i]) {
                    sours *= ingred[i][0];
                    bitters += ingred[i][1];
                }
            }

            // 공집합 제외
            if (bitters == 0)
                return;

            int result = Math.abs(sours - bitters);
            min = Math.min(result, min);
            return;
        }

        isSelected[idx] = true;
        subset(idx + 1);
        isSelected[idx] = false;
        subset(idx + 1);
    }
}