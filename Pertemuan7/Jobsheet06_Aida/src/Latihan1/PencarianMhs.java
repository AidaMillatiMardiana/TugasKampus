/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author HP
 */
public class PencarianMhs {
    Mahasiswa listMhs[] = new Mahasiswa[5]; 
    int idx; // nilai index
    
    void tambah(Mahasiswa m){
        if (idx < listMhs.length) { 
            listMhs[idx] = m; 
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!");
        }
    }
    
    void tampil(){
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("------------------");
        }
    }
    
    public int FindSearch(int cari){
        int posisi = -1; 
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
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
            System.out.println("NIM     : " + x);
            System.out.println("Nama    : " + listMhs[pos].nama);
            System.out.println("Umur    : " + listMhs[pos].umur);
            System.out.println("IPK     : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].nim) {
                return (mid);
            } else if (listMhs[mid].nim < cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
//    MODIFIKASI LATIHAN PRAKTIKUM NOMOR 1
        public void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
        int idxMin=i;
            for(int j=i+1; j<listMhs.length;j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin=j;
                }
            }

            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }

    }
}
