import java.util.*;


class Solution {
    static Map<String, int[]> location = new HashMap<>();

    private static boolean isPath(int x, int y) {
        return -5 <= x && x < 6 && y >= -5 && y < 6;
    }

    private static void initLocation() {
        location.put("L", new int[] { -1, 0 });
        location.put("R", new int[] { 1, 0 });
        location.put("U", new int[] { 0, 1 });
        location.put("D", new int[] { 0, -1 });
    }
    
    public int solution(String dirs) {
        String[] paths = dirs.split("");
        System.out.println(Arrays.toString(paths));

        initLocation();

        int x = 0, y = 0;
        HashSet<String> answer = new HashSet<>();

        for (int i = 0; i < paths.length; i++) {
            int[] offset = location.get(paths[i]);
            int nx = x + offset[0];
            int ny = y + offset[1];
            if (!isPath(nx, ny)) {
                continue;
            }

            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);

            x = nx;
            y = ny;
        }

        return answer.size() / 2;
    }
}