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
public class PremierLeagueService {
    PremierLeague leagues[] = new PremierLeague[20];
    int idx;
    
    void tambah(PremierLeague l){
        if (idx < leagues.length) {
            leagues[idx] = l;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!");
        }
    }
    
    void tampilAll(){
        for (PremierLeague l : leagues) {
            l.tampil();
            System.out.println("===============================================");
        }
    }
    
    void insertionSort(boolean asc){
        for (int i = 1; i < leagues.length; i++) {
            PremierLeague temp = leagues[i];
            int j = i;
            if (asc) {
                
            } else {
                
            }
            leagues[j] = temp;
        }
    }
}
