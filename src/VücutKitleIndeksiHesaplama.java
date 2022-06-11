import java.util.Scanner;

public class VücutKitleIndeksiHesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double kg,mm,kitle;

        System.out.print("Lütfen Boyunuzu (Metre Cinsinde) Giriniz :");
        mm = inp.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz :");
        kg = inp.nextDouble();

        kitle = kg/ (mm*mm);

        System.out.print("Vücüt Kitle İndeksiniz :" + kitle);



    }
}
