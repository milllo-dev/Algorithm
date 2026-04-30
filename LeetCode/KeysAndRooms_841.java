
import java.util.*;

// BFS
public class KeysAndRooms_841_BFS {
    static boolean[] isVisited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        isVisited = new boolean[rooms.size()];

        bfs(rooms, 0);

        for (boolean check : isVisited) {
            if (!check)
                return false;
        }

        return true;
    }

    private void bfs(List<List<Integer>> rooms, int vertex) {
        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(vertex);
        isVisited[vertex] = true;

        while (!queue.isEmpty()) {
            int currVertex = queue.poll();

            for (int nextVertex : rooms.get(currVertex)) {
                if (!isVisited[nextVertex]) {
                    queue.offer(nextVertex);
                    isVisited[nextVertex] = true;
                }
            }
        }
    }
}

// DFS
public class KeysAndRooms_841 {
    static boolean[] isVisited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        isVisited = new boolean[rooms.size()];
        dfs(rooms, 0);

        for (boolean visitState : isVisited) {
            if (!visitState) {
                return false;
            }
        }

        return true;
    }

    private void dfs(List<List<Integer>> rooms, int vertex) {
        isVisited[vertex] = true;

        for (int next : rooms.get(vertex)) {
            if (!isVisited[next]) {
                dfs(rooms, next);
            }
        }
    }
}

// 실패코드
// class Solution {
// public boolean canVisitAllRooms(List<List<Integer>> rooms) {
// boolean result = true;
// Map<Integer, Integer> keys = new HashMap<>();

// for(int num : rooms.get(0)) {
// keys.put(num, 1);
// }

// System.out.println(keys);

// for(int i = 1; i < rooms.size(); i++) {
// if(keys.get(i) == null) {
// result = false;
// break;
// }

// for(int j = 0; j < rooms.get(i).size(); j++) {
// keys.put(rooms.get(i).get(j), 1);
// }
// }

// // System.out.println(keys);
// return result;
// }
// }