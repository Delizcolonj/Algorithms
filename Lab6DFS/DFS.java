package lab6;

import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;

    Graph(int vertices){
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i <vertices ; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
    //adds an edge to an undirected graph
    public void addEdge(int source, int destination){
        adjList[source].add(destination);

        adjList[destination].add(source);
    }

    public void DFS(){
        boolean [] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Depth-First Search: ");
        //visit from each node if not already visited
        for (int i = 0; i <vertices ; i++) {
            if(!visited[i]){
                stack.push(i);
                dfs(i, visited);
            }

        }
    }

    public void dfs(int start, boolean [] visited){
        visited[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i <adjList[start].size() ; i++) {
            int vertex = adjList[start].get(i);
            if(!visited[vertex])
                dfs(vertex,visited);
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        Graph graph = new Graph(vertices);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(0,4);
        graph.addEdge(4,5);
        graph.addEdge(5,5);
        graph.addEdge(3,3);
        graph.addEdge(1,4);
        graph.addEdge(2,4);
        graph.addEdge(3,5);
        graph.addEdge(5,1);
        graph.DFS();
    }
}

