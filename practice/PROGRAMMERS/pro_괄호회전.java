import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int cnt = 0;

        String s = "[](){}";

        char[] c = s.toCharArray();

        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        Deque<Character> deq = new ArrayDeque<>();
        Deque<Character> deq2 = new ArrayDeque<>();

        for (char chr : c) {
            deq.add(chr);
        }

        while (true) {
            for (char cc : deq) {
                if (cc == '{' || cc == '[' || cc == '(') {
                    deq2.push(cc);
                } else {
                    if (deq2.isEmpty() || deq2.pop() == cc) {
                        cnt++;
                    }
                }
            }

            // if (deq2.isEmpty()) {
            // cnt++;
            // }

            char polled = deq.poll();
            deq.add(polled);
            System.out.println(deq.toString());

            if (s.equals(deq.stream().map(String::valueOf).collect(Collectors.joining()))) {
                System.out.println("break!");
                break;
            }
        }

        System.out.println(cnt);

    }
}