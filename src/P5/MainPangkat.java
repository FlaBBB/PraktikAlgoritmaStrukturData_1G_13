package P5;

import java.util.Scanner;

/**
 * MainPangkat
 */
public class MainPangkat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung: ");
        int iJml = sc.nextInt();
        System.out.println("Pilih metode perhitungan: ");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide Conquer");
        int iMetode = sc.nextInt();

        Pangkat[] fk = new Pangkat[iJml];
        for (int i = 0; i < iJml; i++) {
            System.out.println("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            int iNilai = sc.nextInt();
            System.out.println("Masukkan pangkat elemen ke-" + (i + 1) + ": ");
            int iPangkat = sc.nextInt();
            fk[i] = new Pangkat(iNilai, iPangkat);
        }

        switch (iMetode) {
            case 1:
                System.out.println("HASIL- BRUTE FORCE");
                for (int i = 0; i < iJml; i++) {
                    System.out.println(
                            "Hasil dari " + fk[i].nilai + " pangkat " + fk[i].pangkat + " adalah " + fk[i].pangkatBF());
                }
                break;
            case 2:

                System.out.println("HASIL- DIVIDE CONQUER");
                for (int i = 0; i < iJml; i++) {
                    System.out.println(
                            "Hasil dari " + fk[i].nilai + " pangkat " + fk[i].pangkat + " adalah " + fk[i].pangkatDC());
                }
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }

    }
}