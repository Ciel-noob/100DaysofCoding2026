import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===Menu===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Nasi Padang");
        System.out.print("Pilih: ");
        int a = in.nextInt();
        
        if (a == 1) {
            System.out.println("Nasi Goreng: Rp 12.000(Rate: 9/10)");
        } else if (a == 2) {
            System.out.println("Mie Ayam: Rp 15.000(Rate: 10/10)");
        } else if (a == 3) {
            System.out.println("Nasi Padang: Rp 18.000(Rate: 8/10)");
        } else {
            System.out.println("Belum Menambah Menu Lain");
        }
        in.close();
    }
}
