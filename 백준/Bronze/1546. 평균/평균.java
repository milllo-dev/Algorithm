import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        float result = 0.0f;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st0 = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st0.nextToken());
        float[] scores = new float[n];
        StringTokenizer st1 = new StringTokenizer(reader.readLine());

        for (int i = 0; i < n; i++) {
            float num = Float.parseFloat(st1.nextToken());
            scores[i] = num;
        }

        float max = getMax(scores);

        for (int j = 0; j < n; j++) {
            scores[j] = ((scores[j] / max) * 100.0f);

            result += scores[j];
        }

        result /= (float) n;

        System.out.printf("%f", result);

        reader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static float getMax(float[] arr) {
        float max = arr[0];

        for (float score : arr) {
            if (score > max)
                max = score;
        }

        return max;
    }
}