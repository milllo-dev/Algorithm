import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        solution(0, new ArrayList<Integer>(), results, nums);

        return results;
    }

    void solution(int idx, List<Integer> basket, List<List<Integer>> res, int[] nums) {
        res.add(new ArrayList<>(basket));

        for (int i = idx; i < nums.length; i++) {
            basket.add(nums[i]);
            solution(i + 1, basket, res, nums);
            basket.remove(basket.size() - 1);
        }
    }
}