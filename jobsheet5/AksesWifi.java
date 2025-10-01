import java.util.Scanner;
public class AksesWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Akses WiFi Kampus ---");
        //Input
        System.out.print("Masukkan jenis pengguna (Dosen/Mahasiswa): ");
        String jenisPengguna = sc.nextLine().trim();

        // Jenis Pengguna
        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Output: Akses WiFi Diberikan (Dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            // Jumlah SKS
            System.out.print("Masukkan jumlah SKS: ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Output: Akses WiFi Diberikan (Mahasiswa Aktif)");
            } else {
                System.out.println("Output: Akses Ditolak, SKS < 12");
            }
        } else {
            System.out.println("Output: Akses Ditolak");
        }

        sc.close();
    }
}
