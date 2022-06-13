import java.util.Scanner;

public class HesapMakinasiProgramiSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1,n2,select;

        System.out.print("İlk sayıyı giriniz :");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz :");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-çarpma\n4-Bölme");
        System.out.print("Seçiminiz :");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam :" + (n1+n2));
                System.out.print("işleminiz Tamamlandı.");
                break;
            case 2:
                System.out.println("Çıkarma :" + (n1-n2));
                System.out.print("işleminiz Tamamlandı.");
                break;
            case 3:
                System.out.println("Çarpma :" + (n1*n2));
                System.out.print("işleminiz Tamamlandı.");
                break;
            case 4:
                if (n2 != 0){
                    System.out.println("Bölme :" + (n1/n2));
                    System.out.print("işleminiz Tamamlandı.");
                }else {
                    System.out.println("0 Bölünemez.");
                    System.out.print("Lütfen 0'dan Büyük Sayı Giriniz!");
                }
                break;
            default:

                System.out.println("Yanlış Bir Seçim Yaptınız.\nLütfen Tekrar Deneyiniz!");




        }



    }
}
