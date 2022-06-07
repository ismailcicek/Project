import java.util.Scanner;

public class KDVTutarıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double  fiyat,kdvoranı,kdv,kdvli;
        boolean kdvtürü;
        System.out.print("Ürünün Fiyatını Giriniz :");
        fiyat=input.nextDouble();

        kdvtürü = 0<fiyat && 1001>fiyat ;
        kdvoranı = kdvtürü ? 0.18 : 0.08;




        kdvli = fiyat+fiyat*kdvoranı;
        kdv = fiyat*kdvoranı;

        System.out.println(kdvtürü ? "1000tl altı alışveriş yaptığınız %18 kdv ödemek zorundasınız." : "1000tl üzeri alışveriş yaptığınız için %8 kdv ödemek zorundasınız.");

        System.out.println("Kdv'li Fiyat :" + kdvli);
        System.out.println("Kdv Tutarı :" + kdv);
        System.out.println("Kdv'siz Tutar :" + fiyat);
        System.out.println("Kdv Oranı : " + kdvoranı);




    }


}
