import java.util.*;

class Solution {
    static List<List<Integer>> llist;
    static int[] list;
    static boolean[] isSelected;

    public List<List<Integer>> permute(int[] nums) {
        list = new int[nums.length];
        llist = new ArrayList<>();
        isSelected = new boolean[nums.length];

        permutation(0, nums);

        return llist;
    }

    private void permutation(int idx, int[] nums) {
        if (idx >= nums.length) {
            List<Integer> arr = new ArrayList<>();

            for (int num : list) {
                arr.add(num);
            }

            llist.add(arr);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (isSelected[i])
                continue;

            list[idx] = nums[i];
            isSelected[i] = true;
            permutation(idx + 1, nums);
            isSelected[i] = false;
        }
    }
}