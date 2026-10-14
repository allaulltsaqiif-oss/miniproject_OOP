
import java.util.Scanner;

class Mahasiswa {
    // Variable dan data type
    String nama;
    String NIM;
    double nilai;

    // Constructor
    Mahasiswa(String nama, String NIM, double nilai) {
        this.nama = nama;
        this.NIM = NIM;
        this.nilai = nilai;
    }

    // Method untuk menampilkan data mahasiswa
    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + NIM);
        System.out.println("Nilai : " + nilai);
        cekKelulusan();
        System.out.println("-------------------------");
    }

    // Method untuk mengecek kelulusan
    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Status: LULUS");
        } else {
            System.out.println("Status: TIDAK LULUS");
        }
    }
}

public class miniproject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Minimal 3 objek mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];

        System.out.println("=== PROGRAM DATA MAHASISWA ===");

        // Loop untuk memasukkan data
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM: ");
            String NIM = input.nextLine();

            System.out.print("Masukkan nilai: ");
            double nilai = input.nextDouble();
            input.nextLine(); // Membersihkan input newline

            // Membuat objek mahasiswa
            daftarMahasiswa[i] =
                new Mahasiswa(nama, NIM, nilai);
        }

        // Menampilkan seluruh data mahasiswa
        System.out.println("\n=== DAFTAR DATA MAHASISWA ===");

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            daftarMahasiswa[i].tampilkanData();
        }

        input.close();
    }
}
