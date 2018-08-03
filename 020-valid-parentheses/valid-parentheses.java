// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
// An input string is valid if:
//
//
// 	Open brackets must be closed by the same type of brackets.
// 	Open brackets must be closed in the correct order.
//
//
// Note that an empty string is also considered valid.
//
// Example 1:
//
//
// Input: "()"
// Output: true
//
//
// Example 2:
//
//
// Input: "()[]{}"
// Output: true
//
//
// Example 3:
//
//
// Input: "(]"
// Output: false
//
//
// Example 4:
//
//
// Input: "([)]"
// Output: false
//
//
// Example 5:
//
//
// Input: "{[]}"
// Output: true
//
//


class Solution {
    public boolean isValid(String s) {
        char[] par = s.toCharArray();
        Stack<Character> stack1 = new Stack<Character>();
        for(int i=0;i<par.length;i++){
            if(par[i]=='(' || par[i]=='[' || par[i]=='{'){
                stack1.push(par[i]);
            }else 
                if(stack1.empty()){
                    return false;
                }else if((stack1.peek()=='(' && par[i]==')') ||
                    (stack1.peek()=='[' && par[i]==']') ||
                    (stack1.peek()=='{' && par[i]=='}')
                    ){
                        stack1.pop();
                    }else{
                    return false;
                    }
        }
        return stack1.empty();
    }
}
