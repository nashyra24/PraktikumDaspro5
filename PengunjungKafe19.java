package Pertemuan14;

public class PengunjungKafe19 {

    // Fungsi 
    static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar Nama Pengunjung:");
    for (String nama : namaPengunjung) {
        System.out.println("- " + nama);
    }
    System.out.println();
}


    // Fungsi main
    public static void main(String[] args) {

        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
