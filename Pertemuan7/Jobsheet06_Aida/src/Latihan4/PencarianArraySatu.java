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
public class PencarianArraySatu {
    ArraySatu listArr[] = new ArraySatu[10];
    int idx; 
    
    public void tambah(ArraySatu a){
        if (idx < listArr.length) { 
            listArr[idx] = a; 
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!");
        }
    }
    
    public void tampil(){
        for (ArraySatu a : listArr) {
            a.tampil();
            System.out.println("------------------");
        }
    }
    
    public void selectionSort(){
        for(int i=0; i<listArr.length-1; i++){
        int idxMin=i;
            for(int j=i+1; j<listArr.length;j++){
                if(listArr[j].angka < listArr[idxMin].angka){
                    idxMin=j;
                }
            }

            ArraySatu tmp = listArr[idxMin];
            listArr[idxMin]=listArr[i];
            listArr[i]=tmp;
        }

    }
    
    public void nilaiMaks(){
        int maks = listArr[6].angka;
        int i = 0;
        while(i < listArr.length){
            if (listArr[i].angka < maks) {
            }
            i++;
        }
        System.out.println("Nilai maksimal adalah : " + maks);
        
        int j = 0;
        while(j <listArr.length){
            if (maks == listArr[j].angka) {
                System.out.println("Ditemukan pada indeks " + j);
            }
            j++;
        }
    }
    
    public void TampilPosisi(int x, int pos){
        if (pos != -1) { 
            System.out.println("data    : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("data "  + x + " tidak ditemukan");
        }
    }
    
    public void TampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Angka " + x + " Ditemukan pada index ke-" + pos);
        } else {
            System.out.println("Angka " + x + " tidak ditemukan");
        }
    }
    
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listArr[mid].angka) {
                return (mid);
            } else if (listArr[mid].angka > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
}
