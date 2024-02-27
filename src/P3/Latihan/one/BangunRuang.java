package P3.Latihan.one;

import java.util.Scanner;

public class BangunRuang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Object[] bangunRuang = new Object[3];
        
        for (int i = 0; i < bangunRuang.length; i++) {
            System.out.println("Pilih bangun ruang ke-" + i +": ");
            System.out.println("1. Kerucut");
            System.out.println("2. Bola");
            System.out.println("3. Limas Segi 4");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jari-jari: ");
                    int jari = sc.nextInt();
                    System.out.print("Masukkan sisi miring: ");
                    int sisiMiring = sc.nextInt();
                    bangunRuang[i] = new Kerucut(sisiMiring, jari);
                    break;
                case 2:
                    System.out.print("Masukkan radius: ");
                    int radius = sc.nextInt();
                    bangunRuang[i] = new Bola(radius);
                    break;
                case 3:
                    System.out.print("Masukkan sisi: ");
                    int sisi = sc.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int tinggi = sc.nextInt();
                    bangunRuang[i] = new Limas(sisi, tinggi);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }

        System.out.println();

        for (int i = 0; i < bangunRuang.length; i++) {
            System.out.println("Bangun ruang ke-" + (i + 1));
            if (bangunRuang[i] instanceof Kerucut) {
                Kerucut k = (Kerucut) bangunRuang[i];
                System.out.println("Volume: " + k.hitungVolume());
                System.out.println("Luas Permukaan: " + k.hitungLuasPermukaan());
            } else if (bangunRuang[i] instanceof Bola) {
                Bola b = (Bola) bangunRuang[i];
                System.out.println("Volume: " + b.hitungVolume());
                System.out.println("Luas Permukaan: " + b.hitungLuasPermukaan());
            } else if (bangunRuang[i] instanceof Limas) {
                Limas l = (Limas) bangunRuang[i];
                System.out.println("Volume: " + l.hitungVolume());
                System.out.println("Luas Permukaan: " + l.hitungLuasPermukaan());
            }
        }
    }
}