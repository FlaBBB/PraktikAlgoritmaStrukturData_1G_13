package P7;

import java.util.Scanner;

public class BukuMain13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku13 data = new PencarianBuku13();
        int jumBuku = 5;

        System.out.println("===============================================");
        System.out.println("Masukkan data Buku secara urut dari kode buku terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("=====================================");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t: ");
            String judul = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = s.nextInt();

            Buku13 m = new Buku13(kodeBuku, judul, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("===============================================");
        System.out.println("Data Buku: ");
        data.tampil();

        System.out.println("===============================================");
        System.out.print("Masukkan kode buku yang dicari: ");
        int cari = s.nextInt();
        System.out.println("===============================================");
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        System.out.println("===============================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.TampilPosisi(cari, posisi);
    }
}
