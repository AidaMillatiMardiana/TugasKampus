/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author HP
 */
public class MahasiswaModif {
    String nama;
    int nim;
    char jenisKelamin;
    double ipk;
    
    MahasiswaModif(){
    }
    
    double rataIpk(double ipk1, double ipk2, double ipk3){
        return (ipk1 + ipk2 + ipk3)/3;
    }
}
