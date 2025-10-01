import java.util.Scanner; 
public class Tugas2 {
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);

        // Input angka
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        // Proses pengecekan
        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

        sc.close(); 
    }
}
