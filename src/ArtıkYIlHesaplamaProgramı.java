import java.util.Scanner;

public class ArtıkYIlHesaplamaProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean artıkYıl = false;
        int year;

        System.out.print("Lütfen bir yıl giriniz.");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    artıkYıl = true;
                }else{
                    artıkYıl = false;
                }
            }else {
                artıkYıl = true;
            }
        } else{
            artıkYıl = false;
        }

        if (artıkYıl){
            System.out.println(year + " yılı bir artık yıldır !");
        }else{
            System.out.println(year + " yılı bir artık yıl değildir !");
        }
    }
}
