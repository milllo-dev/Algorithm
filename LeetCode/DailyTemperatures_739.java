import java.util.*;

public class DailyTemperatures_739 {
    public static void main(String[] args) {

    }

    static public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int idx = 0; idx < temperatures.length; idx++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[idx]) {
                int ex = stack.pop();
                results[ex] = idx - ex;
            }

            stack.push(idx);
        }

        return results;
    }
}