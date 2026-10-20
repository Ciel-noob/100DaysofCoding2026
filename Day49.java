import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Waifu Anda: ");
        int nilai = in.nextInt();
        String hasil = nilai < 1 ? "Setia Banget Wakk :)" : "Karbit:(";
        System.out.println("Hasil: " + hasil);
        System.out.print("Are You Gay Mister?(Yes/No)");
        String a = in.next();
        String b = a.equalsIgnoreCase("a") ? "Yes" : "No";
        System.out.println(b);
        in.close();
    }
}
