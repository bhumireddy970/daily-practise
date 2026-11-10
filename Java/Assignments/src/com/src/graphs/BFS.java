package com.src.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void BFS(List<List<Integer>> graph,int n,int startNode){
        int[] visited = new int[n+1];


        if(startNode>1 && startNode<n){
            explore(graph,visited,startNode);
        }


        for(int i=1;i<=n;i++)
        {
            if(visited[i]==0)
                explore(graph,visited,i);
        }
    }

    public static void explore(List<List<Integer>> graph,int[] visited,int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start]=1;

        while(!queue.isEmpty())
        {
            int node=queue.poll();

            System.out.print(node + " ");
            for(int neighbour:graph.get(node))
            {
                if(visited[neighbour]==0){
                    queue.add(neighbour);
                    visited[neighbour]=1;
                }
            }
        }
        System.out.println();
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

        graph.get(2).add(5);
        graph.get(5).add(2);

        graph.get(3).add(4);
        graph.get(4).add(3);

        graph.get(5).add(4);
        graph.get(4).add(5);



        BFS(graph,n,2);
    }
}
