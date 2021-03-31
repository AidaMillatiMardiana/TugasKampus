/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MahasiswaMain {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // numerik
        Scanner sc1 = new Scanner(System.in); // alphabet / string
        
        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data Mahasiswa secara urut dari NIM terkecil");
        
        for (int i = 0; i <jumMhs; i++) {
            System.out.println("-------------------");
            System.out.print("NIM\t : ");
            int nim = sc.nextInt();
            System.out.print("Nama\t : ");
            String nama = sc1.nextLine();
            System.out.print("Umur\t : ");
            int umur = sc.nextInt();
            System.out.print("IPK\t : ");
            double ipk = sc.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();
        
        System.out.println("______________________________________________________");
        System.out.println("                    Pencarian Data                    ");
        System.out.println("______________________________________________________");
        System.out.println("Masukkan NIM Mahasiswa yang Dicari : ");
        System.out.print("NIM : ");
        int cari = sc.nextInt();
        
        System.out.println("======================================================");
        System.out.println("Menggunakan Squential Search");
        int posisi = data.FindSearch(cari);
        
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        
                
//        MODIFIKASI LATIHAN PRAKTIKUM NOMOR 1
        System.out.println("======================================================");
        System.out.println("Sorting dengan bubble sort sebelum searching binary Search");
        data.selectionSort();
        data.tampil();
        System.out.println("======================================================");
        System.out.println("Menggunakan Binary Search"); //tapi data masih belum bisa ditemukan setelah sorting
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
    
}
