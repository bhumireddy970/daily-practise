package com.src.stack;

public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s) {
        String res="";
        int level=0;

        for(char c : s.toCharArray())
        {
            if(c=='('){
                if(level>0)
                    res+=c;
                level++;
            }
            else{
                level--;
                if(level>0)
                    res+=c;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()(()))"));
    }
}
