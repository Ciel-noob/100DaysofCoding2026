import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== Membuat Akun ===");
        System.out.print("Buat nama pengguna: ");
        String usernameAkun = in.nextLine();
        System.out.print("Buat kata sandi: ");
        String passwordAkun = in.nextLine();

        System.out.println("\nAkun berhasil dibuat. Silakan login.");
        String usernameLogin;
        String passwordLogin;

        do {
            System.out.println("=== Login ===");
            System.out.print("Nama pengguna: ");
            usernameLogin = in.nextLine();
            System.out.print("Kata sandi: ");
            passwordLogin = in.nextLine();

            if (!usernameAkun.equals(usernameLogin)|| !passwordAkun.equals(passwordLogin)) {
                System.out.println("Nama pengguna atau kata sandi salah. Coba lagi.");
                System.out.println();
            }
        } while (!usernameAkun.equals(usernameLogin)|| !passwordAkun.equals(passwordLogin));

        System.out.println("Login berhasil. Selamat datang, " + usernameAkun);
        in.close();
    }
}
