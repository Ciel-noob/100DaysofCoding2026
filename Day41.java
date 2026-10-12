import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Suhu Ruangan (°C): ");
        double suhu = in.nextDouble();

        if (suhu < 20) {
            System.out.println("Suhu ruangan dingin.");
        } else if (suhu <= 30) {
            System.out.println("Suhu ruangan normal.");
        } else if (suhu <= 40){
            System.out.println("Suhu ruangan panas.");
        }else{
            System.out.println("Hot Bangett Suhunya :p");
        }
        in.close();
    }
}
