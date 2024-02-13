package P1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mataKuliah = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        double[] bobotNilai = { 3.5, 4, 3, 4, 4, 2.5, 2.5, 4 };
        double[] nilai = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] nilaiSetara = new double[mataKuliah.length];
        double totalBobot = 0, ip = 0;

        System.out.println("========================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("========================================");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("Masukkan nilai Angka untuk MK %s: ", mataKuliah[i]);
            nilai[i] = sc.nextDouble();
            if (80 < nilai[i] && nilai[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (73 < nilai[i] && nilai[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (65 < nilai[i] && nilai[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (60 < nilai[i] && nilai[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (50 < nilai[i] && nilai[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (39 < nilai[i] && nilai[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
        }
        
        System.out.println("========================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("========================================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", mataKuliah[i], nilai[i], nilaiHuruf[i], bobotNilai[i]);
            ip += nilaiSetara[i] * bobotNilai[i];
            totalBobot += bobotNilai[i];
        }
        ip /= totalBobot;
        System.out.println("========================================");
        System.err.printf("IP : %.2f\n", ip);
    }
}
