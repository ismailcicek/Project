import java.util.Scanner;

public class UsluSayıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k, total = 1;

        System.out.print("Üssü alınacak sayıyı giriniz :");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz :");
        k = input.nextInt();

        for (int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.print("Cevap :" + total);
    }
}
