import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int a = in.nextInt();
        if (a%2==0) {
            System.out.println(a + " adalah bilangan genap.");
        } else {
            System.out.println(a + " adalah bilangan ganjil.");
        }
        in.close();
    }
}
