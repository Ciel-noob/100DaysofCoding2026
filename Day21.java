import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai String: ");
        String a = in.nextLine();
        int b = Integer.parseInt(a);
        short c = Short.parseShort(a);
        byte d = Byte.parseByte(a);
        long e = Long.parseLong(a);
        float f = Float.parseFloat(a);
        double g = Double.parseDouble(a);
        char h = a.charAt(0);
        System.out.printf("\n");

        System.out.printf("%-15s: %s\n","Nilai String ", a);
        System.out.printf("%-15s: %d\n","Nilai Int ", b);
        System.out.printf("%-15s: %d\n","Nilai Short ", c);
        System.out.printf("%-15s: %d\n","Nilai Byte ", d);
        System.out.printf("%-15s: %d\n","Nilai Long ", e);
        System.out.printf("%-15s: %.1f\n","Nilai Float ", f);
        System.out.printf("%-15s: %.1f\n","Nilai Double ", g);
        System.out.printf("%-15s: %s\n","Nilai 1 Char ", h);

        in.close();
    }
}
        
