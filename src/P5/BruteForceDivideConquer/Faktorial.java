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
        for (int i = 1; i <= nilai; i++) {
            fakto *= i;
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