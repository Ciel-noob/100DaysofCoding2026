import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%-25s: ","Masukkan Jari-jari (cm)");
        double r = in.nextDouble();
        double luas = Math.PI*r*r;
        System.out.printf("\n");
        System.out.println("=== HASIL ===");
        System.out.printf("%-25s: %.1f cm^2","Hasil Luas Lingkaran", luas);
        in.close();
    }
}
