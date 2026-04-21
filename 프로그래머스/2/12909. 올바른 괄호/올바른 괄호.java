import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Deque<Character> str = new ArrayDeque<>();
        
        for(char c : s.toCharArray()) {
            if(c == '(') {
                str.push(c);
            }
            else {
                if(str.isEmpty() || str.pop() == c) {
                    return false;
                }
            }
        }
        
        
        return str.isEmpty();
    }
}