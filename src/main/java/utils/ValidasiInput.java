/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
/**
 *
 * @author Alfareza
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class ValidasiInput {
    private final Scanner scanner;

    public ValidasiInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String inputString(String pesan) {
        while (true) {
            System.out.print(pesan);
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("Input tidak boleh kosong.");
        }
    }

    public int inputInteger(String pesan, int min, int max) {
        while (true) {
            System.out.print(pesan);
            String input = scanner.nextLine().trim();

            try {
                int angka = Integer.parseInt(input);

                if (angka >= min && angka <= max) {
                    return angka;
                }

                System.out.println(
                        "Masukkan angka antara " + min + " dan " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka bulat.");
            }
        }
    }

    public int inputMenu() {
        return inputInteger("Pilih menu: ", 0, 8);
    }

    public int inputUmur() {
        return inputInteger("Umur (1-80 tahun): ", 1, 80);
    }

    public String inputJenisKelamin() {
        while (true) {
            String input = inputString(
                    "Jenis kelamin (L/P): ").toUpperCase(Locale.ROOT);

            if (input.equals("L") || input.equals("P")) {
                return input.equals("L") ? "Laki-laki" : "Perempuan";
            }

            System.out.println("Masukkan L untuk laki-laki atau P untuk perempuan.");
        }
    }

    public String inputJenisTiket() {
        while (true) {
            System.out.println("1. Biasa (Rp25.000)");
            System.out.println("2. VIP (Rp50.000)");

            int pilihan = inputInteger("Pilih tiket: ", 1, 2);

            if (pilihan == 1) {
                return "Biasa";
            }

            return "VIP";
        }
    }

    public String inputKategori() {
        while (true) {
            System.out.println("1. Member");
            System.out.println("2. Non-Member");

            int pilihan = inputInteger("Pilih kategori: ", 1, 2);

            if (pilihan == 1) {
                return "Member";
            }

            return "Non-Member";
        }
    }

    public String inputTanggal() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-uuuu");

        while (true) {
            String input = inputString(
                    "Tanggal kunjungan (dd-MM-yyyy): ");

            try {
                LocalDate tanggal = LocalDate.parse(input, formatter);

                if (tanggal.format(formatter).equals(input)) {
                    return input;
                }

                System.out.println("Gunakan format dd-MM-yyyy.");
            } catch (DateTimeParseException e) {
                System.out.println(
                        "Tanggal tidak valid. Contoh: 08-10-2026.");
            }
        }
    }

    public boolean inputKonfirmasi(String pesan) {
        while (true) {
            String input = inputString(pesan).toUpperCase(Locale.ROOT);

            if (input.equals("Y")) {
                return true;
            }

            if (input.equals("T")) {
                return false;
            }

            System.out.println("Masukkan Y atau T.");
        }
    }
}
