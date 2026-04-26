class Solution {
    static int count;
    static boolean[] isVisited;

    public int solution(int k, int[][] dungeons) {
        isVisited = new boolean[dungeons.length];
        search(dungeons, 0, k);
        return count;
    }

    private void search(int[][] dungeons, int idx, int k) {
        // base case
        count = Math.max(count, idx);

        for (int i = 0; i < dungeons.length; i++) {
            if (isValid(k, dungeons[i][0]) && !isVisited[i]) {
                isVisited[i] = true;
                search(dungeons, idx + 1, k - dungeons[i][1]);
                isVisited[i] = false;
            }
        }
    }

    private boolean isValid(int k, int dungeonsK) {
        if (k >= dungeonsK) {
            return true;
        }
        return false;
    }
}