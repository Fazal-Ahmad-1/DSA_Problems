class Solution {
    public String decodeString(String s) {

        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String current = "";
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');

            } else if (ch == '[') {
                numStack.push(num);
                stringStack.push(current);

                num = 0;
                current = "";

            } else if (ch == ']') {

                int repeat = numStack.pop();
                String previous = stringStack.pop();

                current = previous + current.repeat(repeat);

            } else {
                current += ch;
            }
        }

        return current;
    }
}