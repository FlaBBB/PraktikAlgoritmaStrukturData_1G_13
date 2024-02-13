package P1;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long nim;
        int n;

        System.out.print("Masukkan Nim: ");
        nim = sc.nextLong();
        System.out.println("================================");

        n = (int) (nim % 100);
        if (n < 10) n += 10;

        System.out.printf("n : %d\n", n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) continue;

            if (i % 2 == 0)
                System.out.print(i);
            else 
                System.out.print("*");
            
            System.out.print(" ");
        }
    }
}