import java.util.Scanner;
public class Day72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;

        for (;;) {
            System.out.print("Masukkan Angka (Angka Negatif untuk berhenti): ");
            int b = in.nextInt();

            if (b < 0) {
                break;
            }

            for (int i = 0; i < b; i++) {
                a++;
            }
        }

        System.out.println("Jumlah: " + a);
        in.close();
    }
}
