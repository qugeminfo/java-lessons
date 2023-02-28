import java.util.Scanner;

public class IkinciHafta {

    public static void main(String[] args) {
        int MAX = 100;
        System.out.println("Hosgeldin ben sayi tutma robotuyum.");
//        System.out.println("simdi senin tuttugun sayiyi bulmaya calisacagim);
        System.out.println("1 den " + MAX + " e kadar bir sayi tut\n");
        System.out.println("Tahmin ettigim sayi kücükse '<' isareti yaz, büyükse '>' isareti yaz. Tahmin ettigim sayi tuttugun\n");
        System.out.println("sayi ise '=' yaz.");
        int min = 0;
        int max = MAX;
        // işleyiş şu şekilde:
//        50 <   -    min 0 max 50
//        25 >   -    min 25 max 50
//        38 >   -    min 38 max 50
//        44 <   -    min 38 max 44
//        41
        Scanner scanner = new Scanner(System.in);
        String input;
        int tahmin;
        while (true) {
            // iki sayının ortasını bulmak için başlangıç ve bitiş sayılarını toplayıp ikiye bölüyoruz
            tahmin = (min + max) /2;
            System.out.println("Tuttuğun sayı şu mu: " + tahmin);
            input = scanner.nextLine();
            if ("<".equals(input)) {
                min = tahmin;
            } else if (">".equals(input)) {
                max = tahmin;
            } else if ("=".equals(input)) {
                System.out.println("Yaşasın, sayıyı buldum!");
                break;
            } else {
                System.out.println("Yanlış giriş!");
            }
        }
//        System.out.println(13 / 2);
        /*
        int i = 0;
        while(i < 10){
            if (){
            i++;
            }
            System.out.println("merhaba");
            i++;
        }
        */
//        for(int i = 0; i < 10; i++){
//            System.out.println("merhaba ☺");
//        }
    }


}

/*
simdi senin tuttugun sayiyi bulmaya calisacagim
1 den 100 e kadar bir sayi tut
Tahmin ettigim sayi kücükse '<' isareti yaz, büyükse '>' isareti yaz. Tahmin ettigim sayi tuttugun
sayi ise '=' yaz.
tahmin etmeye baslayacak program
min = 0 max = 100
for veya while döngüsü icerisinde olacak
while (true){..}
{
tahmin = (min + max) / 2
tuttugun sayi su mu + (tahmin)
Input alacak (Scanner)  -   < veya >
< diyorsa tahmin tutulan sayidan kücük demek
> diyorsa tahmin tutulan sayidan büyük
If kücükse  --  min = tahmin olacak
If büyükse  --  max = tahmin olacak
If esittir buldum diyecek! ve cikacak for dan
}

50 veya random

Birinci cözüm:
50 > 75 < 63 > 70 =
max 100 min 0  -  50 <
max 50 min 0  -  25 >
max 50 min 25  -  43



Ikinci cözüm:
* 0 ile 100 arasi random yapacak -> 73 kucuk (maximum sayi tahmin ettigi sayi oldu)
* 0 ile 73 arasi random -> 5 büyük (minimum sayi tahmin ettigi sayi oldu)
* 5 ile 73 arasi random -> 40 büyük ......



Input al (Scanner ile)

 */