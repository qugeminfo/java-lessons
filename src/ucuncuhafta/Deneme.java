package ucuncuhafta;

import java.util.Random;

public class Deneme {
    public static void main(String[] args) {
        Kedi pamuk = new Kedi();
        pamuk.konus();
        pamuk.bizeOzel();
        int yas = pamuk.getYas();
        String ad = pamuk.getAd();
        System.out.println("kedinin yaşı: " + yas);
        System.out.println("adı: " + ad);
        String yasStr = pamuk.getYasStr();
        int yeniYas = Integer.parseInt(yasStr);
        int yeniYas2 = Integer.parseInt("ahmet1");
        System.out.println(yeniYas2);
//        Random random = new Random();
//        random.nextInt(100);

    }
}
