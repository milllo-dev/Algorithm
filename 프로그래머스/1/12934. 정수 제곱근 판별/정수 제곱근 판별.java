class Solution {
    public long solution(long n) {
        long q = (long) Math.sqrt(n);
        return (long)Math.pow(q, 2) == n ? (long)Math.pow((q + 1), 2) : -1;
    }
}