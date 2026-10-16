class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(char curr:s.toCharArray()){
            if(stack.isEmpty() || curr=='(' || curr=='{' || curr=='[')
            {
                stack.push(curr);
            }
            else
            {char top=stack.peek();
            if((top=='(' && curr==')')||(top=='{' && curr=='}')||(top=='[' && curr==']'))
            stack.pop();
            else
            stack.push(curr);
            }
        }
        if(stack.isEmpty())
        return true;
        else
        return false;
    }
}