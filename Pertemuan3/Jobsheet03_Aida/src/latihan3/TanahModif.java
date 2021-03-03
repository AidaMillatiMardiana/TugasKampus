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
public class TanahModif {
    int panjang, lebar, jumlahTanah;
    
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
