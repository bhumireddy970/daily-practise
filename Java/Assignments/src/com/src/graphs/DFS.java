package com.src.graphs;

import java.util.ArrayList;
import java.util.List;

public class DFS {

    public static void dfs(List<List<Integer>> graph,int startNode,int[] visited){
        visited[startNode]=1;
        System.out.print(startNode+" ");
        for(int neighbor:graph.get(startNode)){
            if(visited[neighbor]==0)
                dfs(graph, neighbor,visited);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();

        int n=5;
        for(int i=0;i<=n;i++)
        {
            graph.add(new ArrayList<>());
        }
        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

//        graph.get(3).add(4);
//        graph.get(4).add(3);

        graph.get(5).add(4);
        graph.get(4).add(5);

int[] visited = new int[n+1];

        for(int i=1;i<=n;i++){
            if(visited[i]==0) {
                dfs(graph, i, visited);
                System.out.println();
            }
        }
    }
}
