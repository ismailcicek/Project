import java.util.Scanner;

public class HavaSıcaklıgınaGöreEtkinlikÖnermeProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heat;


        System.out.print("Hava Sıcaklığını Giriniz :");
        heat = input.nextInt();

        if (heat <= 5)
            System.out.print("Uff havada baya soğukmuş.\nBu havada en iyi aktivite kayak yapmak.");

        else if (heat <= 10)
            System.out.print("Hava biraz serin.\nBu havada en iyisi mangal yakmak o yüzden pikniğe gidiyoruz.");

        else if (heat <= 15)
            System.out.print("Hava çok güzel.\nBu havada yapıcak en iyi şey mısır ve kolayı alıp sinemaya gitmek.");

        else
            System.out.println("Uff hava cok sıcak ve bunaltıcı.\nBu havada en iyisi yüzmeye gidip serinlemek");


    }
}
