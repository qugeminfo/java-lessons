import java.util.Scanner;

public class IlkHafta {

    private static void tekCiftYaz(int sayi) {
        if (sayi % 2 == 0) {
            System.out.println(sayi + ": çift");
        } else {
            System.out.println(sayi + ": tek");
        }
    }

    private static void hangisiBuyuk(int sayi1, int sayi2) {
        if (sayi1 < sayi2) {
            System.out.println("ikinci daha büyük!");
        } else if (sayi1 == sayi2) {
            System.out.println("iki sayı da eşit!");
        } else {
            System.out.println("birinci daha büyük!");
        }
    }

    private static int onaCarp(int sayi) {
        return sayi * 10;
    }
//protected
    //public
    //private

    public static void main(String[] args) {

        int sonuc = onaCarp(5);
        System.out.println(sonuc);

        int sonuc2 = onaCarp(4);

        // uygulama bir sayı tutacak
        // terminalden sayıyı tuttum, hadi tahmin et diyecek
        // döngü içerisinde sizden sayı alacak
        // sayının değerine göre cevap verecek
        // sayı bulununda tebrikler deyip program kapanacak.

        // Random random = new Random();
        // int rastgele = random.nextInt(10) + 1;
        // System.out.println(rastgele);
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        sayi++;
        System.out.println("Sayı: " + sayi);  // Output user input
        //String userName = scanner.nextLine();  // Read user input
        //System.out.println("Username is: " + userName);  // Output user input

    }
}
