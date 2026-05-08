import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for(int rd : d) {
            if(rd <= budget) {
                budget -= rd;
                answer += 1;
            }
            else {
                break;
            }
        }
        
        return answer;
    }
}