import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        int cnt = 0;
        int flag = 0;
        int min = 30;
        int[] arr = new int[28];
        int[] result = new int[2];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (cnt < 28) {
            StringTokenizer st0 = new StringTokenizer(reader.readLine());
            int num = Integer.parseInt(st0.nextToken());
            arr[cnt] = num;
            cnt++;
        }

        for (int i = 1; i <= 30; i++) {
            if (contains(arr, i)) {
                continue;
            } else {
                result[flag] = i;
                flag++;
            }
        }

        Arrays.sort(result);

        System.out.println(result[0]);
        System.out.println(result[1]);

        reader.close();

    }

    private static boolean contains(int[] member, int num) {

        for (int i = 0; i < member.length; i++) {
            if (member[i] == num) {
                // 발견
                return true;
            }
        }

        // 발견 실패
        return false;
    }

    public static void main(String[] main) throws IOException {
        solution();
    }
}