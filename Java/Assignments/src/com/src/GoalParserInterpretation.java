package com.src;

public class GoalParserInterpretation {
    public static String interpret(String command) {
        String result="";
        char[] string = command.toCharArray();
        for(int i=0;i<string.length;){
            if(string[i]=='G') {
                result = result + "G";
                i++;
            }
            else if(string[i]=='(')
            {
                if(string[i+1]==')') {
                    result = result + "o";
                    i+=2;
                }
                else if(string[i+1]=='a') {
                    result = result + "al";
                    i+=4;
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
    }
}
