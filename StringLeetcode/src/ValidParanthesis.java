// Leetcode 20: Valid Paranthesis
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
//determine if the input string is valid.

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(checkParanthesis(s));
    }
    public static boolean checkParanthesis(String s){
        Stack<Character> element = new Stack<>();

        for (char ch : s.toCharArray()) {
            if(ch == '(') element.push(')');
            else if(ch == '{') element.push('}');
            else if(ch == '[') element.push(']');
            else if(element.isEmpty() || ch != element.pop())return false;
        }
        return element.isEmpty();
    }
}
