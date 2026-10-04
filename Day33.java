import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String nama = in.nextLine();
        System.out.print("Masukkan Jumlah MBG(My BINI GWEHH) Anda: ");
        int b = in.nextInt();
        System.out.print("Status Character Anda(Mc?) true/false: ");
        boolean mc = in.nextBoolean();

        if (mc) 
            System.out.println("Noted, Anda Adalah Mc.");
        
        if (b > 1) {
            System.out.println("Dasar Karbitan.");
        } else {
            System.out.println("Anda itu Setia (AFFAH Iyya??) .");
        }

        if (b > 1 && mc) {
            System.out.println("Inimah Karbit :) ");
        } else {
            System.out.println("Hsy, is That You??");
        }
        in.close();
    }
}