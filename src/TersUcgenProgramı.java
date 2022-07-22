import java.util.Scanner;

public class TersUcgenProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Üçgen boyunu giriniz :");
        n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int t = 1; t <= (2 * n) - (i * 2 + 1); t++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
