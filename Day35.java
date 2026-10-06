import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int a = in.nextInt();
        if (a>0){
            if (a%2==0){
                System.out.println("Positif Genap");
            } else {
                System.out.println("Positif Ganjil");
            }
        } else if (a<0) {
            if (a%2==0){
                System.out.println("Negatif Genap");
            } else {
                System.out.println("Negatif Ganjil");
            }
        } else {
            System.out.println("Netral");
        }
    }
}
