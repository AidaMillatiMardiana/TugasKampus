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
public class Tabung {
    int luasAlas;
    int luasSelimut;
    double phi = 3.14;
    int jariTabung;
    int tinggiTabung;
    
    Tabung(int luasAlas, int luasSelimut, int jariTabung, int tinggiTabung){
        this.luasAlas = luasAlas;
        this.luasSelimut = luasSelimut;
        this.jariTabung = jariTabung;
        this.tinggiTabung = tinggiTabung;
    }
    
    int luasPermukaanTabung(){
        return (2*(luasAlas + luasSelimut));
    }
    int volumeTabung(){
//        int tinggiTabung = 0;
        return (int) ((double) phi * jariTabung * jariTabung * tinggiTabung);
    }
    
}
