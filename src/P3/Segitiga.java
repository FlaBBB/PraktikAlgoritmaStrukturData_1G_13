package P3;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga (int a, int t) {
        alas = a;
        tinggi = t; 
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }

    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);
    }
}
