package io.github.guilhermemelo01.programming.data_structure_and_algorithms.graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphList {
    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public GraphList(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int i = 0; i < V; i++) {
            this.adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }

    public void breadthFirstSearch(int s){
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u + " ");
            for(int v : adj[u]){
                if(!visited[v]){
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        GraphList graphList = new GraphList(5);
        graphList.addEdge(0, 1);
        graphList.addEdge(1, 2);
        graphList.addEdge(2, 3);
        graphList.addEdge(3, 0);
        graphList.addEdge(2, 4);

//        System.out.println(graphList);

        graphList.breadthFirstSearch(0);
    }
}
