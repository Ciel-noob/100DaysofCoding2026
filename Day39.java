import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama: ");
        double a = in.nextDouble();
        
        System.out.print("Perintah (+, -, *, /, %): ");
        char c = in.next().charAt(0);
        
        System.out.print("Masukkan Angka Kedua: ");
        double b = in.nextDouble();
        
        if (c == '+') {
            System.out.println("Hasil: " + (a + b));
        } else if (c == '-') {
            System.out.println("Hasil: " + (a - b));
        } else if (c == '*') {
            System.out.println("Hasil: " + (a * b));
        } else if (c == '/') {
            if (b == 0) {
                System.out.println("Tidak bisa membagi dengan nol.");
            } else {
                System.out.println("Hasil: " + (a / b));
            }
        } else if (c == '%') {
            if (b == 0) {
                System.out.println("Tidak bisa membagi dengan nol.");
            } else {
                System.out.println("Hasil: " + (a % b));
            }
        } else {
            System.out.println("Perintah tidak valid.");
        }
        in.close();
    }
}
