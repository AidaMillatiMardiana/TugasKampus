/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Tugas1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nama[] = {"Ani", "Budi", "Bina", "Cita"};
        int banyakPakaian;
        double diskon, perolehan = 0;
        
        int i = 0;
        do{
        System.out.print(nama[i] + " membawa pakaian (kg)  :");
        banyakPakaian = sc.nextInt();
        double bayar = 4500 * banyakPakaian;
        if (banyakPakaian >= 10) {
            System.out.println("SELAMAT ANDA MENDAPATKAN DISKON 5%");
            diskon = bayar * 0.05;
            bayar = bayar - 0.05;    
        }
        System.out.println("Total yang harus dibayarkan adalah Rp." + bayar);
        perolehan += bayar;
        i++;
    } while(i < nama.length);
        System.out.println();
        System.out.println("Total keseluruhan sebesar Rp." + perolehan);
}
}

