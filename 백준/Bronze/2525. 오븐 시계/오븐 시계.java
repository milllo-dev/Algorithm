import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(reader.readLine());
        int currHour = Integer.parseInt(st1.nextToken());
        int currMin = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(reader.readLine());
        int spentTime = Integer.parseInt(st2.nextToken());

        currHour += (spentTime / 60);
        currMin += (spentTime % 60);
        if (currMin >= 60) {
            currHour += (currMin / 60);
            currMin = (currMin % 60);
        }

        if (currHour >= 24)
            currHour %= 24;

        System.out.printf("%d %d", currHour, currMin);
        reader.close();

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}