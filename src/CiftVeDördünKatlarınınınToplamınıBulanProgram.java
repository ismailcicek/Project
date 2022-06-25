import java.util.Scanner;
public class CiftVeDördünKatlarınınınToplamınıBulanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k ,total = 0;

        do {
            System.out.print("Bir Sayı Giriniz :");
            k = scan.nextInt();
            if (k % 2 ==0 && k % 4 == 0){
                total += k;
            }
        }while (k % 2 ==0);

        System.out.print("Girilen Sayıların Çift ve Dört Katlarının Toplamı :" + total);
    }


}
