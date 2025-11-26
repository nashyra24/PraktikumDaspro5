package Pertemuan14;

import java.util.Scanner;

public class Kafe19 {

    // Fungsi Menu
    public static void Menu(String namaPelanggan, boolean isMember) {

        if (isMember) {
            System.out.println("Selamat datang, "+ namaPelanggan + "!");

            if (isMember) {
                System.out.println("Anda adalah member, dapatkan diskon 10% setiap pembelian!");
            }
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam – Rp 15,000");
        System.out.println("2. Cappuccino – Rp 20,000");
        System.out.println("3. Latte      – Rp 22,000");
        System.out.println("4. Teh Tarik  – Rp 12,000");
        System.out.println("5. Roti Bakar – Rp 10,000");
        System.out.println("6. Mie Goreng – Rp 18,000");
        System.out.println("============================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    // Fungsi Hitung Total Harga
    public static int HitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    // Fungsi main
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Menampilkan menu
        Menu("Andi", true);
        //Input pilihan menu
        System.out.print("Masukkan nomor menu yang ingin dipesan : ");
            int pilihanMenu = sc.nextInt();
        //Input banyak item
        System.out.print("Masukkan jumlah pesanan : ");
            int banyakItem = sc.nextInt();
        //Hitung total harga
        int totalHarga = HitungTotalHarga(pilihanMenu, banyakItem);
        //Tampilkan total harga
        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
    }
}