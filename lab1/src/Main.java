import java.util.Random;
public class Main {
    public static double matematika(int ti, double xj) {
        if (ti == 12) {
            return Math.cos(Math.pow((2.0 / 3.0) * Math.cbrt(xj), 3));
        } else if (ti == 4 || ti == 6 || ti == 10 || ti == 14) {
            return Math.exp(Math.cbrt(Math.cbrt(xj)));
        } else {
            double sinus = Math.sin(Math.asin((xj - 2.5) / 9.0)) + 1.0;
            return Math.log(Math.pow(Math.sin(4 / sinus), 2));
        }
    }
    public static void matrica(double[][] m) {
        for (int i = 0; i < 9; i=i+1) {
            for (int j = 0; j < 18; j++) {
                System.out.printf("%7.2f ", m[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] t = new int[9];
        int chislo = 2;
        for (int i = 0; i < 9; i=i+1) {
            t[i] = chislo;
            chislo += 2;
        }

        double[] x = new double[18];
        Random random = new Random();
        for (int j = 0; j < 18; j=j+1) {
            x[j] = -7.0 + 9.0 * random.nextDouble();
        }

        double[][] m = new double[9][18];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 18; j=j+1) {
                m[i][j] = matematika(t[i], x[j]);
            }
        }
        matrica(m);
    }
}