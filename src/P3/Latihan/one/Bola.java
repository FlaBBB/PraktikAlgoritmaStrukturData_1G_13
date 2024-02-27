package P3.Latihan.one;

public class Bola {
    public int radius;

    public Bola(int r) {
        radius = r;
    }

    public double hitungVolume() {
        return 4/3 * Math.PI * Math.pow(radius, 3);
    }
    
    public double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
