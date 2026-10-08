/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import controller.ManajemenPengunjung;
import utils.ValidasiInput;
import view.PengunjungView;
import java.util.Scanner;


/**
 *
 * @author Alfareza
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ValidasiInput validasi = new ValidasiInput(scanner);
        ManajemenPengunjung manajemen = new ManajemenPengunjung();
        PengunjungView view = new PengunjungView(scanner, validasi);

        view.jalankan(manajemen);

        scanner.close();
    }
}