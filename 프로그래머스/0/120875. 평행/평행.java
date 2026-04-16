class Solution {
    
    public int solution(int[][] dots) {
        // 두 직선의 기울기가 같으면 평행
        int answer = 0;
        
        // (0,1) - (2,3)
        boolean one = vali(dots[0], dots[1], dots[2], dots[3]);
        // (0,2) - (1,3)
        boolean two = vali(dots[0], dots[2], dots[1], dots[3]);
        // (0,3) - (1,2)
        boolean three = vali(dots[0], dots[3], dots[1], dots[2]);
        
        if (one || two || three) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
    
    public static boolean vali(int[] a, int[] b, int[] c, int[] d) {
        int ax = b[0] - a[0];
        int ay = b[1] - a[1];

        int bx = d[0] - c[0];
        int by = d[1] - c[1];
        
        return ay * bx == ax * by;
    }
}