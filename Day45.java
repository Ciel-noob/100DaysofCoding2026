import java.util.Scanner;
import java.util.Locale;

public class Day45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dear Mister, Are You Gay (yes/no): ");
        String a = in.nextLine();
        switch (a) {
            case "yes":
                System.out.println("Speak Again, Can't Hear u With Pity D*ck in ur Mouth :|");
                break;
            default:
                System.out.println("Good Sir, Arise That Sword At Ur Specials");
                break;
        }
        in.close();
    }
}
