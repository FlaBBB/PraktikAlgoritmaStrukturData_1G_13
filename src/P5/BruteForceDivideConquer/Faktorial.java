package P5.BruteForceDivideConquer;

/**
 * Factorial.
 */
public class Faktorial {
    public int nilai;

    Faktorial (int nilai) {
        this.nilai = nilai;
    }

    public int factorialBF () {
        int fakto = 1;
        int i = 2;
        while (i  <= nilai) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }

    public int factorialDC (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialDC(n - 1);
        }
    }
}