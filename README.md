# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini merupakan contoh aplikasi sederhana untuk mengelola data anggota koperasi, dikembangkan menggunakan bahasa Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi koperasi ini memungkinkan pengguna unutuk menginput data beberapa anggota (nama, ID, simpanan, pinjam), dan melihat informasi lengkap tiap anggota. Dapat melakukan seleksi kelayakan pinjamanan berdasarkan jumlah simpanan serta menangani input yang tidak valid menggunakan error heandling

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template dari object. Pada kode ini, 'Koperasi', 'KoperasiSimpanPinjam', dan 'KoperasiBeraksi' adalah contoh dari class.

```bash
public class Koperasi {
    ...
}

public class KoperasiSimpanPinjam extends Koperasi {
    ...
}

public class KoperasiBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, 'daftarAnggota[i] = new KoperasiSimpanPinjam(...)' adalah contoh pembuatan object.

```bash
daftarAnggota[i] = new KoperasiSimpanPinjam(nama, id, simpanan, pinjaman);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, 'namaAnggota', 'idAnggota', 'simpanan', dan 'pinjaman' adalah contoh atribut.

```bash
private String namaAnggota;
private String idAnggota;
private double simpanan;
private double pinjaman;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class 'Koperasi' dan 'KoperasiSimpanPinjam'.

```bash
public Koperasi(String namaAnggota, String idAnggota, double simpanan) {
    ...
}
public KoperasiSimpanPinjam(String namaAnggota, String idAnggota, double simpanan, double pinjaman) {
    super(namaAnggota, idAnggota, simpanan);
    this.pinjaman = pinjaman;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, 'setNamaAnggota', 'setIdAnggota', dan 'setPinjaman' adalah method mutator.
```bash
public void setNamaAnggota(String namaAnggota) {
    this.namaAnggota = namaAnggota;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaAnggota`, `getIdAnggota`, `getSimpanan`, `getPinjaman` adalah contoh method accessor.

```bash
public String getNamaAnggota() {
    return namaAnggota;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, Pada kode ini, semua atribut dibuat private dan diakses melalui method getter/setter.

```bash
private String namaAnggota;
private double simpanan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KoperasiSimpanPinjam` mewarisi `Koperasi` dengan sintaks `extends`.

```bash
public class KoperasiSimpanPinjam extends Koperasi {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. 
```bash
// Overloading
public String InfoAnggota(double simpanan) {
    ...
}

// Overriding
@Override
public String InfoAnggota() {
    ...
}
```

10. **Seleksi** digunakan untuk mengambil keputusan berdasarkan kondisi tertentu. Contoh penggunaan seleksi 'if' terdapat dalam metode 'tarik', 'bayarAngsuran', dan 'seleksiKelayakanPinjaman'.

```bash
if (getSimpanan() >= 100000) {
    System.out.println(getNamaAnggota() + " layak mendapatkan pinjaman.");
} else {
    System.out.println(getNamaAnggota() + " tidak layak mendapatkan pinjaman.");
}
```

11. **Perulangan** digunakan untuk menginput dan menampilkan data anggota koperasi secara berulang
```bash
for (int i = 0; i < jumlah; i++) {
    ...
}
```

12. **Input Output Sederhana** menggunakan 'Scanner' untuk input dan 'System.out.println' untuk output.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Nama Anggota: ");
String nama = input.nextLine();
```

13. **Array** digunakan untuk menyimpan beberapa objek dalam satu variabel.

```bash
KoperasiSimpanPinjam[] daftarAnggota = new KoperasiSimpanPinjam[jumlah];
```

14. **Error Handling** digunakan untuk menangani kesalahan input, baik berupa tipe data salah atau nilai logis yang tidak sesuai.

```bash
try {
    ...
} catch (InputMismatchException e) {
    System.out.println("Input harus berupa angka!");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Rohid
NPM: 2310010347
KELAS: 4C Reguler Banjarbaru
