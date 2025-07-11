package PBO;

public class Koperasi {
    //ini adalah Enkapsulasi dengan atribut private
    private String namaAnggota;
    private String idAnggota;
    private double simpanan;

    //ini adalah Constructor
    public Koperasi(String namaAnggota, String idAnggota, double simpanan) {
        this.namaAnggota = namaAnggota;
        this.idAnggota = idAnggota;
        this.simpanan = simpanan;
    }

    //ini adalah Setter (mutator)
    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }
    //-
    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    //ini adalah Getter(accessor)
    public String getNamaAnggota() {
        return namaAnggota;
    }
    //-
    public String getIdAnggota() {
        return idAnggota;
    }
    //-
    public double getSimpanan() {
        return simpanan;
    }

    //ini adalah Method setor simpanan
    public void setor(double jumlah) {
        if (jumlah > 0) {
            simpanan += jumlah;
        } else {
            System.out.println("Jumlah setor tidak valid.");
        }
    }

    //ini adalah Method tarik simpanan
    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= simpanan) {
            simpanan -= jumlah;
        } else {
            System.out.println("Jumlah penarikan tidak valid.");
        }
    }

    //ini adalah Polymorphism: overloading
    public String InfoAnggota() {
        return "Nama Anggota: " + getNamaAnggota() + "\nId Anggota: " + getIdAnggota();
    }
    //dan ini adalah Polymorphisme dengan parameter
    public String InfoAnggota(double simpanan) {
        return InfoAnggota() + "\nJumlah Simpanan: " + getSimpanan();
    }
}