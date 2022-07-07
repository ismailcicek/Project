import java.util.Scanner;

public class YildizlarIleUcgenProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int o = 1; o < n; o++) {
            for (int t = 1; t <= o; t++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= ( 2 * n - (2 * o + 1) ); y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
