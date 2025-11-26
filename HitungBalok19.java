package Pertemuan14;
import java.util.Scanner;

public class HitungBalok19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    // Deklarasi variabel
        int p, l, t;
        int L, vol;
    // Input nilai panjang, lebar, dan tinggi
        System.out.println("Masukkan panjang:");
        p = input.nextInt();
    // Input nilai lebar dan tinggi
        System.out.println("Masukkan lebar:");
        l = input.nextInt();
    //
        System.out.println("Masukkan tinggi:");
        t = input.nextInt();
    // Hitung luas dan volume
        L = p * l;
        System.out.println("Luas persegi panjang adalah: " + L);
    // Hitung volume balok
        vol = p * l * t;
        System.out.println("Volume balok adalah: " + vol);

        input.close();
    }
}
