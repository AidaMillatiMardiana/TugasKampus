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
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
      
        System.out.println("DAFTAR STRUK BELANJA DEWI");
        System.out.println("No      Tanggal     Jumlah Barang  Total Bayar");
        Stack stk = new Stack(8);
        Stack[] st = new Stack[8];
        st[0] = new Stack(101, " 27 Februari 2021 " ,    19 ,          200000);
        st[1] = new Stack(102, " 04 Februari 2021 " ,    17 ,          150000);
        st[2] = new Stack(103, " 07 Februari 2021 " ,    18 ,          160000);
        st[3] = new Stack(104, " 10 Februari 2021 " ,    20 ,          110000);
        st[4] = new Stack(105, " 17 Februari 2021 " ,    24 ,          300000);
        st[5] = new Stack(106, " 05 Februari 2021 " ,    7  ,           100000);
        st[6] = new Stack(107, " 25 Februari 2021 " ,    4  ,           90000);
        st[7] = new Stack(108, " 21 Februari 2021 " ,    20 ,          250000);
        
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i].noTransaksi + st[i].tglBeli + st[i].jumlahBarang + st[i].totalBayar);
            stk.push(st[i]);
        }
        System.out.println();
        System.out.println("Data yang diambil");
        int i = 0;
        while(i < 5){
            stk.pop();
            i++;
        }
        
        System.out.println();
        System.out.println("Data yang tersisa");
        stk.print();
       
    }
}
