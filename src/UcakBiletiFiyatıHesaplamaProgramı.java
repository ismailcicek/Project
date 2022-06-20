import java.util.Scanner;
public class UcakBiletiFiyatıHesaplamaProgramı {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int km,yas,tip;
        double normalFiyat,yasIndırımı,tipIndirimi;

        System.out.print("Mesafeyi km cinsinden giriniz :");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz :");
        yas = input.nextInt();

        System.out.print("Yolculuk Tipini Seçiniz.\n1=Tek Gidiş \n2=Gidiş/Dönüş :");
        tip = input.nextInt();

        if (km >0 && yas > 0  && (tip == 1 || tip == 2)) {
            normalFiyat = km * 0.10;
            if (yas < 12) {
                yasIndırımı = normalFiyat * 0.50;
            }else if (yas >= 12 && yas <= 24) {
                yasIndırımı = normalFiyat * 0.10;
            }else if (yas >= 65){
                yasIndırımı = normalFiyat * 0.30;
            }else{
                yasIndırımı = 0;
            }
            normalFiyat = (normalFiyat - yasIndırımı);
            if (tip == 2){
                tipIndirimi = normalFiyat * 0.20;
                normalFiyat = (normalFiyat - tipIndirimi) * 2 ;
            }
            System.out.print("Bilet Tutarı :" + normalFiyat);
        }else {
            System.out.print("Girilen bilgiler eksik veya hatalıdır.\nLütfen Kontrol ediniz.");
        }



    }
}
