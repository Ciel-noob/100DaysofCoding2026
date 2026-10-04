import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = in.nextLine();
        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();
        System.out.print("Masukkan persentase kehadiran: ");
        int kehadiran = in.nextInt();

        // Kondisi berupa variabel boolean
        boolean sudahMendaftar = true;
        if (sudahMendaftar) {
            System.out.println("Kamu sudah terdaftar.");
        }

        // Kondisi menggunakan operator relasional
        if (nilai >= 75) {
            System.out.println("Lulus.");
        } else {
            System.out.println("Belum lulus.");
        }

        // Kondisi menggunakan operator logika
        if (nilai >= 75 && kehadiran >= 80) {
            System.out.println("Memenuhi syarat nilai dan kehadiran.");
        } else {
            System.out.println("Nilai atau kehadiran belum memenuhi syarat.");
        }

        // Kondisi menggunakan method String
        if (nama.equalsIgnoreCase("Budi")) {
            System.out.println("Halo, Budi!");
        } else {
            System.out.println("Halo, " + nama + "!");
        }

        in.close();
    }
}