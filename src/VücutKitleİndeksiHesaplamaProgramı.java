import java.util.Scanner;

public class VücutKitleİndeksiHesaplamaProgramı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double kilo, boy, kitle;

        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = inp.nextDouble();

        System.out.print("Lütfen boyunuzu giriniz :");
        boy = inp.nextDouble();

        kitle = kilo / (boy * boy);

        System.out.print("Vücüt Kitle İndeksiniz :" + kitle);

    }
}
