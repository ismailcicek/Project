import java.util.Scanner;
public class CinZodyagıHesaplamaProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        String burc = "" ;

        System.out.print("Doğum yılınızı yazınız :");
        year = input.nextInt();

        switch (year % 12){
            case 0:
                burc = "Maymun";
                break;

            case 1:
                burc = "Horoz";
                break;

            case 2:
                burc = "Köpek";
                break;

            case 3:
                burc = "Domuz";
                break;

            case 4:
                burc = "Fare";
                break;

            case 5:
                burc = "Öküz";
                break;

            case 6:
                burc = "kaplan";
                break;

            case 7:
                burc = "tavşan";
                break;

            case 8:
                burc = "Ejderha";
                break;

            case 9:
                burc = "Yılan";
                break;

            case 10:
                burc = "At";
                break;

            case 11:
                burc = "Koyun";
                break;


            default:
                System.out.print("Yanlış bir yıl girdiniz lütfen bilgilerinizi kontrol ediniz.");



        }System.out.println("Çin Zodyağı Burçunuz :"  + burc);


    }
}
