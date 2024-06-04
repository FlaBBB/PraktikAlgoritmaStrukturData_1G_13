package P14;

public class GraphMain13 {
    public static void main(String[] args) {
        Graph13 graph = new Graph13(6);
        try {
            graph.addEdge(0, 1, 50);
            graph.addEdge(0, 2, 100);
            graph.addEdge(1, 3, 70);
            graph.addEdge(2, 3, 40);
            graph.addEdge(3, 4, 60);
            graph.addEdge(4, 5, 80);
            graph.degree(0);
            graph.printGraph();
            graph.degree(1);
            graph.removeEdge(1, 3);
            graph.printGraph();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
