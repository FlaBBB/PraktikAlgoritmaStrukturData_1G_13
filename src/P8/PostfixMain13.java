package P8;

import java.util.Scanner;

public class PostfixMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan ekpresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();

        Postfix13 post = new Postfix13(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
