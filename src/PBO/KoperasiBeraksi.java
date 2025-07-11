package PBO;

import java.util.InputMismatchException;//Untuk menangani kesalahan saat input tipe data salah
import java.util.Scanner;//Untuk membaca input dari pengguna (keyboard)

public class KoperasiBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //ini untuk input dari pengguna
        int jumlah = 0;

        //pada Error handling: input jumlah anggota harus valid dan lebih dari 0
        while (true) {
            try {
                System.out.print("Masukkan jumlah anggota: ");
                jumlah = input.nextInt();
                input.nextLine(); //ini untuk hapus karakter new line dari input

                if (jumlah <= 0) {
                    throw new IllegalArgumentException("Jumlah anggota harus lebih dari 0.");
                }
                break; //keluar dari loop jika input valid
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine(); //hapus input yang salah
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        //ini adalah membuat array untuk menyimpan objek anggota koperasi
        KoperasiSimpanPinjam[] daftarAnggota = new KoperasiSimpanPinjam[jumlah];

        //disini untuk menginput data setiap anggota koperasi
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n=== Input Data Anggota ke-" + (i + 1) + " ===");

            try {
                System.out.print("Nama Anggota: ");
                String nama = input.nextLine();

                System.out.print("ID Anggota: ");
                String id = input.nextLine();

                System.out.print("Jumlah Simpanan: ");
                double simpanan = input.nextDouble();
                if (simpanan < 0) throw new IllegalArgumentException("Simpanan tidak boleh negatif.");

                System.out.print("Jumlah Pinjaman: ");
                double pinjaman = input.nextDouble();
                if (pinjaman < 0) throw new IllegalArgumentException("Pinjaman tidak boleh negatif.");

                input.nextLine(); // hapus newline

                //Membuat objek dan simpan dalam array
                daftarAnggota[i] = new KoperasiSimpanPinjam(nama, id, simpanan, pinjaman);

            } catch (InputMismatchException e) {
                //Menangkap jika user input huruf saat diminta angka
                System.out.println("Input salah, pastikan masukan berupa angka!");
                input.nextLine(); // hapus input salah
                i--; // ulangi input untuk anggota ini
            } catch (IllegalArgumentException e) {
                //Menangkap jika nilai logis tidak sesuai (negatif)
                System.out.println("Kesalahan: " + e.getMessage());
                input.nextLine();
                i--;
            } catch (Exception e) {
                //Menangkap semua error tidak terduga
                System.out.println("Terjadi kesalahan tidak diketahui: " + e.getMessage());
                i--;
            }
        }

        // disini untuk Menampilkan semua data anggota
        System.out.println("\n=== DATA ANGGOTA KOPERASI ===");
        for (int i = 0; i < daftarAnggota.length; i++) {
            System.out.println("\nAnggota ke-" + (i + 1));
            System.out.println(daftarAnggota[i].InfoAnggota()); 
            daftarAnggota[i].seleksiKelayakanPinjaman();        
        }

        input.close(); // tutup Scanner
    }
}
