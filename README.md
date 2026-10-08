# Dokumentasi Program PBO

| Keterangan | Data |
|---|---|
| Nama | Muhammad Rizky Alfa Reza Basyah |
| NIM | 2509116086 |
| Kelas | C 2025 |
| Mata Kuliah | Pemrograman Berorientasi Objek |

---

## Deskripsi Singkat Program

Program ini merupakan aplikasi berbasis Java yang dibuat untuk menerapkan konsep Pemrograman Berorientasi Objek (PBO). Program yang dibuat adalah **Sistem Analisis dan Manajemen Data Pengunjung Kolam Renang** yang digunakan untuk mengelola data pengunjung yang datang ke kolam renang.

Program ini berfokus pada pengelolaan data pengunjung, mulai dari proses registrasi, menampilkan data, mengubah data, menghapus data, hingga mencari pengunjung berdasarkan nama.

Program memiliki beberapa fitur utama, yaitu:

* Menambahkan data pengunjung.
* Menampilkan seluruh data pengunjung.
* Mengubah data pengunjung.
* Menghapus data pengunjung.
* Mencari data pengunjung berdasarkan nama.
* Menghasilkan ID pengunjung secara otomatis.
* Membedakan pengunjung menjadi Member dan Non-Member.
* Menampilkan statistik jumlah pengunjung.
* Melakukan validasi terhadap input pengguna.
* Menyediakan dummy data awal agar data langsung tersedia saat program dijalankan.

Program juga menerapkan beberapa konsep PBO, yaitu **class, object, attribute/property, constructor, method, ArrayList, access modifier, encapsulation, inheritance, polymorphism, percabangan, dan perulangan**.

**Tampilan Program Sistem Analisis dan Manajemen Data Pengunjung Kolam Renang**

<img width="278" height="204" alt="image" src="https://github.com/user-attachments/assets/6bc7aed8-24bb-4cb2-bdd2-3c6685b370a7" />

---

## Penjelasan Alur Program

Alur kerja program secara umum adalah sebagai berikut:

1. Program dijalankan melalui class `Main` sebagai entry point.
2. Program membuat objek `ManajemenPengunjung` untuk mengelola data pengunjung.
3. Program membuat objek `PengunjungView` untuk menampilkan menu dan menerima interaksi dari pengguna.
4. Program secara otomatis memasukkan dummy data awal ke dalam `ArrayList`.
5. Program menampilkan menu utama kepada pengguna.
6. Pengguna memilih menu berdasarkan pilihan yang tersedia.
7. Program memproses pilihan pengguna menggunakan percabangan `switch`.
8. Jika pengguna memilih:

   * **Registrasi Pengunjung**, pengguna memasukkan nama, umur, jenis kelamin, tanggal kunjungan, serta memilih tipe Member atau Non-Member. ID pengunjung dibuat secara otomatis oleh sistem.
   * **Tampilkan Semua Pengunjung**, program menampilkan seluruh data yang tersimpan dalam `ArrayList` menggunakan perulangan.
   * **Ubah Data Pengunjung**, pengguna memilih ID pengunjung yang akan diubah, kemudian memasukkan data baru.
   * **Hapus Data Pengunjung**, pengguna memilih ID pengunjung yang akan dihapus dan melakukan konfirmasi sebelum data dihapus.
   * **Cari Pengunjung Berdasarkan Nama**, pengguna memasukkan nama atau sebagian nama, kemudian program menampilkan data yang sesuai.
   * **Statistik Pengunjung**, program menampilkan jumlah total pengunjung, jumlah Member, Non-Member, serta jumlah berdasarkan jenis kelamin.
   * **Keluar**, program dihentikan.
9. Setelah suatu proses selesai, program kembali menampilkan menu utama.
10. Perulangan terus berjalan sampai pengguna memilih menu **Keluar**.

## Struktur Package

Program menggunakan struktur package agar kode lebih terorganisir dan menerapkan konsep **MVC (Model-View-Controller)**.

**Struktur Package pada NetBeans**

<img width="362" height="356" alt="image" src="https://github.com/user-attachments/assets/c5f02ee1-4438-4bab-86d1-f23976965bc6" />

---

### Penjelasan Package

**1. Package Model**

Package `model` berisi class yang merepresentasikan data dalam program.

* `Pengunjung.java` sebagai superclass.
* `Member.java` sebagai subclass dari `Pengunjung`.
* `NonMember.java` sebagai subclass dari `Pengunjung`.

**Class pada Package Model**

<img width="274" height="112" alt="image" src="https://github.com/user-attachments/assets/e96a2118-e535-45dc-8259-d1e6a5e08e3a" />

---

**2. Package Controller**

Package `controller` berisi `ManajemenPengunjung.java` yang bertugas mengelola proses data pengunjung, seperti tambah, tampil, cari, ubah, dan hapus data.

**Class ManajemenPengunjung**

<img width="339" height="43" alt="image" src="https://github.com/user-attachments/assets/56743c75-b143-4a4d-a2f6-64a9d5e0f111" />

---

**3. Package View**

Package `view` berisi `PengunjungView.java` yang bertugas menampilkan menu dan berinteraksi dengan pengguna.

<img width="269" height="49" alt="image" src="https://github.com/user-attachments/assets/80d24e74-a0ed-4a4a-843b-bab312fb7b0b" />

---

**4. Package Utils**

Package `utils` berisi class pendukung program.

* `ValidasiInput.java` digunakan untuk melakukan validasi input.
* `IdGenerator.java` digunakan untuk menghasilkan ID pengunjung secara otomatis.

<img width="265" height="68" alt="image" src="https://github.com/user-attachments/assets/26476c78-8486-4c7e-a8b6-738f93f3d538" />

---

**5. Main.java**

`Main.java` digunakan sebagai entry point untuk menjalankan program.

<img width="282" height="43" alt="image" src="https://github.com/user-attachments/assets/fd606f1b-b2ee-472e-8d22-16808b2d1bcf" />

---

## Penerapan Encapsulation

Program menerapkan **encapsulation** dengan membatasi akses langsung terhadap atribut menggunakan access modifier `private`.

Contohnya pada class `Pengunjung`:

<img width="417" height="141" alt="image" src="https://github.com/user-attachments/assets/762e8e03-2d72-40c9-81ef-e49c68939ea3" />

Atribut tersebut tidak dapat diakses secara langsung dari class lain. Program menyediakan getter dan setter untuk mengakses atau mengubah data.

Dengan menerapkan encapsulation, data yang terdapat pada objek pengunjung menjadi lebih terkontrol karena class lain tidak dapat mengubah atribut secara langsung.

---

## Penerapan Inheritance

Program menerapkan **inheritance** dengan menggunakan class `Pengunjung` sebagai superclass dan class `Member` serta `NonMember` sebagai subclass.

Struktur inheritance:

```text
                 Pengunjung
                     │
            ┌────────┴────────┐
            │                 │
         Member           NonMember
```

Class `Pengunjung` memiliki atribut umum seperti:

* ID Pengunjung
* Nama
* Umur
* Jenis Kelamin
* Tanggal Kunjungan

Class `Member` mewarisi atribut dan method dari class `Pengunjung`, kemudian memiliki atribut tambahan berupa `nomorMember`.

Class `NonMember` juga mewarisi atribut dan method dari class `Pengunjung`, kemudian memiliki atribut tambahan berupa `jenisTiket`.

Contoh penerapan inheritance pada `Member`:

<img width="457" height="44" alt="image" src="https://github.com/user-attachments/assets/c970ec3a-979d-4d09-bd90-84368e34e445" />

Sedangkan pada `NonMember`:

<img width="451" height="44" alt="image" src="https://github.com/user-attachments/assets/6d750490-ae9a-4a64-a2c6-f22fd6de409b" />

Penggunaan inheritance membuat beberapa data dan method yang sama tidak perlu ditulis ulang pada setiap class.

---

## Penerapan Polymorphism

Program menerapkan **polymorphism** melalui method overriding pada method `tampilkanData()`.

Pada superclass `Pengunjung` terdapat method:

<img width="400" height="32" alt="image" src="https://github.com/user-attachments/assets/17cf7dcd-2c2b-4f1f-beb6-2a13a1a85ace" />

Method tersebut kemudian dioverride pada class `Member`:

<img width="374" height="72" alt="image" src="https://github.com/user-attachments/assets/e3899c86-57b4-40e4-b597-426a0a1ab6dc" />

dan pada class `NonMember`:

<img width="390" height="66" alt="image" src="https://github.com/user-attachments/assets/990b59f1-0f84-4753-928b-c0d74b1afc61" />

Java akan menjalankan `tampilkanData()` sesuai dengan objek sebenarnya. Jika objek merupakan `Member`, maka method pada `Member` dijalankan. Jika objek merupakan `NonMember`, maka method pada `NonMember` dijalankan.

Hal tersebut merupakan penerapan **polymorphism melalui method overriding**.

---

## Penerapan Access Modifier

Program menerapkan access modifier untuk mengatur tingkat akses terhadap atribut dan method.

Pada class `Pengunjung`, atribut menggunakan `private`:

<img width="482" height="137" alt="image" src="https://github.com/user-attachments/assets/519eff3e-b0b7-4072-a4a6-7b8dbd981832" />

Sedangkan constructor, getter, setter, dan beberapa method menggunakan `public`.

<img width="378" height="431" alt="image" src="https://github.com/user-attachments/assets/5b97ac01-6349-4d4a-bd36-b129a2e3c820" />

Penggunaan `private` membantu membatasi akses langsung terhadap atribut sehingga data dapat dikelola melalui method yang telah disediakan.

---

## Penerapan Validasi Input

Program menerapkan validasi input untuk memastikan data yang dimasukkan pengguna sesuai dengan ketentuan.

Validasi dilakukan melalui class `ValidasiInput`.

Beberapa validasi yang diterapkan antara lain:

* Nama tidak boleh kosong.
* Nama hanya boleh mengandung huruf dan spasi.
* Nama memiliki batas minimal dan maksimal karakter.
* Umur harus berupa angka.
* Umur harus berada antara 1 sampai 100 tahun.
* Jenis kelamin hanya menerima pilihan L atau P.
* Tipe pengunjung hanya menerima Member atau Non-Member.
* Nomor Member tidak boleh kosong.
* Jenis tiket hanya menerima Biasa atau VIP.
* Tanggal kunjungan tidak boleh kosong.
* Tanggal harus menggunakan format `DD-MM-YYYY`.
* Tanggal yang tidak valid akan ditolak.
* Pilihan menu harus berada pada pilihan yang tersedia.

Contoh validasi nama:

<img width="583" height="232" alt="image" src="https://github.com/user-attachments/assets/61341bf2-c32d-4f74-8fb1-427398a32254" />

Validasi tanggal dilakukan agar input seperti:

```text
1111
99-99-2026
31-02-2026
```

tidak diterima oleh program.

Contoh tanggal yang benar:

```text
24-09-2026
```

Validasi tersebut digunakan untuk mengurangi kesalahan input dan menjaga data yang tersimpan agar sesuai dengan format yang telah ditentukan.

---

## Penerapan ID Otomatis

Program tidak meminta pengguna memasukkan ID secara manual. ID dibuat secara otomatis menggunakan class `IdGenerator`.

ID memiliki pola berdasarkan tahun dan nomor urut.

Contohnya:

```text
2026001
2026002
2026003
2026004
```

Bagian `2026` menunjukkan tahun, sedangkan tiga angka terakhir menunjukkan nomor urut pengunjung.

---

## Penerapan ArrayList dan Dummy Data

Program menggunakan `ArrayList` untuk menyimpan data pengunjung.

Contohnya:

<img width="547" height="50" alt="image" src="https://github.com/user-attachments/assets/c38a19ca-4448-44b9-a646-dcebb71d76ee" />

Program juga menyediakan **dummy data awal** agar ketika program pertama kali dijalankan, menu tampilkan data sudah memiliki data yang dapat ditampilkan.

Contoh dummy data terdiri dari:

* 1 data Member.
* 1 data Non-Member.

Data tersebut dimasukkan ke dalam `ArrayList` melalui method:

<img width="368" height="25" alt="image" src="https://github.com/user-attachments/assets/f960f7bd-0b45-46ff-9878-968f246ded81" />

Dengan adanya dummy data, pengguna dapat langsung mencoba fitur **Read/Tampilkan Data** tanpa harus melakukan input data terlebih dahulu.

---

## Penerapan CRUD

Program menerapkan operasi CRUD dalam pengelolaan data pengunjung.

| CRUD   | Penerapan                  |
| ------ | -------------------------- |
| Create | Registrasi Pengunjung      |
| Read   | Tampilkan Semua Pengunjung |
| Update | Ubah Data Pengunjung       |
| Delete | Hapus Data Pengunjung      |

### Create

Pengguna dapat menambahkan data pengunjung baru melalui menu **Registrasi Pengunjung**.

<img width="288" height="454" alt="image" src="https://github.com/user-attachments/assets/6d69e938-588b-4429-a9d5-3ef969f5582d" />

### Read

Program menampilkan seluruh data pengunjung yang tersimpan di dalam `ArrayList`.

<img width="908" height="479" alt="image" src="https://github.com/user-attachments/assets/3e9b1c9b-a47c-4b1e-b24e-c09261400f4c" />

### Update

Pengguna dapat mengubah informasi pengunjung yang sudah tersimpan.

<img width="916" height="435" alt="image" src="https://github.com/user-attachments/assets/15ccad92-c913-4711-8b77-b580038de0cb" />

<img width="904" height="45" alt="image" src="https://github.com/user-attachments/assets/85277a90-866f-4692-a6ac-0a29fa3f29e7" />

### Delete

Pengguna dapat menghapus data pengunjung berdasarkan ID setelah melakukan konfirmasi.

<img width="898" height="323" alt="image" src="https://github.com/user-attachments/assets/4c31e091-ed19-4a66-9e55-e66ea07556a4" />

<img width="880" height="179" alt="image" src="https://github.com/user-attachments/assets/3af431be-8c14-41ad-86e2-b692a7fa8e62" />


---

## Penerapan Perulangan dan Percabangan

Program menggunakan perulangan agar menu utama tetap berjalan sampai pengguna memilih menu keluar.


**Perulangan Menu Utama**

<img width="458" height="117" alt="image" src="https://github.com/user-attachments/assets/08eba535-d2a6-48ba-a393-588819cb9af9" />


**Percabangan**

<img width="650" height="110" alt="image" src="https://github.com/user-attachments/assets/3d627bfe-310f-40a2-af23-5d430e823da0" />

---

## Nilai Tambah yang Diterapkan

1. **Struktur MVC**

   * Model
   * View
   * Controller

2. **Polymorphism**

   * Method overriding pada `tampilkanData()`.

3. **ID Otomatis**

   * ID dibuat secara otomatis menggunakan pola tahun dan nomor urut.

4. **Validasi Input**

   * Validasi nama, umur, jenis kelamin, tanggal, tipe pengunjung, tiket, dan menu.

5. **Dummy Data**

   * Data awal Member dan Non-Member dimasukkan ke dalam `ArrayList`.

6. **Pencarian Berdasarkan Nama**

   * Fitur pencarian menggunakan nama pengunjung, bukan ID.

7. **Statistik Pengunjung**

   * Menampilkan jumlah total pengunjung, Member, Non-Member, serta jumlah berdasarkan jenis kelamin.

**Fitur Pencarian Berdasarkan Nama**

<img width="857" height="291" alt="image" src="https://github.com/user-attachments/assets/29614f97-59c1-4131-a7f1-d5e437a052aa" />

Gambar tersebut menampilkan antarmuka program Sistem Analisis Pengunjung Kolam Renang yang sedang menjalankan fungsi pencarian data pengunjung berdasarkan nama. Pada contoh tersebut, pengelola mencari pengunjung bernama "Dina" dan sistem berhasil menampilkan detail informasinya seperti ID, umur, jenis kelamin, tanggal kunjungan, serta biaya tiket.

**Fitur Statistik Pengunjung**

<img width="322" height="364" alt="image" src="https://github.com/user-attachments/assets/10cc519a-a7f9-4a40-9920-4dbb7a311dad" />

Gambar tersebut menampilkan menu **Statistik Pengunjung** dari Sistem Analisis Pengunjung Kolam Renang yang menyajikan rangkuman data secara keseluruhan. Tampilan ini merangkum total 4 pengunjung beserta rincian demografi, kategori keanggotaan, jenis tiket, rata-rata umur, dan total pendapatan tiket.


---

## Kesimpulan

Sistem Analisis dan Manajemen Data Pengunjung Kolam Renang merupakan program Java yang digunakan untuk mengelola data pengunjung secara terstruktur. Program telah menerapkan konsep dasar Pemrograman Berorientasi Objek seperti class, object, constructor, attribute, method, ArrayList, percabangan, dan perulangan.

Program juga dikembangkan dengan menerapkan **encapsulation, inheritance, polymorphism, access modifier, validasi input, struktur MVC, ID otomatis, dan dummy data**. Pengembangan tersebut membuat program lebih terstruktur serta memberikan validasi dan pembagian tugas antar-class yang lebih jelas.


