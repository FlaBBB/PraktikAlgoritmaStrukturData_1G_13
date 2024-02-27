package P3.Latihan.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] mahasiswa = new Mahasiswa[3];

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.printf("Masukkan data mahasiswa ke-%d\n", i + 1);
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            boolean jenisKelamin = sc.nextLine().equalsIgnoreCase("L");
            System.out.print("Alamat: ");
            String alamat = sc.nextLine();
            System.out.print("IPK: ");
            float ipk = sc.nextFloat();
            sc.nextLine();

            mahasiswa[i] = new Mahasiswa(nim, nama, jenisKelamin, alamat, ipk);
        }

        System.out.println();

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.printf("Data mahasiswa ke-%d\n", i + 1);
            mahasiswa[i].print();
        }
        System.out.printf("\nRata-rata IPK: %.2f\n", Mahasiswa.hitungRataRataIPK(mahasiswa));
        System.out.println("Mahasiswa dengan IPK terbesar:");
        Mahasiswa.getMahasiswaIpkTerbesar(mahasiswa).print();
    }
}
