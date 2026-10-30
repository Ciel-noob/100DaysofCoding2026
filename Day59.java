import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Bilangan M\t\t: ");
        int misFit = in.nextInt();
        if (misFit<= 0) {
            System.out.println("Bilangan M harus lebih dari 0.");
            System.out.println("Try Again:))");
            return;
        }
        System.out.print("Masukkan Bilangan N\t\t: ");
        int niggaBlack = in.nextInt();

        System.out.print("Kelipatan "+misFit+" dari 1 sampai "+niggaBlack+"\t: ");
        for (int i = misFit; i <= niggaBlack; i += misFit) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
