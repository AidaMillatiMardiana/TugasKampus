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
public class NilaiAlgoritma {
    String namaMhs;
    int nilaiTugas;
    int nilaiKuis;
    int nilaiUTS;
    int nilaiUAS;
    
    public double hitungNilaiTotal(){
        double nilaiTgs = nilaiTugas * 0.3;
        System.out.println("Nilai Tugas " + nilaiTgs);
        double nilaiKs = nilaiKuis * 0.2;
        System.out.println("Nilai Kuis " + nilaiKs);
        double nilaiUts = nilaiUTS * 0.2;
        System.out.println("Nilai UTS " + nilaiUts);
        double nilaiUas = nilaiUAS * 0.3;
        System.out.println("Nilai UAS " + nilaiUas);
        double nilaiTotal = nilaiTgs + nilaiKs + nilaiUts + nilaiUas;
        System.out.println("NILAI TOTAL " + nilaiTotal);
        return nilaiTotal;
    }
}
