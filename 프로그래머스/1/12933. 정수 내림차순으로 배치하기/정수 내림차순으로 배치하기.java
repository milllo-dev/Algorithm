import java.util.*;

class Solution {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str);
        StringBuffer sb = new StringBuffer();
        for(String s : str) {
            sb.append(s);
        }

        return Long.parseLong(sb.reverse().toString());
    }
}