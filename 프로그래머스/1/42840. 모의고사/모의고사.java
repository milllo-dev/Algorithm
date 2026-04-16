import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int[] cntArr = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == one[i%5]) {
                cntArr[0] += 1;
            }
            if(answers[i] == two[i%8]) {
                cntArr[1] += 1;
            }
            if(answers[i] == three[i%10]) {
                cntArr[2] += 1;
            }
        }
        
        int max = Arrays.stream(cntArr).max().getAsInt();
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < cntArr.length; i++) {
            if(cntArr[i] == max) {
                answer.add(i+1);
            }
        }
        
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}