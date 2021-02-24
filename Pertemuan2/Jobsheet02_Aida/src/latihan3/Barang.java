/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author HP
 */
public class Barang {
    
    String nama;
    int hargaSatuan;
    int jumlah;
    
    Barang(){
        
    }
    
    Barang(String na, int harga){
        nama = na;
        hargaSatuan = harga;
//        jumlah = jml;
    }
    int hitungHargaTotal(){
        return hargaSatuan*jumlah;
    }
    int hitungDiskon(){
        if (hitungHargaTotal() > 100000) {
            return (int) (0.1 * hitungHargaTotal());
        } else if (hitungHargaTotal() >= 50000 && hitungHargaTotal() <= 100000) {
            return (int) (0.05 * hitungHargaTotal());
        } else {
            return 0;
        } 
        
        
    }
    int hitungHargaBayar(){
        return hitungHargaTotal() -  hitungDiskon();
    }
    
    
}
