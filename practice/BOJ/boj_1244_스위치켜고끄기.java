import java.io.*;
import java.util.*;

public class Main {
    static int swCount;
    static int[] swArray;
    static int stuCount;
    static int currGender;
    static int currNumber;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        swCount = Integer.parseInt(st.nextToken());

        swArray = new int[swCount];

        st = new StringTokenizer(reader.readLine(), " ");

        for (int i = 0; i < swCount; i++) {
            // array 순서는 1부터 시작됨 (index + 1 해줄것)
            swArray[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(reader.readLine());
        stuCount = Integer.parseInt(st.nextToken());

        for (int i = 0; i < stuCount; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            currGender = Integer.parseInt(st.nextToken());
            currNumber = Integer.parseInt(st.nextToken());

            if (currGender == 1) {
                man();
            } else {
                woman();
            }
        }

        for (int i = 0; i < swArray.length; i++) {
            writer.write(swArray[i] + " ");

            if ((i + 1) % 20 == 0) {
                writer.newLine();
            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }

    public static void man() {
        // 주어진 수의 배수면 변경
        for (int i = 0; i < swCount; i++) {
            if ((i + 1) % currNumber == 0) {
                swArray[i] = swArray[i] == 0 ? 1 : 0;
            }
        }
    }

    public static void woman() {
        int idx = currNumber - 1;
        // 해상 순번의 스위치만 먼저 변경
        swArray[idx] = swArray[idx] == 0 ? 1 : 0;

        int left = idx - 1;
        int right = idx + 1;

        while (left >= 0 && right < swCount) {
            if (swArray[left] == swArray[right]) {
                swArray[left] = swArray[left] == 0 ? 1 : 0;
                swArray[right] = swArray[right] == 0 ? 1 : 0;
                left--;
                right++;
            } else {
                break;
            }
        }

        // // 주어진 수 기준 좌측 범위
        // int lf = (currNumber - 1);

        // // 주어진 수 기준 우측 범위
        // int rf = (swCount - currNumber);

        // // 최종 범위
        // int range = Math.min(lf, rf);

        // lf = (currNumber - range - 1);
        // rf = (currNumber + range - 1);

    }
}