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
import java.util.Scanner;
public class ArraySatuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int listArr[] = new int[10];
        PencarianArraySatu data = new PencarianArraySatu();
        ArraySatu a0 = new ArraySatu(12);
        ArraySatu a1 = new ArraySatu(17);
        ArraySatu a2 = new ArraySatu(2);
        ArraySatu a3 = new ArraySatu(1);
        ArraySatu a4 = new ArraySatu(70);
        ArraySatu a5 = new ArraySatu(50);
        ArraySatu a6 = new ArraySatu(90);
        ArraySatu a7 = new ArraySatu(17);
        ArraySatu a8 = new ArraySatu(2);
        ArraySatu a9 = new ArraySatu(90);
      
        data.tambah(a0);
        data.tambah(a1);
        data.tambah(a2);
        data.tambah(a3);
        data.tambah(a4);
        data.tambah(a5);
        data.tambah(a6);
        data.tambah(a7);
        data.tambah(a8);
        data.tambah(a9);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Data keseluruhan Angka : ");
        data.tampil();
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Data setelah diurutkan menggunakan selection sort");
        data.selectionSort();
        data.tampil();
        
        System.out.println("______________________________________________________");
        System.out.println("                    Pencarian Data                    ");
        System.out.println("______________________________________________________");
        System.out.println("Masukkan Angka yang Dicari : ");
        System.out.print("Angka : ");
        int cari = sc.nextInt();
        
        System.out.println("======================================================");
        System.out.println("Menggunakan Binary Search");
        int posisi = data.FindBinarySearch(cari, 0, 9);
        
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi); 
        
        System.out.println("------------------------------------------------------");
        System.out.println("                    Nilai Maksimal                    ");
        System.out.println("------------------------------------------------------");
        data.nilaiMaks();
    }
}

