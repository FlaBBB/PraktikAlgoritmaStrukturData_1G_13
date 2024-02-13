package P1;

import java.util.Scanner;

public class T2 {
    static Scanner sc = new Scanner(System.in);

    static double calculateSpeed() {
        double distance, time;
        System.out.print("Masukkan jarak (km): ");
        distance = sc.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        time = sc.nextDouble();
        return distance / time;
    }

    static double calculateDistance() {
        double speed, time;
        System.out.print("Masukkan kecepatan (km/jam): ");
        speed = sc.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        time = sc.nextDouble();
        return speed * time;
    }

    static double calculateTime() {
        double distance, speed;
        System.out.print("Masukkan jarak (km): ");
        distance = sc.nextDouble();
        System.out.println("Masukkan kecepatan (km/jam): ");
        speed = sc.nextDouble();
        return distance / speed;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Pilih Menu:");
            System.out.println("1. Hitung Hasil Kecepatan");
            System.out.println("2. Hitung Hasil Jarak");
            System.out.println("3. Hitung Hasil Waktu");
            System.out.println("4. Keluar");
            System.out.print("> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hasil: " + calculateSpeed());
                    break;
                case 2:
                    System.out.println("Hasil: " + calculateDistance());
                    break;
                case 3:
                    System.out.println("Hasil: " + calculateTime());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}
