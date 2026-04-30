import java.util.*;
import java.io.*;

public class boj_2252_줄세우기 {
    static int N, M;
    static int[] inDegree; // 진입차수 - inDegree[3] == 2; -> 3번 노드로 들어오는 간선이 2개
    static List<Integer>[] g; // 인접리스트 -> g[1] == 3; -> 1번 노드 뒤의 노드 목록

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        g = new ArrayList[N + 1]; // 0번지 버림, 학생 번호는 1번부터
        for (int i = 1; i <= N; i++) {
            g[i] = new ArrayList<>();
        }

        inDegree = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(reader.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            g[a].add(b); // a가 b보다 앞
            inDegree[b]++; //
        }

        reader.close();

        topologySort();
    }

    private static void topologySort() {
        // queue 사용
        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < N; i++) {
            if (inDegree[i] == 0)
                queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            sb.append(cur).append(" ");

            for (int next : g[cur]) {
                if (--inDegree[next] == 0)
                    queue.offer(next);
            }
        }

        System.out.println(sb);
    }
}
