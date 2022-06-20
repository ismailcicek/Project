import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month,day;
        String burc = "";
        boolean isError = false;

        System.out.print("Doğduğunuz ayı giriniz :");
        month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz :");
        day = input.nextInt();

        if (month == 1){
            if (day >= 1 && day <= 31){
                if (day <= 21){
                    burc = "Oğlak";
                }else {
                    burc = "Kova";
                }
            }else {
                isError = true;
            }
        }else if (month == 2){
            if (day >= 1 && day <= 28){
                if (day <= 19){
                    burc = "Kova";
                }else {
                    burc = "Balık";
                }
            }else {
                isError = true;
            }
        }else if (month == 3){
            if (day >= 1 && day <= 31){
                if (day <= 20){
                    burc = "Balık";
                }else {
                    burc = "Koç";
                }
            }else {
                isError = true;
            }
        }else if (month == 4){
            if (day >= 1 && day <= 30){
                if (day <= 19){
                    burc = "Koç";
                }else {
                    burc = "Boğa";
                }
            }else {
                isError = true;
            }
        }else if (month == 5){
            if (day >= 1 && day <= 31){
                if (day <= 21){
                    burc = "Boğa";
                }else {
                    burc = "İkizler";
                }
            }else {
                isError = true;
            }
        }else if (month == 6){
            if (day >= 1 && day <= 30){
                if (day <= 22){
                    burc = "İkizler";
                }else {
                    burc = "Yengeç";
                }
            }else {
                isError = true;
            }
        }else if (month == 7){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    burc = "Yengeç";
                }else {
                    burc = "Aslan";
                }
            }else {
                isError = true;
            }
        }else if (month == 8){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    burc = "Aslan";
                }else {
                    burc = "Başak";
                }
            }else {
                isError = true;
            }
        }else if (month == 9){
            if (day >= 1 && day <= 30){
                if (day <= 22){
                    burc = "Başak";
                }else {
                    burc = "Terazi";
                }
            }else {
                isError = true;
            }
        }else if (month == 10){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    burc = "Terazi";
                }else {
                    burc = "Akrep";
                }
            }else {
                isError = true;
            }
        }else if (month == 11){
            if (day >= 1 && day <= 30){
                if (day <= 21){
                    burc = "Akrep";
                }else {
                    burc = "Yay";
                }
            }else {
                isError = true;
            }
        }else if (month == 12){
            if (day >= 1 && day <= 31){
                if (day <= 22){
                    burc = "Kova";
                }else {
                    burc = "Balık";
                }
            }else {
                isError = true;
            }
        }
        if ((month > 12) || (month < 1)) {
            System.out.println("Hatalı ay veya gün girdiniz. Lütfen tekrar deneyiniz.");
        } else if (isError) {
            System.out.println("Hatalı ay veya gün girdiniz. Lütfen tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz " + burc);
        }

    }
}
