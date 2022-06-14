import java.util.Scanner;

public class KullanıcıGirisProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String usarName,password,reset,newpassword;

        System.out.print("Kullanıcı Adınızı Giriniz :");
        usarName = input.nextLine();

        System.out.print("Şifreniniz Giriniz :");
        password = input.nextLine();

        if (usarName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Yaptınız.");
        }else  {
            System.out.println("Bilgileriniz Yanlış.\nLütfen Bilgilerinizi Kontrol Edip Tekrar Deneyiniz!");
            System.out.print("Şifrenizi Sıfırlamak İster Misiniz?\n1-Evet\n2-Hayır");
        }
        select = input.nextInt();
        switch (select){
            case 1:
                System.out.println("Şifre Degişimi Seçtiniz!");
                System.out.print("Lütfen Yeni Şifrenizi Giriniz :");
                newpassword = input.nextLine();
                break;
            case 2:
                System.out.print("Lütfen Sayfayı yenileyiniz.");
                break;
            default:
                System.out.print("Lütfen Doğru Seçim Yapınız");
            }

            newpassword = input.nextLine();

            if (newpassword.equals("java321")){
            System.out.print("Şifreniz Başarıyla Değiştirildi.");
            }
            else if (newpassword.equals("java123")){
            System.out.print("Eski şifrenizi Yeniden Kullanamasınız.");
            }
    }


}



