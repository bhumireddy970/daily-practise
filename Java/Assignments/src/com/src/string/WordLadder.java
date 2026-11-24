package com.src.string;

import java.util.*;

class Pair{
    String str;
    int step;
    Pair(String str,int step)
    {
        this.str=str;
        this.step=step;
    }
}
public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(beginWord,1));
        Set<String> set=new HashSet<>();
        for(String s: wordList)
            set.add(s);
        while(!queue.isEmpty())
        {
            String word=queue.peek().str;
            int steps=queue.peek().step;
            queue.remove();
            if(word.equals(endWord)) return steps;

            for(int i=0;i<word.length();i++)
            {
                char replacedChar[]=word.toCharArray();
                for(char c='a';c<='z';c++)
                {

                    replacedChar[i]=c;
                    String replaced=new String(replacedChar);
                    if(set.contains(replaced))
                    {
                        set.remove(replaced);
                        queue.add(new Pair(replaced,steps+1));
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new java.util.ArrayList<>(java.util.Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        System.out.println(ladderLength(beginWord,endWord,wordList));
    }
}
