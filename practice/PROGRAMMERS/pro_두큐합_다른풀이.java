import java.util.Arrays;

public class pro_두큐합_다른풀이 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] { 3, 2, 7, 2 }, new int[] { 4, 6, 5, 1 }));
    }

    public static int solution(int[] queue1, int[] queue2) {
        int answer = -1;

        int[] whole = new int[queue1.length + queue2.length];
        System.arraycopy(queue1, 0, whole, 0, queue1.length);
        System.arraycopy(queue2, 0, whole, queue1.length, queue2.length);

        long q1sum = Arrays.stream(queue1).sum();
        double target = (Arrays.stream(queue1).sum() + Arrays.stream(queue2).sum()) / 2.0;

        int i = 0, j = queue1.length;
        for (answer = 0; answer < 3 * queue1.length; answer++) {
            if (q1sum > target) {
                q1sum -= whole[i];
                i = (i + 1) % whole.length;
            } else if (q1sum < target) {
                q1sum += whole[j];
                j = (j + 1) % whole.length;
            } else {
                return answer;
            }
        }

        return -1;
    }
}
