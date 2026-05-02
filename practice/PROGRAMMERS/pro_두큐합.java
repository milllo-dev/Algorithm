import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class pro_두큐합 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 3, 2, 7, 2 }, new int[] { 4, 6, 5, 1 }));
    }

    public static int solution(int[] queue1, int[] queue2) {
        int n = queue1.length;

        long sum1 = 0;
        long sum2 = 0;

        Deque<Integer> que1 = new ArrayDeque<>();
        Deque<Integer> que2 = new ArrayDeque<>();

        for (int v : queue1) {
            que1.offer(v);
            sum1 += v;
        }

        for (int v : queue2) {
            que2.offer(v);
            sum2 += v;
        }

        if ((sum1 + sum2) % 2 == 1) {
            return -1;
        }

        for (int i = 0; i < 3 * n; i++) {
            if (sum1 == sum2) {
                return i;
            } else if (sum1 > sum2) {
                int value = que1.poll();
                que2.offer(value);
                sum1 -= value;
                sum2 += value;
            } else {
                int value = que2.poll();
                que1.offer(value);
                sum2 -= value;
                sum1 += value;
            }
        }

        return -1;
    }
}
