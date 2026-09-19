import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-20s: ","Masukkan Nilai <128 ");
        byte a = input.nextByte();
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;
        input.nextLine();
        String k1 = "51/49";

        System.out.printf("%-20s: %d\n","Hasil Byte ", a);
        System.out.printf("%-20s: %d\n","Hasil Short ", b);
        System.out.printf("%-20s: %d\n","Hasil Int ", c);
        System.out.printf("%-20s: %d\n","Hasil Long ", d);
        System.out.printf("%-20s: %.0f\n","Hasil Float ", e);
        System.out.printf("%-20s: %.0f\n\n","Hasil Double ", f);
        System.out.printf("Pecahan Kim Dokja %s%% itu Di My Dalam Diri Gwehh ", k1);
    }
}
