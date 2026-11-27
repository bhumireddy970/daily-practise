package com.src.DP;

import java.util.Stack;

public class LargestRectangleHistogram {
    public static int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int max=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.empty() && arr[st.peek()]>arr[i]){
                int element=st.pop();
                int nse=i,pse=st.empty()?-1:st.peek();
                max=Math.max(max,arr[element]*(nse-pse-1));

            }
            st.push(i);
        }

        while(!st.empty()){
            int element=st.pop();
            int nse=n,pse=st.empty()?-1:st.peek();
            max=Math.max(max,arr[element]*(nse-pse-1));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights));
    }
}
