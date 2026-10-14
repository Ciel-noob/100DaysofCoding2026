import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int a = in.nextInt();

        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println(a + " Adalah Bilangan Kelipatan 3 & 5");
        } else if (a % 3 == 0) {
            System.out.println(a + " Adalah Bilangan kelipatan 3");
        } else if (a % 5 == 0) {
            System.out.println(a + " Adalah Bilangan kelipatan 5");
        } else {
            System.out.println(a + " Bukan Angka Kelipatan");
        }
        in.close();
    }
}
