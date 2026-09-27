import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%-25s: ", "Masukkan Nama");
        String nama = in.nextLine();

        System.out.printf("%-25s: ", "Masukkan NIM");
        String nim = in.nextLine();

        System.out.printf("%-25s: ", "Masukkan Kelas");
        char kelas = in.next().charAt(0);

        System.out.printf("%-25s: ", "Masukkan Umur");
        int umur = in.nextInt();
        in.nextLine();

        System.out.printf("%-25s: ", "Masukkan Prodi");
        String prodi = in.nextLine();

        System.out.printf("%-25s: ", "Masukkan IPK");
        double ipk = in.nextDouble();

        System.out.printf("%-25s: ", "Status Keaktifan");
        boolean aktif = in.nextBoolean();

        System.out.printf("\n");
        System.out.println("===== BIODATA MAHASWA =====");
        System.out.printf("%-18s: %s%n", "Nama", nama);
        System.out.printf("%-18s: %s%n", "NIM", nim);
        System.out.printf("%-18s: %s%n", "Kelas", kelas);
        System.out.printf("%-18s: %d%n", "Umur", umur);
        System.out.printf("%-18s: %s%n", "Prodi", prodi);
        System.out.printf("%-18s: %.2f%n", "IPK", ipk);
        System.out.printf("%-18s: %s%n", "Status Aktif", aktif);
        System.out.println("=============================");

        final double PI = 3.24;
        System.out.printf("%-25s: ", "Masukkan Jari-jari (cm)");
        double r = in.nextDouble();

        double luas = PI * r * r;
        System.out.printf("\n");
        System.out.println("=== HASIL ===");
        System.out.printf("%-25s: %.1f cm^2%n", "Hasil Luas Lingkaran", luas);

        System.out.printf("%-15s: ", "Masukkan nilai a");
        int a = in.nextInt();

        System.out.printf("%-15s: ", "Masukkan nilai b");
        int b = in.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("\n");
        System.out.println("=== HASIL SWAP ===");
        System.out.printf("%-15s: %d%n", "a", a);
        System.out.printf("%-15s: %d%n", "b", b);

        in.close();
    }
}
