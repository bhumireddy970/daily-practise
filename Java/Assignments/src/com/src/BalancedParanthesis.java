package com.src;

import java.util.Stack;

public class BalancedParanthesis {
    public static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            else if(stack.isEmpty()){
                return false;
            }
            else if(c == '}' && stack.peek() == '{'){
               stack.pop();
            }
            else if(c == ']' && stack.peek() == '['){
                stack.pop();
            }
            else if(c == ')' && stack.peek() == '('){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("])({[](())}[{}()"));
    }
}
