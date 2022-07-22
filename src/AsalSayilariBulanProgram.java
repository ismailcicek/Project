import java.util.Scanner;

public class AsalSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int n = input.nextInt();
        String asalsayı= " ";
        for (int i = 1; i <= n; i++) {
            int counter = 0;
            for (int k = i; k >= 1; k--) {
                if (i % k == 0){
                    counter ++;
                }
            }
            if ( counter ==2){
             asalsayı += i + " ";
            }
        }
        System.out.print(n + " Sayısına kadar olan Asal sayı :" +asalsayı);
    }
}
