import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        byte b = input.nextByte();
        short s = input.nextShort();
        int i = input.nextInt();
        long l = input.nextLong();
        float f = input.nextFloat();
        double d = input.nextDouble();
        char c = input.next().charAt(0);
        boolean gay = input.nextBoolean();

        System.out.println("=== PRINTLN ===");
        System.out.println(nama);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(gay);

        System.out.println("=== PRINT ===");
        System.out.print(nama+"\n");
        System.out.print(b+"\n");
        System.out.print(s+"\n");
        System.out.print(i+"\n");
        System.out.print(l+"\n");
        System.out.print(f+"\n");
        System.out.print(d+"\n");
        System.out.print(c+"\n");
        System.out.println(gay+"\n");

        System.out.println("=== PRINTF ===");
        System.out.printf(nama+"\n");
        System.out.printf(b+"\n");
        System.out.printf(s+"\n");
        System.out.printf(i+"\n");
        System.out.printf(l+"\n");
        System.out.printf(f+"\n");
        System.out.printf(d+"\n");
        System.out.print(c+"\n");
        System.out.printf(gay+"\n");
    }
}
