/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Member;
import model.NonMember;
import model.Pengunjung;
import utils.IdGenerator;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author Alfareza
 */

public class ManajemenPengunjung {
    private final ArrayList<Pengunjung> daftarPengunjung;

    public ManajemenPengunjung() {
        daftarPengunjung = new ArrayList<>();
        isiDataDummy();
    }

    private void isiDataDummy() {
        daftarPengunjung.add(new Member(
                IdGenerator.generateId(), "Andi", 20,
                "Laki-laki", "Biasa", "01-10-2026"));

        daftarPengunjung.add(new NonMember(
                IdGenerator.generateId(), "Siti", 19,
                "Perempuan", "VIP", "02-10-2026"));

        daftarPengunjung.add(new Member(
                IdGenerator.generateId(), "Budi", 25,
                "Laki-laki", "VIP", "03-10-2026"));

        daftarPengunjung.add(new NonMember(
                IdGenerator.generateId(), "Dina", 17,
                "Perempuan", "Biasa", "04-10-2026"));
    }

    public void tambahPengunjung(Pengunjung pengunjung) {
        daftarPengunjung.add(pengunjung);
        System.out.println("Data pengunjung berhasil ditambahkan.");
        System.out.println("ID pengunjung: " + pengunjung.getIdPengunjung());
    }

    public ArrayList<Pengunjung> getDaftarPengunjung() {
        return new ArrayList<>(daftarPengunjung);
    }

    public boolean isKosong() {
        return daftarPengunjung.isEmpty();
    }

    public void tampilkanSemuaPengunjung() {
        if (daftarPengunjung.isEmpty()) {
            System.out.println("Belum ada data pengunjung.");
            return;
        }

        System.out.println("\n========== DAFTAR PENGUNJUNG ==========");

        for (Pengunjung pengunjung : daftarPengunjung) {
            pengunjung.tampilkanData();
            System.out.println("---------------------------------------");
        }
    }

    public ArrayList<Pengunjung> cariPengunjungByNama(String nama) {
        ArrayList<Pengunjung> hasil = new ArrayList<>();
        String kataKunci = nama.trim().toLowerCase(Locale.ROOT);

        for (Pengunjung pengunjung : daftarPengunjung) {
            if (pengunjung.getNama().toLowerCase(Locale.ROOT)
                    .contains(kataKunci)) {
                hasil.add(pengunjung);
            }
        }

        return hasil;
    }

    // Overloading: pencarian berdasarkan nama dan kategori.
    public ArrayList<Pengunjung> cariPengunjungByNama(
            String nama, String kategori) {
        ArrayList<Pengunjung> hasil = new ArrayList<>();

        for (Pengunjung pengunjung : cariPengunjungByNama(nama)) {
            if (pengunjung.getKategoriPengunjung()
                    .equalsIgnoreCase(kategori)) {
                hasil.add(pengunjung);
            }
        }

        return hasil;
    }

    public Pengunjung cariSatuByNama(String nama) {
        ArrayList<Pengunjung> hasil = cariPengunjungByNama(nama);

        if (hasil.isEmpty()) {
            return null;
        }

        if (hasil.size() > 1) {
            System.out.println(
                    "Nama ditemukan lebih dari satu. Gunakan nama yang lebih spesifik.");
            return null;
        }

        return hasil.get(0);
    }

    public boolean ubahPengunjung(String namaLama, String namaBaru,
            int umur, String jenisKelamin, String jenisTiket,
            String tanggalKunjungan, String kategori) {

        Pengunjung lama = cariSatuByNama(namaLama);

        if (lama == null) {
            System.out.println("Data tidak ditemukan atau nama tidak unik.");
            return false;
        }

        int id = lama.getIdPengunjung();

        Pengunjung baru;
        if (kategori.equalsIgnoreCase("Member")) {
            baru = new Member(id, namaBaru, umur, jenisKelamin,
                    jenisTiket, tanggalKunjungan);
        } else {
            baru = new NonMember(id, namaBaru, umur, jenisKelamin,
                    jenisTiket, tanggalKunjungan);
        }

        int indeks = daftarPengunjung.indexOf(lama);
        daftarPengunjung.set(indeks, baru);

        System.out.println("Data pengunjung berhasil diperbarui.");
        return true;
    }

    public boolean hapusPengunjung(String nama) {
        Pengunjung pengunjung = cariSatuByNama(nama);

        if (pengunjung == null) {
            System.out.println("Data tidak ditemukan atau nama tidak unik.");
            return false;
        }

        daftarPengunjung.remove(pengunjung);
        System.out.println("Data pengunjung berhasil dihapus.");
        return true;
    }

    public void tampilkanStatistik() {
        int total = daftarPengunjung.size();
        int jumlahMember = 0;
        int jumlahNonMember = 0;
        int lakiLaki = 0;
        int perempuan = 0;
        int tiketBiasa = 0;
        int tiketVIP = 0;
        int totalUmur = 0;
        double totalPendapatan = 0;

        for (Pengunjung p : daftarPengunjung) {
            if (p instanceof Member) {
                jumlahMember++;
            } else if (p instanceof NonMember) {
                jumlahNonMember++;
            }

            if (p.getJenisKelamin().equalsIgnoreCase("Laki-laki")) {
                lakiLaki++;
            } else {
                perempuan++;
            }

            if (p.getJenisTiket().equalsIgnoreCase("Biasa")) {
                tiketBiasa++;
            } else {
                tiketVIP++;
            }

            totalUmur += p.getUmur();
            totalPendapatan += p.hitungBiayaKunjungan();
        }

        System.out.println("\n========== STATISTIK PENGUNJUNG ==========");
        System.out.println("Total pengunjung : " + total);
        System.out.println("Member           : " + jumlahMember);
        System.out.println("Non-Member       : " + jumlahNonMember);
        System.out.println("Laki-laki        : " + lakiLaki);
        System.out.println("Perempuan        : " + perempuan);
        System.out.println("Tiket Biasa      : " + tiketBiasa);
        System.out.println("Tiket VIP        : " + tiketVIP);

        if (total > 0) {
            System.out.printf(Locale.ROOT,
                    "Rata-rata umur   : %.2f tahun%n",
                    (double) totalUmur / total);
        } else {
            System.out.println("Rata-rata umur   : Belum tersedia");
        }

        System.out.printf(Locale.ROOT,
                "Pendapatan tiket : Rp%.0f%n", totalPendapatan);
        System.out.println("==========================================");
    }

    public void tampilkanAnalisis() {
        if (daftarPengunjung.isEmpty()) {
            System.out.println("Belum ada data untuk dianalisis.");
            return;
        }

        int biasa = 0;
        int vip = 0;
        int member = 0;

        for (Pengunjung p : daftarPengunjung) {
            if (p.getJenisTiket().equalsIgnoreCase("Biasa")) {
                biasa++;
            } else {
                vip++;
            }

            if (p instanceof Member) {
                member++;
            }
        }

        System.out.println("\n========== ANALISIS PENGUNJUNG ==========");

        if (biasa > vip) {
            System.out.println("Tiket paling diminati: Biasa");
        } else if (vip > biasa) {
            System.out.println("Tiket paling diminati: VIP");
        } else {
            System.out.println("Peminat tiket Biasa dan VIP seimbang.");
        }

        if (member > daftarPengunjung.size() / 2.0) {
            System.out.println("Mayoritas pengunjung merupakan member.");
        } else {
            System.out.println(
                    "Member belum menjadi mayoritas pengunjung.");
        }

        System.out.println("Catatan: analisis dihitung dari data yang tersimpan.");
        System.out.println("==========================================");
    }
}
