import java.io.*;
import java.util.*;

public class pro_방문길이 {
    static Map<String, int[]> location = new HashMap<>();

    private static boolean isPath(int x, int y) {
        return 0 <= x && x < 10 && y >= 0 && y < 10;
    }

    private static void initLocation() {
        location.put("L", new int[] { -1, 0 });
        location.put("R", new int[] { 1, 0 });
        location.put("U", new int[] { 0, 1 });
        location.put("D", new int[] { 0, -1 });
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] paths = reader.readLine().split("");
        System.out.println(Arrays.toString(paths));

        initLocation();

        int x = 5, y = 5;
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

        reader.close();

        return answer.size() / 2;
    }
}
