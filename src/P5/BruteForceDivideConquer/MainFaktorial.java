package P5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[iJml];
        for (int i = 0; i < iJml; i++) {
            System.out.println("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            int iNilai = sc.nextInt();
            fk[i] = new Faktorial(iNilai);
        }

        System.out.println("HASIL- BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Faktorial dari " + fk[i].nilai + " adalah " + fk[i].factorialBF());
        }

        System.out.println("HASIL- DIVIDE CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Faktorial dari " + fk[i].nilai + " adalah " + fk[i].factorialDC(fk[i].nilai));
        }
    }
}
