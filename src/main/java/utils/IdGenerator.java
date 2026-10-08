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

public class IdGenerator {
    private static int nomorUrut = 1;

    private IdGenerator() {
    }

    public static int generateId() {
        return LocalDate.now().getYear() * 1000 + nomorUrut++;
    }
}
