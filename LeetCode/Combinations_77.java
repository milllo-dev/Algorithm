import java.util.*;

class Solution {
    static int[] input;
    static int[] values;
    static boolean[] isSelected;
    static List<List<Integer>> results;

    public List<List<Integer>> combine(int n, int k) {
        input = new int[n];
        values = new int[k];
        isSelected = new boolean[n];
        results = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            input[i] = i + 1;
        }

        combination(0, 0, n, k, input);

        return results;
    }

    private void combination(int idx, int start, int n, int k, int[] input) {
        if (idx >= k) {
            List<Integer> list = new ArrayList<>();

            for (int num : values) {
                list.add(num);
            }

            results.add(list);
            return;
        }

        for (int i = start; i < n; i++) {
            values[idx] = input[i];
            combination(idx + 1, i + 1, n, k, input);
        }
    }
}