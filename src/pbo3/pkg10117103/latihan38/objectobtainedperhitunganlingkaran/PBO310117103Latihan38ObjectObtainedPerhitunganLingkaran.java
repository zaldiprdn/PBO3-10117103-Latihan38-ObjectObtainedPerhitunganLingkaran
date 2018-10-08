/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117103.latihan38.objectobtainedperhitunganlingkaran;

/**
 *
 * @author Rizaldi
 *  NAMA  :Rizaldi Perdana Seristian
    NIM   :10117103   
    KELAS :IF-3
 */
public class PBO310117103Latihan38ObjectObtainedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
    
}
