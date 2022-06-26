import java.util.Scanner;

public class SıfırdanGirilenSayıların3ve4eTamBölünenSayılarınOrtalamasınıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = 0, toplam = 0,sayı = 0;
        double ortalama;

        System.out.print("Bir Sayı Giriniz :");
        k = input.nextInt();


        for (int i = 0; i <= k; i ++){
            if (i % 3 == 0 && i % 4 == 0){

                toplam += i;
                sayı ++;

            }

        }
        ortalama = toplam/(sayı -1);
        System.out.println("0'dan girilen sayının 3'e ve 4'e bölümünün ortalaması :" + ortalama);
    }
}