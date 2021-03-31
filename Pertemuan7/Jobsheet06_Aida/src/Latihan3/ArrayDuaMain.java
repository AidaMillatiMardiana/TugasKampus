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
public class ArrayDuaMain {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        PencarianArrayDua data = new PencarianArrayDua();
        int jumAng = 15;
        int listArr[][] = new int[3][5];
        listArr[0][0] = 45;
        listArr[0][1] = 78;
        listArr[0][2] = 7;
        listArr[0][3] = 200;
        listArr[0][4] = 80;
    
        listArr[1][0] = 90;
        listArr[1][1] = 1;
        listArr[1][2] = 17;
        listArr[1][3] = 100;
        listArr[1][4] = 50;
    
        listArr[1][0] = 21;
        listArr[1][1] = 2;
        listArr[2][2] = 40;
        listArr[2][3] = 18;
        listArr[2][4] = 65;
        
        System.out.println("-----------------------------------------------------");
        System.out.println("                        DATA                         ");
        System.out.println("-----------------------------------------------------");
            for (int i = 0; i < listArr.length; i++) {
                for (int j = 0; j < listArr[0].length; j++) {
                    System.out.println(listArr[i][j]);
                }
            }
        
        System.out.println("______________________________________________________");
        System.out.println("                    Pencarian Data                    ");
        System.out.println("______________________________________________________");
        System.out.println("Masukkan Angka yang Dicari : ");
        System.out.print("Angka : ");
        int cari = sc.nextInt();
        
        System.out.println("======================================================");
        System.out.println("Menggunakan Squential Search");
        int[] posisi = data.FindSeqSearch(listArr, cari);
        
        data.TampilPosisi(cari, posisi[0], posisi[1]); 
    }
}
