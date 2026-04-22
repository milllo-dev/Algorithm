import java.io.*;
import java.util.*;

public class pro_모의고사 {
    public static void main(String[] args) throws IOException {
        int[] answers = { 1, 2, 3, 4, 5 };

        int[] one = { 1, 2, 3, 4, 5 };
        int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int[] scores = new int[3];

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % one.length]) {
                scores[0]++;
            }
            if (answers[i] == two[i % two.length]) {
                scores[1]++;
            }
            if (answers[i] == three[i % three.length]) {
                scores[2]++;
            }
        }

        int max = Arrays.stream(scores).max().getAsInt();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max) {
                result.add(i + 1);
            }
        }

        System.out.println("one : " + scores[0] + "/ two : " + scores[1] + " / three : " + scores[2]);
        System.out.print(result.stream().mapToInt(Integer::intValue).toArray().toString());
    }
}
