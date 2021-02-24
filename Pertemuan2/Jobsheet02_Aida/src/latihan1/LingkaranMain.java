/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author HP
 */
public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        l1.phi = 3.14;
        l1.r = 10;
        l1.hitungLuas();
        System.out.println("Hitung Keliling");
        System.out.println("Keliling : " + l1.hitungKeliling());
        l1.hitungKeliling();
        System.out.println("Hitung Luas");
        System.out.println("Luas : " + l1.hitungLuas());
        
    }
    
}
