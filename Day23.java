import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%-25s: ","Masukkan sisi persegi ");
        double sisi = in.nextDouble();
        double luas = sisi*sisi;

        System.out.printf("%-25s= %.1f","Luas persegi ", luas);

        in.close();
    }
}
