import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Judul manhwa fav: ");
        String judul = in.nextLine();
        System.out.print("Masukkan Nama MC Anda: ");
        String nama = in.nextLine();
        System.out.print("Masukkan Kata di Awal/Akhir Judul Manhwa Anda: ");
        String kKunci = in.nextLine();
        System.out.print("Masukkan Teks Tambahan untuk Teks Diawal: ");
        String judulTambah = in.nextLine();

        System.out.println("Judul manhwa: " + judul);
        System.out.println("Karakter pertama: " + judul.charAt(0));
        System.out.println("Karakter terakhir: " + judul.charAt(judul.length() - 1));
        System.out.println("Posisi pertama nama MC: " + judul.indexOf(nama));
        System.out.println("Posisi terakhir nama MC: " + judul.lastIndexOf(nama));
        System.out.println("Judul diawali kata kunci: " + judul.startsWith(kKunci));
        System.out.println("Judul diakhiri kata kunci: " + judul.endsWith(kKunci));
        System.out.println("Hasil concat: " + judul.concat(judulTambah));
    }
}
