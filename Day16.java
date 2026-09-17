import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%-25s: ","Masukkan Angka Pertama ");
        int angka1 = input.nextInt();

        System.out.printf("%-25s: ","Masukkan Angka Kedua ");
        int angka2 = input.nextInt();

        // Jika Angka 2 Bukan 0
        if (angka2 != 0) {
            int sisaBagi = angka1 % angka2;
            System.out.printf("%-25s: %d\n","Sisa Bagi ", sisaBagi);
            //Jika Angka 2 Adalah 0
        } else {
            System.out.printf("Pembagi tidak boleh nol.");
        }
        input.close();
    }
}