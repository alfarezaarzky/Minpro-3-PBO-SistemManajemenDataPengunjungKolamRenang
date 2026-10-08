/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alfareza
 */

public abstract class Pengunjung implements LayananPengunjung {
    private final int idPengunjung;
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String jenisTiket;
    private String tanggalKunjungan;

    public Pengunjung(int idPengunjung, String nama, int umur,
            String jenisKelamin, String jenisTiket,
            String tanggalKunjungan) {
        this.idPengunjung = idPengunjung;
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.jenisTiket = jenisTiket;
        this.tanggalKunjungan = tanggalKunjungan;
    }

    public int getIdPengunjung() {
        return idPengunjung;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    public String getTanggalKunjungan() {
        return tanggalKunjungan;
    }

    public void setTanggalKunjungan(String tanggalKunjungan) {
        this.tanggalKunjungan = tanggalKunjungan;
    }

    public abstract void tampilkanData();

    @Override
    public String toString() {
        return "ID: " + idPengunjung
                + " | Nama: " + nama
                + " | Umur: " + umur
                + " | Jenis Kelamin: " + jenisKelamin
                + " | Tiket: " + jenisTiket
                + " | Tanggal: " + tanggalKunjungan
                + " | Kategori: " + getKategoriPengunjung()
                + " | Biaya: Rp" + String.format("%.0f",
                        hitungBiayaKunjungan());
    }
}