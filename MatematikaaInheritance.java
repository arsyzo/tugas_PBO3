/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_cth.matematika;

/**
 *
 * @author Marsy
 */
public class MatematikaaInheritance {
     public static void main(String[] args) {
        Matematika mtk = new Matematika();
        Matematika2 m2 = new Matematika2();
        
        System.out.println("Pertambah: " + mtk.pertambahan(10, 5));
        System.out.println("Pengurangan: " + mtk.pengurangan(10, 5));
        System.out.println("Perkalian: " + mtk.perkalian(10, 5));
        System.out.println("Pembagian: " + mtk.pembagian(10, 5));
        System.out.println("Modulus: " + m2.modulus(10, 5));
    }
}
