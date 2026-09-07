import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner gay = new Scanner(System.in);
        char namaDetektif = 'L';
        char angka = '7';
        char barisBaru = '\n';
        char tab = '\t';

        System.out.println(namaDetektif +"  Boku no KACHIDA!!!");
        System.out.println(angka);
        System.out.println("Baris baru: " + barisBaru);
        System.out.println("Tab: " + tab);

        System.out.println("Masukkan pilihan (true/false): ");
        boolean youAreGay = gay.nextBoolean();
        if (youAreGay) {
            System.out.println("Get Some Help!");
        } else {
            System.out.println("Nice");
        }
        gay.close();
    }
}