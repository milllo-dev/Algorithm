import java.io.*;
import java.util.*;

public class Main {
    static int N; // nPn : n개의 숫자 중 n개를 추출 (순서 있음)
    static int[] input;
    static int[] number;
    static boolean[] isSelected;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(st.nextToken());
        isSelected = new boolean[N];
        input = new int[N];
        number = new int[N];

        reader.close();

        for (int i = 0; i < N; i++)
            input[i] = i + 1;

        solution(0);

    }

    public static void solution(int idx) throws IOException {
        if (idx >= N) {
            for (int i = 0; i < N; i++) {
                System.out.print(number[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isSelected[i])
                continue;
            number[idx] = input[i];
            isSelected[i] = true;
            solution(idx + 1);
            isSelected[i] = false;
        }
    }
}