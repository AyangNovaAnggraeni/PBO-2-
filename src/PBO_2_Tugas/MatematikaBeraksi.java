/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_2_Tugas;

/**
 *
 * @author user
 */

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika tambah = new Matematika(20, 10);
        System.out.println("Pertambahan : " + tambah.a + " + " + tambah.b + " = " + tambah.pertambahan());

        Matematika kurang = new Matematika(10, 5);
        System.out.println("Pengurangan : " + kurang.a + " - " + kurang.b + " = " + kurang.pengurangan());

        Matematika kali = new Matematika(10, 3);
        System.out.println("Perkalian : " + kali.a + " * " + kali.b + " = " + kali.perkalian());

        Matematika bagi = new Matematika(21, 2);
        System.out.println("Pembagian : " + bagi.a + " / " + bagi.b + " = " + bagi.pembagian());
    }
}


