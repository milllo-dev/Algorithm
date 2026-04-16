import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i == j) continue;
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}