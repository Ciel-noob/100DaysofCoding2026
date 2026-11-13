import java.util.Scanner;

public class Day73 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pilihan;

        do {

            System.out.println("===== MENU UTAMA =====");
            System.out.println("1. My Biodata Gwehh");
            System.out.println("2. My Hobi Gwehh");
            System.out.println("3. Jurusan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = in.nextInt();
            switch (pilihan) {

                case 1:
                    System.out.println("Nama: Indra");
                    System.out.println("Status: Mahasiswa");
                    break;

                case 2:
                    System.out.println("Hobi: Baca Novel/Manga/Manhwa/Manhua");
                    System.out.println("P.S(Lagi Kecanduan Historical Angst)");
                    break;

                case 3:
                    System.out.println("Jurusan: Teknik Informatika");
                    break;

                case 4:
                    System.out.println("Done");
                    break;

                default:
                    System.out.println("Ciee pengen lgi!");
            }
        } while (pilihan != 4);
        in.close();
    }
}