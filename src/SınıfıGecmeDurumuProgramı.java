import java.util.Scanner;

public class SınıfıGecmeDurumuProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,turk,kimya,muzik;

        System.out.print("Matematik Notunuz :");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz :");
        turk = input.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = input.nextInt();


        if (mat < 0 || mat > 100)
            mat = 0;

        if (fizik < 0 || fizik> 100)
            fizik = 0;

        if (turk < 0 || turk > 100)
            turk = 0;

        if (kimya < 0 || kimya > 100)
            kimya = 0;

        if (muzik < 0 || muzik > 100)
            muzik = 0;

    double ortalama = (mat + fizik + turk + kimya + muzik) / 5;

    if (ortalama < 55){
        System.out.println("Sınıfta kaldınız seneye tekrar görüşmek üzere.");
    }
    else {
        System.out.println("Sınıfı geçtiniz tebrikler.");
    }

        System.out.println("Ortalamanız :" + ortalama);

    }

}
