package P1;

import java.util.Scanner;

public class T1 {
    static char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
    static char[][] KOTA = {
        {'B','A','N','T','E','N'},
        {'J','A','K','A','R','T','A'},
        {'B','A','N','D','U','N','G'},
        {'C','I','R','E','B','O','N'},
        {'B','O','G','O','R'},
        {'P','E','K','A','L','O','N','G','A','N'},
        {'S','E','M','A','R','A','N','G'},
        {'S','U','R','A','B','A','Y','A'},
        {'M','A','L','A','N','G'},
        {'T','E','G','A','L'}
    };

    static void cetakKodeKota(char kode) {
        int idx = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                idx = i;
                break;
            }
        }
        if (idx != -1) {
            System.out.println(KOTA[idx]);
        } else {
            System.out.println("Kode tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode kota: ");
        char kode = sc.next().charAt(0);
        cetakKodeKota(kode);
    }
}
