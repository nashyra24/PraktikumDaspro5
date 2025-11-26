package Pertemuan14;

import java.util.Scanner;

public class Kafe19Modifikasi {

    // Fungsi Menu
    public static void Menu(String namaPelanggan, boolean isMember) {

        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam – Rp 15,000");
        System.out.println("2. Cappuccino – Rp 20,000");
        System.out.println("3. Latte      – Rp 22,000");
        System.out.println("4. Teh Tarik  – Rp 12,000");
        System.out.println("5. Roti Bakar – Rp 10,000");
        System.out.println("6. Mie Goreng – Rp 18,000");
        System.out.println("============================");
    }

    // Hitung total harga per menu
    public static int HitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);

        int totalKeseluruhan = 0;
        String lanjut;

        do {
            System.out.print("Masukkan nomor menu yang ingin dipesan : ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah pesanan : ");
            int banyakItem = sc.nextInt();

            int totalHargaMenu = HitungTotalHarga(pilihanMenu, banyakItem);
            totalKeseluruhan += totalHargaMenu;

            System.out.println("Subtotal pesanan menu ini: Rp " + totalHargaMenu);

            System.out.print("Apakah ingin menambah pesanan lain? (y/n): ");
            lanjut = sc.next();
        } while (lanjut.equalsIgnoreCase("y"));

        sc.nextLine(); // clear buffer
        System.out.print("Masukkan kode promo (jika tidak ada tekan ENTER): ");
        String kodePromo = sc.nextLine();

        double diskon = 0;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = 0.5 * totalKeseluruhan;
            System.out.println("Diskon 50%: Rp " + (int)diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = 0.3 * totalKeseluruhan;
            System.out.println("Diskon 30%: Rp " + (int)diskon);
        } else if (!kodePromo.equals("")) {
            System.out.println("Kode promo tidak valid / tidak ada diskon.");
        }

        int totalBayar = (int)(totalKeseluruhan - diskon);

        System.out.println("\n===== STRUK PEMBAYARAN =====");
        System.out.println("Total pesanan sebelum diskon: Rp " + totalKeseluruhan);
        System.out.println("Diskon: Rp " + (int)diskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);

        sc.close();
    }
}
