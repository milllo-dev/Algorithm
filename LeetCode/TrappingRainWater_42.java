import java.util.*;

public class TrappingRainWater_42 {
    static int result = 0;

    public static void main(String[] args) {
        trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 });
    }

    public static int trap(int[] height) {
        Deque<Integer> deq = new ArrayDeque<>();

        for (int v : height) {
            deq.offer(v);
        }

        int currHeight = deq.poll();

        while (!deq.isEmpty()) {
            if (currHeight < deq.peek()) {
                currHeight = deq.poll();
            } else {
                result += currHeight - deq.peek();
                deq.poll();
            }
        }

        System.out.println(result);

        return 0;
    }
}
