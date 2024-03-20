package P5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.print("Masukkan jumlah perusahaan: ");
        int numPerusahaan = sc.nextInt();
        Sum[] perusahaan = new Sum[numPerusahaan];
        System.out.println("===============================================================");

        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("Perusahaan ke-" + (i + 1) + " :");
            System.out.println("===============================================================");
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
            System.out.print("Masukkan jumlah bulan: ");
            int elm = sc.nextInt();

            perusahaan[i] = new Sum(elm);
            System.out.println("===============================================================");
            for (int j = 0; j < perusahaan[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " = ");
                perusahaan[i].keuntungan[j] = sc.nextDouble();
            }

            System.out.println("===============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = %.2f\n",
                    perusahaan[i].totalBF());
            System.out.println("===============================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = %.2f\n",
                    perusahaan[i].totalDC());
            System.out.println("===============================================================");
        }
    }
}
