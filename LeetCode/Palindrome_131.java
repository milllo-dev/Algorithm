import java.util.*;

class Solution {
    static String origin;
    static List<List<String>> results;

    public static List<List<String>> partition(String s) {
        origin = s;
        results = new ArrayList<>();

        check(0, new ArrayList<String>());

        return results;
    }

    private static void check(int idx, List<String> bucket) {
        if (idx >= origin.length()) {
            results.add(new ArrayList<String>(bucket));
            return;
        }

        for (int i = idx + 1; i < origin.length() + 1; i++) {
            String subs = origin.substring(idx, i);

            if (isPalindrome(subs)) {
                bucket.add(subs);
                check(i, bucket);
                bucket.remove(bucket.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();
        return str.equals(reverse);
    }
}