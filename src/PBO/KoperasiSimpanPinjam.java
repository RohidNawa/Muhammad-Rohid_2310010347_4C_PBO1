
package PBO;

// ini adalah Class turunan dari Koperasi
public class KoperasiSimpanPinjam extends Koperasi {
    // ini adalah Atribut
    private double pinjaman;

    //ini adalah constructor untuk memanggil superclass KOPERASI dan menambahkan pinjaman
    public KoperasiSimpanPinjam(String namaAnggota, String idAnggota, double simpanan, double pinjaman) {
        super(namaAnggota, idAnggota, simpanan);  // di bagian ini adakah untuk manggilconstructor dari class Koperasi
        this.pinjaman = pinjaman;
    }

    //ini adalah Setter untuk pinjaman
    public void setPinjaman(double pinjaman) {
        this.pinjaman = pinjaman;
    }

    //ini adalah Getter untuk pinjaman
    public double getPinjaman() {
        return pinjaman;
    }

    //ini adalah Method untuk membayar angsuran pinjaman
    public void bayarAngsuran(double jumlah) {
        if (jumlah > 0 && jumlah <= pinjaman) {
            pinjaman -= jumlah;//disini Jika jumlah valid, kurangi pinjaman
            System.out.println("Angsuran berhasil dibayar: " + jumlah);
        } else {
            //dan juga Jika tidak valid, tampilkan peringatan
            System.out.println("Jumlah angsuran tidak valid.");
        }
    }

    //Overriding disini Menimpa method InfoAnggota dari class Kopererasi
    public String InfoAnggota() {
        // Tambahkan informasi pinjaman ke informasi dasar anggota
        return super.InfoAnggota() + "\nJumlah Pinjaman: " + getPinjaman();
    }

    //disini untuk menyeleksi kelayakan pinjaman berdasarkan jumlah simpanan
    public void seleksiKelayakanPinjaman() {
        if (getSimpanan() >= 100000) {
            System.out.println(getNamaAnggota() + " layak mendapatkan pinjaman.");
        } else {
            System.out.println(getNamaAnggota() + " tidak layak mendapatkan pinjaman.");
        }
    }
}
