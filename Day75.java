import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Teks Pertama: ");
        String teks1 = in.nextLine();

        System.out.print("Masukkan Teks Pembanding: ");
        String teks2 = in.nextLine();

        System.out.print("Masukkan Kata Kunci yang ingin dicari(Pertama): ");
        String kKunci = in.nextLine();
        
        System.out.println();
        System.out.println("Teks Sama Persis: " + teks1.equals(teks2));
        System.out.println("Teks Sama (Huruf Besar/Kecil): "+ teks1.equalsIgnoreCase(teks2));
        System.out.println("Teks Pertama mengandung Kata Kunci: "+ teks1.contains(kKunci));
        System.out.println("Kata Kunci Kosong: " + kKunci.isEmpty());
        in.close();
    }
}

