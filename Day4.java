public class Day4 {
    public static void main(String[] args) {
        // byte 127
        byte nilaiMatematika = 85;
        byte nilaiBahasaIndonesia = 95;
        byte nilaiFisika = 92;
        byte nilaiBahasaInggris = 96;
        // short 32.767
        short tahunAkademik =2026;
        // int 2.147.483.647
        int totalNilai = nilaiMatematika + nilaiBahasaIndonesia + nilaiFisika + nilaiBahasaInggris;
        int jumlahSiswa = 500;
        // Long 9.223.372.036.854.775.807
        long jumlahWarga = 2_000_000L;

        System.out.println("Nilai Matematika: " + nilaiMatematika);
        System.out.println("Nilai Bahasa Indonesia: " + nilaiBahasaIndonesia);
        System.out.println("Nilai Bahasa Inggris: " + nilaiBahasaInggris);
        System.out.println("Nilai Fisika: " + nilaiFisika);
        System.out.println("Total Nilai: " + totalNilai);
        System.out.println("Tahun Akademik: " + tahunAkademik);
        System.out.println("Jumlah Siswa: " + jumlahSiswa);
        System.out.println("Jumlah Warga: " + jumlahWarga);

    }
}
