import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

    double armutkg=2.14,elmakg=3.67,domateskg=1.11,muzkg=0.95,patlıcankg=5.00,tutar;
    double armut,elma,domates,muz,patlıcan;





    System.out.print("Armut Kaç Kilo :");
    armut = inp.nextDouble();

    System.out.print("Elma Kaç Kilo :");
    elma = inp.nextDouble();

    System.out.print("Domates Kaç Kilo :");
    domates = inp.nextDouble();

    System.out.print("Muz Kaç Kilo :");
    muz = inp.nextDouble();

    System.out.print("Patlıcan Kaç Kilo :");
    patlıcan = inp.nextDouble();

    tutar =(armut *armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlıcan*patlıcankg);



    System.out.print("Toplam Tutar :"+tutar+("TL")  );





    }
}
