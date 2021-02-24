/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author HP
 */
public class SewaGame {
    
    int id, lamaSewa;
    String namaMember, namaGame;
    double hargaSewa;
    
    SewaGame(){
    }
    SewaGame(int id, double hargaSewa, String namaGame){
        this.id = id;
        this.hargaSewa = hargaSewa;
        this.namaGame = namaGame;
    }
    
    void tampilGame(){
//        System.out.println("ID  GAME   HARGA");
        System.out.println(id + " " + namaGame + " " +  hargaSewa);
    }
    void dataSewa(){
        System.out.println("Nama member      : " + namaMember);
        System.out.println("id/Nama Game     : " + namaGame);
        System.out.println("Lama Sewa        : " + lamaSewa);
        System.out.println("Harga Sewa       : " + hargaSewa);
        System.out.println("Total Pembayaran : " + pembayaran());
        
    }
    double pembayaran(){
        return lamaSewa * hargaSewa;
    }
    
    
    
}
