package P3.Latihan.one;

public class Kerucut {
    public int sisiMiring;
    public int jari;

    public Kerucut (int sm, int j) {
        sisiMiring = sm;
        jari = j; 
    }

    public double hitungVolume() {
        return 0.33 * Math.PI * Math.pow(jari, 2) * sisiMiring;
    }

    public double hitungSelimut() {
        return Math.PI * jari * sisiMiring;
    }

    public double hitungAlasLingkarang() {
        return Math.PI * Math.pow(jari, 2);
    }

    public double hitungLuasPermukaan() {
        return hitungAlasLingkarang() + hitungSelimut();
    }
}
