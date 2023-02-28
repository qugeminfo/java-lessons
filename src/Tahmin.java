import java.util.Random;
import java.util.Scanner;

public class Tahmin {
    public static void main(String[] args) {
        System.out.println("1'den 100'e kadar bir sayı tut!");
        System.out.println("Şimdi onu bulmaya çalışacağım!");
        System.out.println("Bulduğum sayı doğruysa 0,");
        System.out.println("Bulduğum sayı senin sayından küçükse 1,");
        System.out.println("Bulduğum sayı senin sayından büyükse 2 yaz!");
        int min = 0;
        int max = 100;
        Scanner scanner = new Scanner(System.in);
        int cevap = -1;
        int tahmin;
        while (cevap != 0) {
            tahmin = min + (max-min) / 2;
            System.out.println("tuttuğun sayı bu mu?: " + tahmin);
            try {
                scanner.nextLine();
                if (cevap == 1) {
                    min = tahmin;
                } else if (cevap == 2) {
                    max = tahmin;
                } else if (cevap == 0) {
                    System.out.println("Sayını buldum!");
                    break;
                } else {
                    System.out.println("yanlış seçim! Tekrar dene!");
                    cevap = -1;
                }
            } catch (Exception e) {
                System.out.println("yanlış seçim! Tekrar dene!");
                cevap = -1;
            }
        }
//        int min =

    }
}
