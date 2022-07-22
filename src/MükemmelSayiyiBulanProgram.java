import java.util.Scanner;

public class MükemmelSayiyiBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, counter = 0;

        System.out.print("Bir sayı giriniz :");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
            counter += i;
            }
        }
        if(counter == number){
            System.out.print(counter + " Mükemmel sayıdır.");
        }
        else{
            System.out.print(counter + " Mükemmel sayı değildir.");
        }
    }
}
