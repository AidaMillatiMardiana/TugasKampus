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
public class Tanah {
    int panjang, lebar, jumlahTanah;
    
    Tanah(){
    }
    
    Tanah(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    int luasTanah(){
         return panjang * lebar;
    }
    
    int tanahTerluas(int ta1, int ta2, int ta3){
        if (ta1 > ta2 && ta1 > ta3) {
            return 1;
        } else if (ta2 > ta1 && ta2 > ta3){
            return 2;
        } else {
            return 3;
        }
    }
    
}
