package P5;

public class Pangkat {
    public int nilai, pangkat;

    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    static int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a;
            } else {
                return pangkatDC(a, n / 2) * pangkatDC(a, n / 2);
            }
        }
    }

    int pangkatDC() {
        return pangkatDC(nilai, pangkat);
    }   
}
