import java.util.Scanner;

public class waris {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        int kwhA = in.nextInt();
        int kwhB = in.nextInt();
        in.nextLine();
        String n = in.nextLine();
        int kwhS = kwhB-kwhA;
        int t=0;

        System.out.println("Pelanggan: "+n);
        System.out.println("Pemakaian: "+kwhS);
        if (g == 1) {
            if (kwhS >0 && kwhS < 100) {
                System.out.println("Tarif: Rp1500/kwh");
                System.out.println("Tagihan: Rp" + kwhS * 1500);
                t = kwhS * 1500;
            } else if (kwhS > 100 && kwhS < 250) {
                System.out.println("Tarif: Rp1750/kwh");
                System.out.println("Tagihan: Rp" + kwhS * 1750);
                t = kwhS*1750;
            } else if (kwhS >= 250) {
                System.out.println("Tarif : Rp2000/kwh");
                System.out.println("Tagihan: Rp" + kwhS * 2000);
                t= kwhS*2000;
            }
    
        }else if (g==2){
            if (kwhS<100){
                System.out.println("Tarif : Rp2000/kwh");
                System.out.println("Tagihan: Rp"+kwhS*2000);
                t=kwhS*2000;
            }else if (kwhS>=100&&kwhS<250){
                System.out.println("Tarif: Rp2250/kwh");
                System.out.println("Tagihan: Rp"+kwhS*2250);
                t=kwhS*2250;
            }else if (kwhS>250){
                System.out.println("Tarif: Rp2500/kwh");
                System.out.println("Tagihan: Rp"+kwhS*2500);
                t=kwhS*2500;
            }
        }else{
            System.out.println("Golongan tidak Valid");
        }if (t<=200000){
            System.out.println("Status: Ringan");
        }else if (t<=500000){
            System.out.println("Status: Sedang");
        }else{
            System.out.println("Status: Tinggi");
        }
    }
}
