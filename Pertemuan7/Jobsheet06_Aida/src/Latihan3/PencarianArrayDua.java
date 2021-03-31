/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author HP
 */
public class PencarianArrayDua {
    ArrayDua listArr[][] = new ArrayDua[3][5];
    int idx;
    int bar, kol;
    
    void tampil(){
          for (int i = 0; i < listArr.length; i++) {
              for (int j = 0; j < listArr[0].length; j++) {
                  System.out.println(listArr[i][j] + " ");
              }
              System.out.println("");
        }
    }
    
    public int[] FindSeqSearch(int listArr[][], int cari){
        int data[] = new int[2];
        int baris = -1, kolom = -1;
        for(int i = 0;i < bar;i++){
            for(int j = 0;j < kol;j++){
                if(listArr[i][j] == cari){
                    bar = i;
                    kol = j;
                    break;
                }
            }
        }
        data[0] = bar;
        data[1] = kol;
        return data;
    }
    
    public void TampilPosisi(int x, int bar, int kol){
        if (bar != -1 && kol != -1) { 
            System.out.println("data    : " + x + " ditemukan pada index " + bar + kol);
        } else {
            System.out.println("data "  + x + " tidak ditemukan");
        }
    }
    
//    public void TampilData(int x, int bar, int kol){
//        if (kol != -1 && bar != -1) {
//            System.out.println("ANGKA\t : " + x);
//            System.out.println("POSISI\t : " + listArr[bar][kol]);
//        } else {
//            System.out.println("data " + x + " tidak ditemukan");
//        }
//    }
    

}
