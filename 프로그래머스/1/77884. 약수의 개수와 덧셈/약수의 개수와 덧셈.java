class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int l = left; l <= right; l++) {
            answer += checkCount(l) ? l : -l;
        }
        
        return answer;
    }
    
    private boolean checkCount(int n) {
        int count = 0;
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count += 1;
            }
        }
        
        return count % 2 == 0 ? true : false;
    }
}