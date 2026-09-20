import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%-20s: ", "Masukkan Nilai");
        double f = in.nextDouble();
        float e = (float) f;
        long d = (long) e;
        int c = (int) d;
        short b = (short) c;
        byte a = (byte) b;
        String k1 = "Escofierrrr, Plissss Comeeee HOMEEEEEEEEEEEEE :))))))) ";

        System.out.printf("%-20s: %d\n", "Hasil Byte ", a);
        System.out.printf("%-20s: %d\n", "Hasil Short ", b);
        System.out.printf("%-20s: %d\n", "Hasil Int ", c);
        System.out.printf("%-20s: %d\n", "Hasil Long ", d);
        System.out.printf("%-20s: %.0f\n", "Hasil Float ", e);
        System.out.printf("%-20s: %.0f\n", "Hasil Double ", f);
        System.out.printf(k1);

        in.close();
    }
}
