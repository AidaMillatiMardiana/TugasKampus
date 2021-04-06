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
import java.util.Scanner;
public class NilaiAlgoritmaMain {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NilaiAlgoritma[] niArray = new NilaiAlgoritma[3];
        
            System.out.println("------------------------------------------------");
            System.out.println("                NILAI MAHASISWA                 ");
            System.out.println("------------------------------------------------");
        for (int i = 1; i < niArray.length; i++) {
            niArray[i] = new NilaiAlgoritma();
            System.out.println("\n___________________");
            System.out.println("Mahasiswa Ke " + i);
            System.out.println("___________________");
            System.out.print("Masukkan Nilai Tugas  : ");
            niArray[i].nilaiTugas = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis   : ");
            niArray[i].nilaiKuis = sc.nextInt();
            System.out.print("Masukkan Nilai UTS    : ");
            niArray[i].nilaiUTS = sc.nextInt();
            System.out.print("Masukkan Nilai UAS    : ");
            niArray[i].nilaiUAS = sc.nextInt();
        }
        
        System.out.println("----------------------------------------------------");
        System.out.println("          MENGHITUNG TOTAL NILAI MAHASISWA            ");
        System.out.println("----------------------------------------------------");
        for (int i = 1; i < niArray.length; i++) {
            System.out.println("\n___________________");
            System.out.println("Mahasiswa Ke " + i);
            System.out.println("___________________");
            System.out.println("Nilai Tugas : " + niArray[i].nilaiTugas);
            System.out.println("Nilai Kuis  : " + niArray[i].nilaiKuis);
            System.out.println("Nilai UTS   : " + niArray[i].nilaiUTS);
            System.out.println("Nilai UAS   : " + niArray[i].nilaiUAS);
            System.out.print("Total Nilai Mahasiswa adalah : " + niArray[i].hitungNilaiTotal());
        }
        
        System.out.println("\n----------------------------------------------------");
        System.out.println("                    RATA-RATA NILAI                 ");
        System.out.println("----------------------------------------------------");
        double total = niArray[1].hitungNilaiTotal() + niArray[2].hitungNilaiTotal();
        System.out.println("____________________________________________________");
        System.out.println("Total Nilai Seluruh Mahasiswa adalah : " + total);
        for (int i = 1; i <= 1; i++) {
            System.out.println("Rata-rata Nilai Seluruh Mahasiswa adalah : " + niArray[i].rataNilai(i, total));
            }
    }
}
