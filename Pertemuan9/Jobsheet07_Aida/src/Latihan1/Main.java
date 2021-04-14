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
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        String kalimat, balik = " ";
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = sc.nextLine();
        
        for (int i = kalimat.length()-1; i >= 0; i--) {
            balik = balik + kalimat.charAt(i);
        }

            System.out.print("Hasil : " + balik);
    }
}
