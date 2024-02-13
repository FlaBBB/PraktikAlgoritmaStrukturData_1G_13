package P1;

public class Function {
    static int[][] stokBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    static int[] hargaBunga = {75_000, 50_000, 60_000, 10_000};
    static int[][] bungaMati = {
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {1, 2, 0, 5}
    };

    static void penguranganStock(int cabang, int[] stok) {
        for (int i = 0; i < stok.length; i++) {
            stokBunga[cabang][i] -= stok[i];
        }
    }

    static long pendapatanSetiapCabang(int cabang) {
        long pendapatan = 0;
        for (int i = 0; i < stokBunga[cabang].length; i++) {
            pendapatan += stokBunga[cabang][i] * hargaBunga[i];
        }
        return pendapatan;
    }
}
