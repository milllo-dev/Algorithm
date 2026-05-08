class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long pay = 0;
        
        for(int i = 1; i <= count; i++) {
            pay += price * i;
        }
        
        return money - pay < 0 ? Math.abs(money - pay) : 0;
    }
}