import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드게임 {
    // 행과 열의 카드 중 가장 먼저 뽑을 카드의 행을 선택하고, 해당 행의 카드 중 가장 작은 카드를 뽑는다.
    // 이후 다른 행의 카드 중 가장 작은 카드를 뽑는다.
    // 최종 뽑는 카드는 뽑았던 카드 중 가장 큰 값을 뽑아야 한다.
    static int N,M;
    static int[][] cards;

    public static void main(String[] args) throws IOException {
        int[] bucket;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cards = new int[N][M];
        bucket = new int[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(reader.readLine(), " ");
            for(int j = 0; j < M; j++) {
                cards[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++) {
            bucket[i] = Arrays.stream(cards[i]).min().getAsInt();
        }

        System.out.println(Arrays.stream(bucket).max().getAsInt());
        
        reader.close();
    }
}
