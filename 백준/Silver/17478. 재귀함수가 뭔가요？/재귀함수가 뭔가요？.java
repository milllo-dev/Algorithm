import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static String dash = "____";
    static String[] sentence = {
            "\"재귀함수가 뭔가요?\"\n",
            "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n",
            "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n",
            "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n"
    };
    static String[] endSentence = {
            "\"재귀함수가 뭔가요?\"\n",
            "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n"
    };
    static String finalSentence = "라고 답변하였지.\n";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(reader.readLine());

        reader.close();

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        recursion(N, "");

    }

    private static void recursion(int n, String bar) {
        if (n == 0) {
            for (String sentence : endSentence) {
                System.out.print(bar + sentence);
            }
            System.out.print(bar + finalSentence);
            return;
        }

        for (String sent : sentence) {
            System.out.print(bar + sent);
        }

        recursion(n - 1, bar + "____");

        System.out.print(bar + finalSentence);
    }
}