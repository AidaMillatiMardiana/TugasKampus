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
import java.util.Scanner;
public class MainTiket {
     public static void main(String[] args) {
        TiketService list = new TiketService();
        Tiket t1 = new Tiket("Lion Air", 500000, "Bandung", "Surabaya");
        Tiket t2 = new Tiket("Merpati Airlines", 600000, "Jakarta", "Palembang");
        Tiket t3 = new Tiket("Batik Air", 400000, "Bandung", "Jakarta");
        Tiket t4 = new Tiket("Adam Air", 450000, "Bali", "Surabaya");
        Tiket t5 = new Tiket("Batavia Air", 300000, "Yogyakarta", "Bali");
        
        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
        
        System.out.println("Data Harga Tiket sebelum sorting = ");
        list.tampilAll();
        
        System.out.println("Data Harga setelah sorting asc berdasarkan harga");
        System.out.println("-------------------BUBBLE SORT-----------------");
        list.bubbleSort();
        list.tampilAll();
        
        System.out.println("Data Harga setelah sorting asc berdasarkan harga");
        System.out.println("-------------------SELECTION SORT-----------------");
        list.selectionSort();
        list.tampilAll();
    }
    
}
