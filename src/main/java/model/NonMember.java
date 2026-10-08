/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alfareza
 */

public class NonMember extends Pengunjung {

    public NonMember(int idPengunjung, String nama, int umur,
            String jenisKelamin, String jenisTiket,
            String tanggalKunjungan) {
        super(idPengunjung, nama, umur, jenisKelamin,
                jenisTiket, tanggalKunjungan);
    }

    @Override
    public double hitungBiayaKunjungan() {
        return getJenisTiket().equalsIgnoreCase("VIP")
                ? 50000 : 25000;
    }

    @Override
    public String getKategoriPengunjung() {
        return "Non-Member";
    }

    @Override
    public void tampilkanData() {
        System.out.println(toString());
        System.out.println("Diskon: Tidak ada");
    }
}
