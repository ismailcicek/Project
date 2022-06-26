import java.util.Scanner;

public class GirilenSayının4ve5KuvvetiniAlanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k;

        System.out.print("Sınır Sayısını giriniz :");
        k = input.nextInt();

        System.out.print("Girilen Sayının 4'uncü Kuvvetler :" );
        for (int n = 1; n <= k; n *= 4) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.print("Girilen Sayının 5'inci Kuvvetler :" );
        for (int n = 1; n <= k; n *= 5) {
            System.out.print(n + " ");
        }
    }
}
