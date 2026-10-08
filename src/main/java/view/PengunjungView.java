    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ManajemenPengunjung;
import model.Member;
import model.NonMember;
import model.Pengunjung;
import utils.IdGenerator;
import utils.ValidasiInput;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alfareza
 */

public class PengunjungView {
    private final Scanner scanner;
    private final ValidasiInput validasi;

    public PengunjungView(Scanner scanner, ValidasiInput validasi) {
        this.scanner = scanner;
        this.validasi = validasi;
    }

    public void jalankan(ManajemenPengunjung manajemen) {
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = validasi.inputMenu();

            switch (pilihan) {
                case 1:
                    tambahPengunjung(manajemen);
                    break;
                case 2:
                    manajemen.tampilkanSemuaPengunjung();
                    break;
                case 3:
                    ubahPengunjung(manajemen);
                    break;
                case 4:
                    hapusPengunjung(manajemen);
                    break;
                case 5:
                    cariPengunjung(manajemen);
                    break;
                case 6:
                    manajemen.tampilkanStatistik();
                    break;
                case 7:
                    manajemen.tampilkanAnalisis();
                    break;
                case 8:
                    tampilkanRekomendasi(manajemen);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            if (pilihan != 0) {
                System.out.println("\nTekan Enter untuk kembali ke menu...");
                scanner.nextLine();
            }

        } while (pilihan != 0);
    }

    private void tampilkanMenu() {
        System.out.println("\n==========================================");
        System.out.println(" SISTEM ANALISIS PENGUNJUNG KOLAM RENANG");
        System.out.println("==========================================");
        System.out.println("1. Registrasi Pengunjung");
        System.out.println("2. Tampilkan Semua Pengunjung");
        System.out.println("3. Ubah Data Pengunjung");
        System.out.println("4. Hapus Data Pengunjung");
        System.out.println("5. Cari Pengunjung Berdasarkan Nama");
        System.out.println("6. Statistik Pengunjung");
        System.out.println("7. Analisis Pengunjung");
        System.out.println("8. Rekomendasi Pengelola");
        System.out.println("0. Keluar");
        System.out.println("==========================================");
    }

    private void tambahPengunjung(ManajemenPengunjung manajemen) {
        System.out.println("\n========== REGISTRASI PENGUNJUNG ==========");

        String nama = validasi.inputString("Nama: ");
        int umur = validasi.inputUmur();
        String jenisKelamin = validasi.inputJenisKelamin();
        String jenisTiket = validasi.inputJenisTiket();
        String tanggal = validasi.inputTanggal();
        String kategori = validasi.inputKategori();

        if (!validasi.inputKonfirmasi("Simpan data? (Y/T): ")) {
            System.out.println("Registrasi dibatalkan.");
            return;
        }

        int id = IdGenerator.generateId();
        Pengunjung pengunjung;

        if (kategori.equalsIgnoreCase("Member")) {
            pengunjung = new Member(id, nama, umur,
                    jenisKelamin, jenisTiket, tanggal);
        } else {
            pengunjung = new NonMember(id, nama, umur,
                    jenisKelamin, jenisTiket, tanggal);
        }

        manajemen.tambahPengunjung(pengunjung);
        System.out.printf("Biaya kunjungan: Rp%.0f%n",
                pengunjung.hitungBiayaKunjungan());
    }

    private void cariPengunjung(ManajemenPengunjung manajemen) {
        System.out.println("\n========== CARI PENGUNJUNG ==========");
        String nama = validasi.inputString("Masukkan nama atau bagian nama: ");

        ArrayList<Pengunjung> hasil = manajemen.cariPengunjungByNama(nama);

        if (hasil.isEmpty()) {
            System.out.println("Pengunjung tidak ditemukan.");
            return;
        }

        System.out.println("Hasil pencarian:");
        for (Pengunjung p : hasil) {
            p.tampilkanData();
            System.out.println("---------------------------------------");
        }
    }

    private void ubahPengunjung(ManajemenPengunjung manajemen) {
        System.out.println("\n========== UBAH DATA PENGUNJUNG ==========");
        String namaLama = validasi.inputString("Nama yang akan diubah: ");

        ArrayList<Pengunjung> hasil =
                manajemen.cariPengunjungByNama(namaLama);

        if (hasil.isEmpty()) {
            System.out.println("Data pengunjung tidak ditemukan.");
            return;
        }

        if (hasil.size() > 1) {
            System.out.println(
                    "Nama ditemukan lebih dari satu. Masukkan nama lengkap yang lebih spesifik.");
            return;
        }

        Pengunjung dataLama = hasil.get(0);
        dataLama.tampilkanData();

        if (!validasi.inputKonfirmasi("Lanjutkan perubahan? (Y/T): ")) {
            System.out.println("Perubahan dibatalkan.");
            return;
        }

        String namaBaru = validasi.inputString("Nama baru: ");
        int umur = validasi.inputUmur();
        String jenisKelamin = validasi.inputJenisKelamin();
        String jenisTiket = validasi.inputJenisTiket();
        String tanggal = validasi.inputTanggal();
        String kategori = validasi.inputKategori();

        manajemen.ubahPengunjung(namaLama, namaBaru, umur,
                jenisKelamin, jenisTiket, tanggal, kategori);
    }

    private void hapusPengunjung(ManajemenPengunjung manajemen) {
        System.out.println("\n========== HAPUS DATA PENGUNJUNG ==========");
        String nama = validasi.inputString("Nama pengunjung yang dihapus: ");

        ArrayList<Pengunjung> hasil = manajemen.cariPengunjungByNama(nama);

        if (hasil.isEmpty()) {
            System.out.println("Data pengunjung tidak ditemukan.");
            return;
        }

        if (hasil.size() > 1) {
            System.out.println(
                    "Nama ditemukan lebih dari satu. Masukkan nama lengkap yang lebih spesifik.");
            return;
        }

        hasil.get(0).tampilkanData();

        if (validasi.inputKonfirmasi("Yakin ingin menghapus data? (Y/T): ")) {
            manajemen.hapusPengunjung(nama);
        } else {
            System.out.println("Penghapusan dibatalkan.");
        }
    }

    private void tampilkanRekomendasi(ManajemenPengunjung manajemen) {
        ArrayList<Pengunjung> daftar = manajemen.getDaftarPengunjung();

        if (daftar.isEmpty()) {
            System.out.println("Belum ada data untuk membuat rekomendasi.");
            return;
        }

        int biasa = 0;
        int vip = 0;
        int member = 0;

        for (Pengunjung p : daftar) {
            if (p.getJenisTiket().equalsIgnoreCase("Biasa")) {
                biasa++;
            } else {
                vip++;
            }

            if (p instanceof Member) {
                member++;
            }
        }

        System.out.println("\n========== REKOMENDASI PENGELOLA ==========");

        if (biasa >= vip) {
            System.out.println(
                    "• Pertahankan layanan tiket Biasa karena jumlah peminatnya tinggi.");
        } else {
            System.out.println(
                    "• Evaluasi fasilitas VIP untuk mempertahankan minat pengunjung.");
        }

        if (member < daftar.size() / 2.0) {
            System.out.println(
                    "• Pertimbangkan promosi keanggotaan untuk meningkatkan jumlah member.");
        } else {
            System.out.println(
                    "• Pertahankan program member dan evaluasi manfaat diskonnya.");
        }

        System.out.println(
                "• Gunakan statistik kunjungan secara berkala sebelum menentukan kebijakan.");
        System.out.println(
                "Catatan: rekomendasi ini merupakan saran sederhana berdasarkan data saat ini.");
        System.out.println("============================================");
    }
}
