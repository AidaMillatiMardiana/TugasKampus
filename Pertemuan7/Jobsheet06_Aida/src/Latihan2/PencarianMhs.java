/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

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
    
    //  MODIFIKASI LATIHAN PRAKTIKUM NOMOR 2
        public int FindSeqName(String cari){
        int posisi = -1;
        int j = 0;
        while(j < listMhs.length){
            if (listMhs[j].nama.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
            j++;
        }
        return posisi;
    } 
    
    public void TampilPosisi(String x, int pos){
        if (pos != -1) { 
            System.out.println("data    : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("data "  + x + " tidak ditemukan");
        }
    }
    
    public void TampilData(String x, int pos){
        if (pos != -1) {
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Nama/t : " + x);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
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
}
