import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
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