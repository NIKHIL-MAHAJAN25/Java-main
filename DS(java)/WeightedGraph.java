import java.util.ArrayList;
import java.util.List;


class Edge {
    int vertex;
    int weight;

    public Edge(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + vertex + ", " + weight + ")";
    }
}

public class WeightedGraph {
    private List<List<Edge>> adjacencyList;
    private int numVertices;

    // Initialize the adjacency list for a weighted graph
    public WeightedGraph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>();

        // Initialize an empty list for each vertex
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Add a weighted edge between two vertices
    public void addEdge(int i, int j, int weight) {
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices) {
            adjacencyList.get(i).add(new Edge(j, weight));
            adjacencyList.get(j).add(new Edge(i, weight)); // For undirected graph
        }
    }

    // Print the adjacency list
    public void printAdjacencyList() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Edge edge : adjacencyList.get(i)) {
                System.out.print(" -> " + edge);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
      
        WeightedGraph graph = new WeightedGraph(5);

        // Example: Adding weighted edges
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 3, 2);

        System.out.println("Weighted Adjacency List:");
        graph.printAdjacencyList();

        
    }
}