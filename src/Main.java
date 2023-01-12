import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        double n1 , n2 ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : " );
        n1 = inp.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = inp.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminizi Yapınız : ");

        int secim = inp.nextInt();

        switch (secim){
            case 1 :
                System.out.println("iki Sayının Toplamı : " + (n1 +n2));
                break;
            case 2 :
                System.out.println("İki Sayının Farkı : " + (n1 - n2));
                break;
            case 3 :
                System.out.println("İki Sayının Çarpımı : " + (n1 * n2));
                break;
            case 4 :

                // İkinci sayının sıfır olarak girilmesi durumunda

                if (n2 == 0 ){
                    System.out.println("Herhangi Bir Sayı Sıfıra Bölünemez");
                }else{
                System.out.println("Birinci Sayının İkinci Sayıya Bölümü : " + (n1 /n2));}
                break;
            default:
                System.out.println("Lütfen Dört İşlemden Birisini Seçiniz !...");
                System.out.println("Lütfen Programı Tekrar Başlatınız ...");

        }
        System.out.println("Program Bitti İyi Çalışmalar !");
    }
}