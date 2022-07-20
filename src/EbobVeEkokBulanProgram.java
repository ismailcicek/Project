import java.util.Scanner;

public class EbobVeEkokBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, ekok = 1;

        System.out.print("n1 sayısını giriniz :");
        n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz :");
        n2 = input.nextInt();
        int ebob = 1;
        if (n1 < n2) {
            int k = n1;
            while (k >= 1) {
                k--;
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;
                    break;
                }
            }
            int i = 1;
            while (i <= (n1 * n2)) {
                i++;
                if (i % n1 == 0 && i % n2 == 0) {
                    break;
                }
            }
            System.out.print("Sayının EBOB :"+ebob +"\n" +  "Sayının EKOK :" + (n1 * n2)/ebob);
        }
        else {
            int k = n2;
            while (k >= 1) {
                k--;
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;
                    break;
                }
            }
            int i = 1;
            while (i <= (n1 * n2)) {
                i++;
                if (i % n1 == 0 && i % n2 == 0) {
                    break;
                }
            }
            System.out.print("Sayının EBOB :" + ebob + "\n" + "Sayının EKOK :" + (n1 * n2) / ebob);

        }
    }
}
