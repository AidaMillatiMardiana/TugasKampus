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
public class PilihKandidatMain {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya pemilihan : ");
        int elemen = sc.nextInt();
        sc.nextLine();
        PilihKandidat pemilihanSuara = new PilihKandidat (elemen);
        System.out.println("-----------------------------");
        System.out.println("        NAMA KANDIDAT        ");
        System.out.println("-----------------------------");
        pemilihanSuara.NamaKandidat();
        
        System.out.println("-----------------------------");
        System.out.println("          PEMILIHAN         ");
        System.out.println("-----------------------------");
        int i = 0;
        while(i < elemen){
            System.out.print((i+1) + ". Pilih no urut : ");
            pemilihanSuara.banyak[i] = sc.nextInt();
            i++;
        }
        
        System.out.println("-----------------------------");
        System.out.println("            HASIL            ");
        System.out.println("-----------------------------");
        String hasil = pemilihanSuara.pilihDC(pemilihanSuara.banyak, 0,elemen-1);
        System.out.println("Kandidat Terpilih adalah : ");
        System.out.println(hasil);
    }
}
