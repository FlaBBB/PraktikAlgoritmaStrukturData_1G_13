package P1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tugas, kuis, uts, uas, nilaiAkhir = 0;
        String hasil = "";
        boolean valid = true;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");
        System.out.print("Masukkan nilai Tugas: ");
        tugas = sc.nextFloat();
        System.out.print("Masukkan nilai Kuis: ");
        kuis = sc.nextFloat();
        System.out.print("Masukkan nilai UTS: ");
        uts = sc.nextFloat();
        System.out.print("Masukkan nilai UAS: ");
        uas = sc.nextFloat();


        if ((tugas < 0 || tugas > 100) || (kuis < 0 || kuis > 100) || (uts < 0 || uts > 100) || (uas < 0 || uas > 100)) {
            hasil += "Nilai tidak valid";
            valid = false;
        } else {
            nilaiAkhir = (tugas * 0.2f) + (kuis * 0.2f) + (uts * 0.3f) + (uas * 0.3f);
            hasil += "nilai Akhir: " + nilaiAkhir + "\n";
            hasil += "Nilai Huruf: ";
            if (80 < nilaiAkhir && nilaiAkhir <= 100) {
                hasil += "A";
            } else if (73 < nilaiAkhir && nilaiAkhir <= 80) {
                hasil += "B+";
            } else if (65 < nilaiAkhir && nilaiAkhir <= 73) {
                hasil += "B";
            } else if (60 < nilaiAkhir && nilaiAkhir <= 65) {
                hasil += "C+";
            } else if (50 < nilaiAkhir && nilaiAkhir <= 60) {
                hasil += "C";
            } else if (39 < nilaiAkhir && nilaiAkhir <= 50) {
                hasil += "D";
            } else {
                hasil += "E";
            }
        }

        System.out.println("================================");
        System.out.println("================================");
        System.out.println(hasil);
        System.out.println("================================");
        System.out.println("================================");

        if (!valid) return;

        if (nilaiAkhir > 50) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("MAAF, ANDA TIDAK LULUS");
        }
    }
}
