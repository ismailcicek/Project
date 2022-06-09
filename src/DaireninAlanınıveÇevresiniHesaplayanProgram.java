import java.util.Scanner;

public class DaireninAlanınıveÇevresiniHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int r,a;
        double pi=3.14,alan;

        System.out.print("Dairenin yarı çapını giriniz :");
        r = inp.nextInt();

        System.out.print("Dairenin merkez açısının ölçüsünü giriniz :");
        a = inp.nextInt();


        alan = Math.sqrt(pi * (r * r) * a) / 360;

        System.out.print("Dairenin alanı :" + alan);


    }

}
