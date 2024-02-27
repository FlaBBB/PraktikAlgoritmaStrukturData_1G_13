package P3.Latihan.one;

public class Limas {
    public int sisi;
    public int tinggi;

    public Limas(int s, int t) {
        sisi = s;
        tinggi = t;
    }

    public double hitungTinggiSisiMiring() {
        return Math.sqrt(Math.pow(sisi / 2, 2) + Math.pow(tinggi, 2));
    }

    public double hitungLuasSisiMiring() {
        return 2 * hitungTinggiSisiMiring() * sisi;
    }

    public double hitungLuasAlas() {
        return Math.pow(sisi, 2);
    }

    public double hitungLuasPermukaan() {
        return hitungLuasAlas() + hitungLuasSisiMiring();
    }

    public double hitungVolume() {
        return 0.33 * hitungLuasAlas() * tinggi;
    }
}
