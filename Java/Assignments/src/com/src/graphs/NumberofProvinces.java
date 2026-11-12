package com.src.graphs;


public class NumberofProvinces {
    class Solution {
        public void dfs(int[][] graph,int startNode,int[] visited){
            visited[startNode]=1;
            System.out.print(startNode+" ");
            for (int neighbor = 0; neighbor < graph.length; neighbor++){
                if(graph[startNode][neighbor]==1 && visited[neighbor]==0)
                    dfs(graph, neighbor,visited);
            }
        }
        public int findCircleNum(int[][] isConnected) {
            int n=isConnected.length;

            int[] visited=new int[n];
            int count=0;
            for (int i = 1; i <n; i++) {
                if(visited[i]==0)
                {
                    count++;
                    dfs(isConnected,i,visited);
                }
            }
            return count;
        }
    }
}
