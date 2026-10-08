/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alfareza
 */

public class Member extends Pengunjung {
    private static final double DISKON = 0.20;

    public Member(int idPengunjung, String nama, int umur,
            String jenisKelamin, String jenisTiket,
            String tanggalKunjungan) {
        super(idPengunjung, nama, umur, jenisKelamin,
                jenisTiket, tanggalKunjungan);
    }

    @Override
    public double hitungBiayaKunjungan() {
        double harga = getJenisTiket().equalsIgnoreCase("VIP")
                ? 50000 : 25000;
        return harga * (1 - DISKON);
    }

    @Override
    public String getKategoriPengunjung() {
        return "Member";
    }

    @Override
    public void tampilkanData() {
        System.out.println(toString());
        System.out.println("Diskon member: 20%");
    }
}
