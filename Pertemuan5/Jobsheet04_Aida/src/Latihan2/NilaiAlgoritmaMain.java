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
import java.util.Scanner;
public class NilaiAlgoritmaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NilaiAlgoritma[] niArray = new NilaiAlgoritma[3];
        
        for (int i = 1; i < niArray.length; i++) {
            niArray[i] = new NilaiAlgoritma();
            System.out.println("Mahasiswa Ke " + i);
            System.out.print("Masukkan Nilai Tugas  : ");
            niArray[i].nilaiTugas = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis   : ");
            niArray[i].nilaiKuis = sc.nextInt();
            System.out.print("Masukkan Nilai UTS    : ");
            niArray[i].nilaiUTS = sc.nextInt();
            System.out.print("Masukkan Nilai UAS    : ");
            niArray[i].nilaiUAS = sc.nextInt();
        }
        
        for (int i = 1; i < niArray.length; i++) {
            System.out.println("\n--------MENGHITUNG TOTAL NILAI MAHASISWA--------");
            System.out.println("Nilai Tugas : " + niArray[i].nilaiTugas);
            System.out.println("Nilai Kuis  : " + niArray[i].nilaiKuis);
            System.out.println("Nilai UTS   : " + niArray[i].nilaiUTS);
            System.out.println("Nilai UAS   : " + niArray[i].nilaiUAS);
            System.out.print("Total Nilai Mahasiswa adalah : " + niArray[i].hitungNilaiTotal());
        }
    }
    
}
