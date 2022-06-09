import java.util.Scanner;

public class NotOrtalamasıHesaplama {
    public static void main(String[] args) {


        int  mat,fizik,kimya,turkce,tarih,muzik;

        Scanner deger = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = deger.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = deger.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = deger.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = deger.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = deger.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = deger.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6 ;

        System.out.println("Not Ortalamanız : " + sonuc);
        System.out.print(sonuc > 60 ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.");

    }
}
