import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===Menu===");
        System.out.println("===Makanan===");
        System.out.println("1. Nasi Kuning: Rp 12.000");
        System.out.println("2. Nasi Goreng: Rp 10.000");
        System.out.println("3. Mie Ayam: Rp 15.000");
        System.out.println("4. Bakso: Rp 12.000");
        System.out.println("5. Nasi Ayam Geprek: 10.000");
        System.out.print("Pilih:");
        int a = in.nextInt();
        System.out.println("===Pesanan===");
        switch (a) {
            case 1:
                System.out.println("Anda Memesan Nasi Kuning:) ");
                break;
            case 2:
                System.out.println("Anda Memesan Nasi Goreng:)");
                break;
            case 3:
                System.out.println("Anda Memesan Mie Ayam:)");
                break;
            case 4:
                System.out.println("Anda Memesan Bakso:)");
                break;
            case 5:
                System.out.println("Anda Memesan Nasi Ayam Geprek:)");
                break;
            default:
                System.out.println("Menu Tak Tersedia:)");
                break;
        }
        System.out.println("Selamat Menikmati");
        in.close();
    }
}
