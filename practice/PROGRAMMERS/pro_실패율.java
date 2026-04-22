import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = 5;
        int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
        int[] chCounts = new int[N + 2];

        for (int stage : stages) {
            chCounts[stage]++;
        }

        double total = stages.length;

        // 실패율
        Map<Integer, Double> fail = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            if (chCounts[i] == 0) {
                fail.put(i, 0.);
            } else {
                fail.put(i, chCounts[i] / total);
                total -= chCounts[i];
            }
        }

        System.out.println(fail);

        // compare
        // (리턴값) a < b -> 음수
        // a == b -> 0
        // a > b -> 양수
        fail.entrySet().stream()
                .sorted((o1, o2) -> o1.getValue().equals(o2.getValue()) ? Integer.compare(o1.getKey(), o2.getKey())
                        : Double.compare(o2.getValue(), o1.getValue()))
                .mapToInt(HashMap.Entry::getKey).toArray();
    }
}
