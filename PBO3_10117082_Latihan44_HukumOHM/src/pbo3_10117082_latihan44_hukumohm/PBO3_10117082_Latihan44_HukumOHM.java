/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan44_hukumohm;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan hukum dari 
* hukum ohm, kuat arus, hambatan, dan hasil tegangan dari hukum ohm
 */
public class PBO3_10117082_Latihan44_HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Baterai batrei = new Baterai();
        Baterai batre = new Baterai(3,12);
 
        System.out.println("Kuat Arus : "+batre.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+batre.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+batre.hitungTegangan()+" volt");
    }
    
}
