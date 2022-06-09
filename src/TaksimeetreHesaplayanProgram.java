import java.util.Scanner;

public class TaksimeetreHesaplayanProgram {
    public static void main(String[] args) {

    int km;

    double perKm=2.20,total,startPierce=10;

    Scanner input = new Scanner(System.in);

    System.out.print("Lütfen Mesafeyi KM Cinsinden giriniz :");
    km = input.nextInt();

    total = (km*perKm);
    total += startPierce;


    total = (total < 20 ) ? 20 : total ;

    System.out.print("Toplam tutar :" + total);



    }
}
