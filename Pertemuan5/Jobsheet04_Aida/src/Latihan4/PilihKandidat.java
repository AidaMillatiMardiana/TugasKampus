/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author HP
 */
public class PilihKandidat {
    public String[] kandidat = {
        "Haris", "Dian", "Rani", "Bisma"
    };
    
    int idx;
    public int[] banyak;
    public int[] suaraMasuk;
    
    
    PilihKandidat(int anggota) {
        this.banyak = new int[anggota];
        this.suaraMasuk = new int[kandidat.length];
    } 
    
    public String pilihDC(int[] array, int l, int r) {
        if(l == r) {
            if(array[l] == 1) {
                suaraMasuk[0] += 1;
            } else if(array[l] == 2) {
                suaraMasuk[1] += 1;
            } else if(array[l] == 3) {
                suaraMasuk[2] += 1;
            } else if(array[l] == 4) {
                suaraMasuk[3] += 1;
            }
        } else {
            int mid = (l + r) / 2;
            pilihDC(array, l, mid);
            pilihDC(array, mid + 1, r);
            if(suaraMasuk[0] > (array.length / 2)) {
                idx = 0;
            } else if(suaraMasuk[1] > (array.length / 2)){
                idx = 1;
            } else if(suaraMasuk[2] > (array.length / 2)){
                idx = 2;
            } else if(suaraMasuk[3] > (array.length / 2)){
                idx = 3;
            }
        }
        return kandidat[idx];
    }
    
    public void NamaKandidat() {
        int i = 0;
        while(i < kandidat.length){
            System.out.println((i+1) + ". " + kandidat[i]);
            i++;
        }
    }
}
