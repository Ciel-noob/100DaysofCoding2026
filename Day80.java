import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
        Scanner input = new Scanner(System.in);
        System.out.println("Indeks array yang tersedia = 0 sampai 4");
        System.out.print("Masukkan indeks yang ingin diakses: ");
        int indeks = input.nextInt();

        if (indeks >= 0 && indeks < angka.length) {
            System.out.println("Elemen pada indeks " + indeks + " adalah " + angka[indeks]);
        } else {
            System.out.println("Indeks tidak valid. Masukkan indeks dari 0 sampai 4");
        }

        input.close();
    }
}
