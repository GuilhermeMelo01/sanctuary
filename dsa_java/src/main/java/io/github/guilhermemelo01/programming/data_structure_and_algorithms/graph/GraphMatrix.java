package io.github.guilhermemelo01.programming.data_structure_and_algorithms.graph;

public class GraphMatrix {
    private int vertices; // Number of vertices in Graph
    private int edges; // Number of edges in Graph
    private int[][] adjMatrix;

    public GraphMatrix(int nodes){
        this.vertices = nodes;
        this.edges = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addEdge(int u, int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1; // because it is an undirected graph
        edges++;
    }

    public void showMatrixValue(){
        for (int i = 0; i < adjMatrix.length; i++) {
            for(int j = 0; j < adjMatrix[0].length; j++){
                System.out.print(adjMatrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphMatrix graphMatrix = new GraphMatrix(4);
        graphMatrix.addEdge(0, 1);
        graphMatrix.addEdge(1, 2);
        graphMatrix.addEdge(2, 3);
        graphMatrix.addEdge(3, 0);

        graphMatrix.showMatrixValue();
    }
}
