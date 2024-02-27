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
}
