import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%-25s: Rp","Masukkan Gaji pokok");
        double gP = in.nextDouble();
        System.out.printf("%-25s: Rp","Masukkan Tunjangan");
        double t = in.nextDouble();
        System.out.printf("%-25s: Rp","Masukkan Pajak");
        double p = in.nextDouble();

        double gB = gP + t - p;
        System.out.printf("%-25s: Rp%.0f","Gaji bersih", gB);
        in.close();
    }
}
