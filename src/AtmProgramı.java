import java.util.Scanner;

public class AtmProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select;
        int balance = 1500;
        int price;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız :");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("1-Para Yatırma\n" + "2-Para çekme\n" + "3-Bakiye sorgulama\n" + "4-Çıkış yap\n");
                    System.out.print("Lütfen yapmak itediğniz işlemi seçiniz :");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarını giriniz :");
                            price = input.nextInt();
                            System.out.println("Para yatırma işleminiz gercekleşti.");
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarını giriniz :");

                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye!");
                            } else {
                                balance -= price;
                                System.out.println("Para çekim işleminiz gerçekleşti.");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;
                        case 4:
                            System.out.println("İyi günler. Tekrar bekleriz.");
                            break;
                    }
                } while (select != 4);

                break;

            } else {
                right--;
                System.out.println("Kullanıcı adı veye şifre yanlış. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan giriş hakkınız :" + right);
                }
            }

        }
    }
}
