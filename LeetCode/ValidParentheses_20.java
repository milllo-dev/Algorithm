class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default:
                    if (!stack.isEmpty() && stack.peek() == c) {
                        stack.pop();
                    } else {
                        return false;
                    }
            }
        }

        return stack.isEmpty();
    }
}