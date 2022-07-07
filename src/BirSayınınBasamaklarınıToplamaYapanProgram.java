import java.util.Scanner;

public class BirSayınınBasamaklarınıToplamaYapanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Bir sayı giriniz :");
        number = input.nextInt();

        int total = 0, piece = 0, tempNumber;
        tempNumber = number;


        while (tempNumber != 0) {
            total += (tempNumber % 10);
            tempNumber /= 10;
            piece++;
        }
        System.out.print(number+" = "+total);
    }
}