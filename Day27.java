import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        double angka = in.nextDouble();

        System.out.printf("%-14s: %.0f\n", "Nilai awal", angka);

        System.out.printf("%-30s: %.0f\n", "Post-increment (angka++)", angka++);
        System.out.printf("%-30s: %.0f\n", "Nilai setelah post-increment", angka);

        System.out.printf("%-30s: %.0f\n", "Pre-increment (++angka)", ++angka);

        System.out.printf("%-30s: %.0f\n", "Post-decrement (angka--)", angka--);
        System.out.printf("%-30s: %.0f\n", "Nilai setelah post-decrement", angka);

        System.out.printf("%-30s: %.0f\n", "Pre-decrement (--angka)", --angka);
    }
}
