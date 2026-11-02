package com.src.string;

import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        if (s == null || s.isEmpty()) return 0;
        int len=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else {
                stack.pop();
                if(stack.isEmpty())
                    stack.push(i);
                else
                    len=Math.max(len,i-stack.peek());
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(())"));
    }
}
