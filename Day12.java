import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENGISI BIODATA ===");
        System.out.println("Nama Anda");
        String nama = input.nextLine();
        System.out.println("Umur Anda");
        int umur = input.nextInt();
        input.nextLine();
        System.out.println("Asal Sekolah Anda");
        String sekolah = input.nextLine();
        System.out.println("Universitas Dan Jurusan Anda");
        String kuliah = input.nextLine();
        System.out.println("Judul Karya Buku Dari Segala Genre Favorit Anda");
        String judulKarya = input.nextLine();
        System.out.println("Apakah Anda Lelaki? (true/false): ");
        boolean kelamin = input.nextBoolean();

        System.out.printf("Nama Saya %s,%nUmur saya %d tahun,%nSaya Alumni Dari %s,%nSaya Melanjutkan Studi di %s,%nJudul Favorit Saya Adalah %s%n", nama, umur, sekolah, kuliah, judulKarya);
        if (kelamin) {
            System.out.printf("%B: Anda Adalah Lelaki Gantengg:)", kelamin);
        }else {
            System.out.printf("%B: Anda Adalah Wanita Cantik:)", kelamin);

            input.close();
        }
    }
}
