import java.util.Scanner;

public class EBOBveEKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan iki sayı alınır
        System.out.print("1. sayıyı girin: ");
        int sayi1 = input.nextInt();
        System.out.print("2. sayıyı girin: ");
        int sayi2 = input.nextInt();

        int i = 1;
        int ebob = 1;

        // EBOB hesaplama
        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        // EKOK hesaplama formülü: (sayi1 * sayi2) / EBOB
        int ekok = (sayi1 * sayi2) / ebob;

        // Sonuçları ekrana yazdır
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
