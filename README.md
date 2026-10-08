# Dokumentasi Program PBO

## Sistem Analisis dan Manajemen Data Pengunjung Kolam Renang

### Deskripsi Singkat Program

Program Sistem Analisis dan Manajemen Data Pengunjung Kolam Renang merupakan aplikasi berbasis Java yang dikembangkan untuk menerapkan konsep Pemrograman Berorientasi Objek (PBO). Program ini digunakan untuk mengelola data pengunjung sekaligus menganalisis informasi kunjungan sebagai bahan pertimbangan bagi pengelola kolam renang dalam mengambil keputusan.

Program tidak hanya berfokus pada proses pencatatan data, tetapi juga menyediakan fitur analisis untuk mengetahui karakteristik pengunjung berdasarkan umur, jenis kelamin, kategori pengunjung, tanggal kunjungan, serta informasi biaya kunjungan sesuai dengan jenis pengunjung.

Fitur utama yang tersedia meliputi:

* Registrasi pengunjung Member dan Non-Member.
* Menampilkan seluruh data pengunjung.
* Mengubah data pengunjung.
* Menghapus data pengunjung.
* Mencari pengunjung berdasarkan nama.
* Menghasilkan ID pengunjung secara otomatis.
* Menampilkan statistik pengunjung.
* Menganalisis karakteristik dan pola kunjungan.
* Menghitung informasi biaya kunjungan sesuai kategori pengunjung.
* Memberikan rekomendasi berdasarkan hasil analisis data.
* Melakukan validasi terhadap input pengguna.
* Menyediakan dummy data untuk pengujian awal program.

Program menerapkan konsep PBO berupa class, object, attribute, constructor, method, abstract class, abstract method, inheritance, encapsulation, polymorphism, method overriding, method overloading, interface, serta penggunaan `ArrayList`.

Program juga menerapkan pola arsitektur Model-View-Controller (MVC) untuk memisahkan pengelolaan data, proses bisnis, dan interaksi dengan pengguna.

### Tujuan Pembuatan Program

Program ini dikembangkan dengan tujuan sebagai berikut:

1. Mempermudah pengelola kolam renang dalam mencatat dan mengelola data pengunjung.
2. Mengurangi kesalahan pencatatan melalui validasi input dan pembuatan ID otomatis.
3. Memudahkan pencarian, perubahan, dan penghapusan data pengunjung.
4. Menyediakan informasi statistik mengenai karakteristik pengunjung.
5. Membantu pengelola memahami pola kunjungan berdasarkan data yang tersedia.
6. Memberikan rekomendasi yang dapat digunakan sebagai bahan pertimbangan dalam pengelolaan layanan kolam renang.
7. Menerapkan konsep Pemrograman Berorientasi Objek secara terstruktur menggunakan bahasa Java.

### Alur Kerja Program

Alur kerja program secara umum adalah sebagai berikut:

1. Program dijalankan melalui class `Main` sebagai entry point.
2. Program membuat objek `ManajemenPengunjung` untuk mengelola data dan menjalankan proses bisnis.
3. Program membuat objek `PengunjungView` untuk menampilkan menu dan menerima input pengguna.
4. Program menyiapkan `ArrayList` sebagai tempat penyimpanan data pengunjung.
5. Program memasukkan dummy data awal agar fitur dapat langsung diuji.
6. Program menampilkan menu utama.
7. Pengguna memilih fitur yang ingin dijalankan.
8. Program memproses pilihan melalui percabangan dan memanggil method yang sesuai.
9. Jika pengguna memilih fitur pengelolaan data, program menjalankan operasi registrasi, tampilkan data, ubah, hapus, atau pencarian.
10. Jika pengguna memilih analisis, program mengolah data yang tersimpan untuk menghasilkan statistik dan rekomendasi.
11. Setelah proses selesai, program kembali menampilkan menu utama.
12. Program berakhir ketika pengguna memilih menu keluar.

### Struktur Package

Program menggunakan struktur package untuk memisahkan tanggung jawab setiap class dan menerapkan arsitektur MVC.

Struktur package program adalah sebagai berikut:

<img width="294" height="287" alt="image" src="https://github.com/user-attachments/assets/df2a4feb-fff8-43c5-a57b-19a6b2a7f55d" />


#### Package Model

Package `model` berisi class yang merepresentasikan data dan perilaku pengunjung.

* `LayananPengunjung.java`: interface yang mendefinisikan perilaku atau layanan yang harus diterapkan oleh class terkait.
* `Member.java`: subclass yang merepresentasikan pengunjung kategori Member.
* `NonMember.java`: subclass yang merepresentasikan pengunjung kategori Non-Member.
* `Pengunjung.java`: abstract class yang menjadi dasar bagi jenis pengunjung.

#### Package Controller

Package `controller` berisi class `ManajemenPengunjung.java`.

Class ini bertanggung jawab mengelola data pengunjung, menjalankan operasi CRUD, melakukan pencarian, menghitung statistik, menganalisis data, dan menghasilkan rekomendasi berdasarkan data yang tersedia.

#### Package View

Package `view` berisi class `PengunjungView.java`.

Class ini bertugas menampilkan menu, menerima input pengguna, menampilkan hasil pengolahan data, serta menghubungkan interaksi pengguna dengan controller.

#### Package Utils

Package `utils` berisi class pendukung program.

* `ValidasiInput.java`: memvalidasi input agar sesuai dengan ketentuan program.
* `IdGenerator.java`: menghasilkan ID pengunjung secara otomatis.

#### Main.java

Class `Main.java` merupakan titik awal eksekusi program. Class ini melakukan inisialisasi objek yang diperlukan sebelum menampilkan menu utama.

### Penerapan Arsitektur MVC

Program menerapkan pola Model-View-Controller (MVC) untuk memisahkan fungsi setiap bagian program.

**Model**

Bagian model merepresentasikan data dan perilaku pengunjung melalui class `Pengunjung`, `Member`, dan `NonMember`, serta kontrak perilaku melalui interface `LayananPengunjung`.

**View**

Bagian view menangani interaksi dengan pengguna melalui class `PengunjungView`, seperti menampilkan menu dan hasil pemrosesan data.

**Controller**

Bagian controller menangani proses bisnis melalui class `ManajemenPengunjung`, termasuk pengelolaan data, pencarian, analisis statistik, dan penyusunan rekomendasi.

Pemisahan tersebut membuat kode lebih terorganisir, mudah dipahami, dan lebih mudah dikembangkan.

### Penerapan Abstract Class dan Abstract Method

Program menggunakan class `Pengunjung` sebagai abstract class karena class tersebut menjadi dasar bagi beberapa kategori pengunjung dan tidak ditujukan untuk digunakan sebagai objek umum secara langsung.

Abstract class ini menyimpan atribut umum pengunjung, seperti:

* ID pengunjung.
* Nama.
* Umur.
* Jenis kelamin.
* Tanggal kunjungan.
* Informasi kategori atau tiket sesuai rancangan class.

Abstract method `tampilkanData()` digunakan untuk menentukan perilaku penampilan data yang wajib diimplementasikan oleh subclass.

Penerapan abstract class membantu menghindari pengulangan atribut dan mendefinisikan struktur dasar yang sama bagi seluruh jenis pengunjung.

### Penerapan Inheritance

Program menerapkan inheritance melalui class `Member` dan `NonMember` yang mewarisi class `Pengunjung`.


Class `Member` dan `NonMember` mewarisi atribut serta method umum dari `Pengunjung`. Setiap subclass kemudian dapat memiliki perilaku khusus sesuai kategorinya.

Penerapan inheritance mengurangi pengulangan kode dan memungkinkan pengembangan kategori pengunjung tanpa harus menulis ulang seluruh atribut dasar.

### Penerapan Encapsulation

Program menerapkan encapsulation dengan membatasi akses langsung terhadap atribut menggunakan access modifier `private`.

Contoh penerapannya pada class `Pengunjung`:

```java
private int idPengunjung;
private String nama;
private int umur;
private String jenisKelamin;
```

Atribut tersebut dikelola melalui method yang disediakan oleh class, seperti getter dan setter apabila diperlukan.

Penerapan encapsulation membuat akses dan perubahan data lebih terkontrol. Validasi tambahan pada setter juga dapat digunakan untuk mencegah nilai yang tidak sesuai dengan ketentuan program.

### Penerapan Polymorphism

Polymorphism diterapkan melalui method overriding dan method overloading.

#### Method Overriding

Method `tampilkanData()` didefinisikan sebagai abstract method pada class `Pengunjung`, kemudian diimplementasikan oleh class `Member` dan `NonMember`.

Setiap subclass dapat menampilkan informasi tambahan sesuai kategorinya.

Sebagai contoh, data Member dapat menyertakan informasi khusus keanggotaan, sedangkan Non-Member dapat menampilkan informasi terkait kategori tiketnya sesuai implementasi program.

Ketika controller memanggil `tampilkanData()` melalui referensi bertipe `Pengunjung`, Java menjalankan implementasi yang sesuai dengan objek sebenarnya.

#### Method Overloading

Method overloading diterapkan pada pencarian pengunjung melalui method `cariPengunjungByNama()` yang memiliki lebih dari satu bentuk parameter.

Contoh bentuk method:

```java
cariPengunjungByNama(String nama)
cariPengunjungByNama(String nama, String kategori)
```

Method pertama digunakan untuk mencari pengunjung berdasarkan nama. Method kedua menyediakan pencarian berdasarkan nama sekaligus kategori apabila parameter tersebut didukung oleh implementasi program.

Perbedaan parameter memungkinkan satu nama method digunakan untuk kebutuhan pencarian yang berbeda.

### Penerapan Interface

Program menggunakan interface `LayananPengunjung` sebagai kontrak perilaku bagi class yang menerapkannya.

Interface digunakan untuk mendefinisikan method layanan yang harus disediakan oleh class implementasi sesuai rancangan program.

Penerapan interface membantu memisahkan definisi perilaku dari implementasinya. Struktur tersebut juga membuat program lebih fleksibel ketika perilaku layanan perlu dikembangkan.

### Penerapan Access Modifier

Program menggunakan access modifier untuk mengatur hak akses terhadap atribut, constructor, dan method.

* `private`: membatasi akses langsung terhadap atribut internal class.
* `public`: memungkinkan class atau method diakses dari bagian program lain sesuai kebutuhan.
* `protected` atau akses default: digunakan apabila diperlukan sesuai hubungan pewarisan dan struktur package.

Penggunaan access modifier membantu menjaga struktur program dan mendukung penerapan encapsulation.

### Penerapan Validasi Input

Program menyediakan class `ValidasiInput` untuk memeriksa data yang dimasukkan pengguna.

Validasi dilakukan agar data yang disimpan sesuai dengan aturan program.

Validasi yang diterapkan mencakup:

* Nama tidak boleh kosong.
* Nama harus mengikuti format karakter yang ditentukan.
* Umur harus berupa bilangan bulat dan berada pada rentang 1–80 tahun.
* Jenis kelamin harus sesuai dengan pilihan yang tersedia.
* Kategori pengunjung harus berupa Member atau Non-Member.
* Data tiket harus sesuai dengan pilihan yang disediakan.
* Tanggal kunjungan harus menggunakan format yang ditentukan.
* Tanggal yang tidak valid harus ditolak.
* ID yang dipilih untuk proses ubah, hapus, atau pencarian harus sesuai dengan data yang tersedia.
* Pilihan menu harus sesuai dengan menu yang ditampilkan.

Validasi bertujuan mengurangi kesalahan input dan menjaga konsistensi data pengunjung.

### Penerapan ID Otomatis

Program menggunakan class `IdGenerator` untuk menghasilkan ID pengunjung secara otomatis.

ID dibuat berdasarkan pola tahun dan nomor urut sesuai implementasi program. Pengguna tidak perlu memasukkan ID secara manual saat melakukan registrasi.

Contoh ilustrasi format ID:

```text
2026001
2026002
2026003
```

Nomor tersebut merupakan ilustrasi pola ID, bukan jaminan nilai yang muncul pada setiap eksekusi program.

Pembuatan ID otomatis membantu mengurangi kesalahan pengisian ID dan memudahkan identifikasi data pengunjung.

### Penerapan ArrayList dan Dummy Data

Program menggunakan `ArrayList` untuk menyimpan kumpulan objek pengunjung selama program berjalan.

Contoh deklarasi:

```java
ArrayList<Pengunjung> daftarPengunjung;
```

Penggunaan tipe `Pengunjung` memungkinkan daftar menyimpan objek dari subclass `Member` maupun `NonMember`.

Program juga menyediakan dummy data sebagai data awal untuk pengujian. Dummy data memungkinkan pengguna mencoba fitur penampilan data, pencarian, statistik, dan analisis tanpa harus melakukan registrasi terlebih dahulu.

Data yang tersimpan pada `ArrayList` bersifat sementara selama program berjalan apabila belum ditambahkan mekanisme penyimpanan permanen ke file atau database.

### Penerapan CRUD

Program menerapkan operasi CRUD untuk mengelola data pengunjung.

| Operasi | Fitur Program                       |
| ------- | ----------------------------------- |
| Create  | Registrasi pengunjung               |
| Read    | Menampilkan seluruh data pengunjung |
| Update  | Mengubah data pengunjung            |
| Delete  | Menghapus data pengunjung           |

**Create**

Pengguna memasukkan informasi pengunjung baru melalui menu registrasi. Program memvalidasi input, menghasilkan ID otomatis, kemudian menyimpan objek ke dalam daftar pengunjung.

**Read**

Program menampilkan data pengunjung yang tersimpan menggunakan perulangan. Informasi yang ditampilkan mengikuti implementasi `tampilkanData()` pada objek masing-masing.

**Update**

Pengguna memilih pengunjung berdasarkan ID dan memasukkan informasi pengganti. Program memvalidasi data sebelum memperbarui informasi pengunjung.

**Delete**

Pengguna memilih ID pengunjung yang akan dihapus. Program memeriksa keberadaan data sebelum menjalankan proses penghapusan.

**Search**

Pengguna memasukkan nama atau parameter pencarian yang tersedia. Program mencari data yang sesuai dan menampilkan hasilnya.

### Penerapan Statistik dan Analisis Data

Selain CRUD, program menyediakan fitur analisis untuk membantu pengelola memahami karakteristik pengunjung.

Analisis dilakukan berdasarkan data yang tersedia di dalam daftar pengunjung.

Aspek analisis meliputi:

1. **Jumlah pengunjung:** mengetahui total data pengunjung yang tersimpan.
2. **Kategori pengunjung:** mengetahui jumlah Member dan Non-Member.
3. **Jenis kelamin:** mengetahui distribusi pengunjung berdasarkan jenis kelamin.
4. **Kelompok umur:** mengetahui persebaran pengunjung berdasarkan rentang usia.
5. **Rata-rata umur:** mengetahui gambaran umum usia pengunjung.
6. **Pola kunjungan:** menganalisis jumlah kunjungan berdasarkan tanggal atau hari kunjungan sesuai kemampuan implementasi.
7. **Informasi biaya:** menampilkan hasil perhitungan biaya kunjungan sesuai kategori dan aturan yang diterapkan.

Hasil analisis dapat digunakan untuk memahami kebutuhan pengunjung dan mengevaluasi layanan kolam renang.

### Penerapan Rekomendasi Pengelola

Program menyediakan fitur rekomendasi berdasarkan hasil pengolahan data pengunjung.

Rekomendasi digunakan sebagai bahan pertimbangan bagi pengelola dalam merencanakan layanan, promosi, dan operasional kolam renang.

Contoh arah rekomendasi yang dapat dihasilkan berdasarkan hasil analisis adalah:

* Menyesuaikan promosi dengan kategori pengunjung yang paling banyak.
* Mengevaluasi kebutuhan layanan berdasarkan distribusi kelompok umur.
* Mempertimbangkan penambahan petugas atau fasilitas apabila data menunjukkan peningkatan kunjungan pada hari tertentu.
* Mengevaluasi program keanggotaan berdasarkan jumlah Member dan Non-Member.
* Meninjau kebijakan harga berdasarkan informasi biaya yang tersedia.

Rekomendasi yang ditampilkan harus mengikuti aturan yang benar-benar diterapkan dalam kode program dan data hasil analisis, bukan dianggap sebagai prediksi otomatis apabila program belum menggunakan model prediksi.

### Penerapan Perulangan dan Percabangan

Program menggunakan perulangan untuk mempertahankan tampilan menu utama sampai pengguna memilih menu keluar.

Percabangan digunakan untuk menentukan proses yang dijalankan berdasarkan pilihan pengguna.

Penggunaan `switch-case` memudahkan pemisahan proses setiap menu, sedangkan perulangan `for` atau bentuk perulangan lain digunakan untuk memproses daftar pengunjung.

Kombinasi perulangan dan percabangan membuat program dapat menerima beberapa operasi secara berurutan dalam satu kali eksekusi.

### Nilai Tambah Program

Nilai tambah yang diterapkan pada program meliputi:

1. **Arsitektur MVC:** memisahkan model, view, dan controller.
2. **Abstract class dan abstract method:** menetapkan struktur dasar serta perilaku yang harus diterapkan oleh subclass.
3. **Inheritance:** membedakan pengunjung Member dan Non-Member melalui pewarisan.
4. **Polymorphism:** menerapkan method overriding dan method overloading.
5. **Interface:** mendefinisikan kontrak perilaku layanan pengunjung.
6. **Encapsulation:** membatasi akses langsung terhadap atribut.
7. **ID otomatis:** menghasilkan identitas pengunjung tanpa input manual.
8. **Validasi input:** menjaga konsistensi data.
9. **Dummy data:** menyediakan data awal untuk pengujian.
10. **Analisis data:** menghasilkan informasi statistik mengenai karakteristik pengunjung.
11. **Rekomendasi pengelola:** membantu memberikan bahan pertimbangan berdasarkan data.
12. **Pengelolaan CRUD:** menyediakan operasi dasar untuk mengelola data pengunjung.

### Kesimpulan

Sistem Analisis dan Manajemen Data Pengunjung Kolam Renang merupakan aplikasi berbasis Java yang dirancang untuk mengelola data pengunjung sekaligus menghasilkan informasi yang dapat membantu proses pengambilan keputusan oleh pengelola kolam renang.

Program menyediakan fitur registrasi, penampilan data, perubahan, penghapusan, pencarian, statistik, analisis, dan rekomendasi. Penggunaan `ArrayList`, ID otomatis, dummy data, serta validasi input mendukung pengelolaan data yang lebih terstruktur.

Penerapan konsep abstract class, abstract method, inheritance, encapsulation, polymorphism melalui overriding dan overloading, interface, serta arsitektur MVC menunjukkan penerapan prinsip Pemrograman Berorientasi Objek dalam pengembangan program.

Program ini diharapkan dapat menjadi dasar pengembangan sistem pengelolaan dan analisis pengunjung yang lebih lengkap pada masa mendatang.
