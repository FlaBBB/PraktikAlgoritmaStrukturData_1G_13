package P14;

import java.util.Scanner;

public class GraphMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph13 gedung = new Graph13(6);
        try {
            gedung.addEdge(0, 1, 50);
            gedung.addEdge(0, 2, 100);
            gedung.addEdge(1, 3, 70);
            gedung.addEdge(2, 3, 40);
            gedung.addEdge(3, 4, 60);
            gedung.addEdge(4, 5, 80);
            gedung.degree(0);
            gedung.printGraph();
            gedung.degree(1);
            gedung.removeEdge(1, 3);
            gedung.printGraph();

            System.out.print("\nMasukkan gedun asal: ");
            int asal = sc.nextInt();
            System.out.print("Masukkan gedun tujuan: ");
            int tujuan = sc.nextInt();
            gedung.checkAdjacency(asal, tujuan);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        GraphMatriks13 gdg = new GraphMatriks13(4);
        gdg.makeEdge(0, 1, 5);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90); 
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        gdg.degree();   
    }
}
