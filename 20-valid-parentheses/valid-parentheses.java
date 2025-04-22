class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='('||ch[i]=='['||ch[i]=='{')
            {
                stack.push(ch[i]);
            }
            else if(!stack.isEmpty()&& ch[i]==')' && stack.peek()=='(')
            {
                stack.pop();
            }
            else if(!stack.isEmpty()&& ch[i]==']' && stack.peek()=='[')
            {
                stack.pop();
            }
            else if(!stack.isEmpty()&& ch[i]=='}' && stack.peek()=='{')
            {
                stack.pop();
            }
            else
            {
                return false;
            }
            
        }
        return stack.isEmpty();
    }
}