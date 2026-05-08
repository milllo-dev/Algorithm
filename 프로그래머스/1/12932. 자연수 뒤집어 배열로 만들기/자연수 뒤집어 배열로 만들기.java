import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        
        String s = String.valueOf(n);
        
        StringBuffer sb = new StringBuffer(s);
        String reversed = sb.reverse().toString();
        
        int[] answer = reversed.chars().map(c -> c - '0').toArray();
        
        return answer;
    }
}