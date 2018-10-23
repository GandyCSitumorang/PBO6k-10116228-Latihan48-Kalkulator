/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan48.kalkulator;


/**
 * Nama : Gandy Christian Situmorang
 * Kelas: PBO-6K
 * NIM  : 10116228
 *Deskripsi Program : program ini berisi program project kalkulator
 */
public class PBO6k10116228Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kalkulator klt = new kalkulator();
        
        System.err.println("value1 = 7.0 ");
        klt.setValue1(7.0);
        System.out.println("value2 = 5.0");
        klt.setValue2(5.0);
        System.out.println("");
        klt.setNamaProject();
        System.out.println("");
        klt.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result add is = " + klt.add(7.0, 5.0));
        System.out.println("Result minus is = " + klt.minus(7.0, 5.0));
        System.out.println("Result multiple is = " + klt.minus(7.0, 5.0));
        System.out.println("Result division id = " + klt.division(7.0,5.0));
    }
}