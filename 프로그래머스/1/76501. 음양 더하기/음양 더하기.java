import java.util.*;
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        
        for(int i = 0; i < absolutes.length; i++) {
            absolutes[i] = signs[i] ? absolutes[i] : absolutes[i] * -1;
        }
        
        return Arrays.stream(absolutes).sum();
    }
}