import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%-25s: ", "Masukkan Panjang (cm)");
        double p = in.nextDouble();

        System.out.printf("%-25s: ", "Masukkan Lebar (cm)");
        double l = in.nextDouble();

        double luas = p * l;
        System.out.printf("%-25s: %.1f cm^2%n", "Luas persegi panjang", luas);
    }
}
