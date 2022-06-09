import java.util.Scanner;

public class DikÜçgendeHipotenüsBulanProgram {
    public static void main(String[] args) {
      Scanner girdi= new Scanner(System.in);
      int a,b,c;
      double alan,u;


      System.out.print("1. Kenarı giriniz :");
      a = girdi.nextInt();

      System.out.print("2. Kenarı giriniz :");
      b = girdi.nextInt();

      System.out.print("3. Kenarı giriniz :");
      c = girdi.nextInt();

      u = (a+b+c)/2;

      alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

      //Heron Formülü

      System.out.print("Üçgenin Alanı :" + alan);








    }
}
