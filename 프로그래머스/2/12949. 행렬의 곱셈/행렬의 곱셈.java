class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // (N1 x M1) X (M2 x N) = N x N
        int N1 = arr1.length;
        int M1 = arr1[0].length;
        int N2 = arr2.length;
        int M2 = arr2[0].length;
        
        int[][] answer = new int[N1][M2];
        
        for(int i = 0; i < N1; i++) {
            for(int j = 0; j < M2; j++) {
                for(int k = 0; k < M1; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}