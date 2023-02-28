import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
//        System.out.println("Lütfen sayı giriniz: ");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int b;
//        for (int i = n ; i > 0; i--) {
//            int a;
//
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i * 2 - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String W = in.next();
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        for (int i = 0; i< N; i++) {
            System.out.println(W);
        }
    }
}


/**
  *
 ***
*****


   *
  ***
 *****
*******

n=3

*****
 ***
  *

N=4
*******   i=4 0
 *****    i=3 1
  ***     i=2 2
   *      i=1 3


n



*/