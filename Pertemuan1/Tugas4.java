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
public class Tugas4 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("          FUNGSI           ");
        menu();
    }
    
       static void menu(){
        System.out.println("========== MENU ==========");
        System.out.println("1. Menghitung Luas Segitiga");
        System.out.println("2. Menghitung Luas Persegi Panjang");
        System.out.println("3. Menghitung Luas Lingkaran");
        System.out.print("PILIH   -->  ");
        int pilih = sc.nextInt();
        System.out.println();
        sc.nextLine();
        
        
        switch(pilih){
            case 1:
                segitiga(0,0,0);
                menu();
                break;
            case 2:
                persegipanjang(0,0,0);
                menu();
                break;
            case 3:
                lingkaran(0,0);
                menu();
                break;
            default:
                System.out.println("KELUAR");
                
        }
    }
       
       static double segitiga(int a, int t, double luas){
        
        System.out.print("Masukan Alas   : ");
        a=sc.nextInt();
        System.out.print("Masukan Tinggi : ");
        t=sc.nextInt();
        
        luas=0.5*a*t;
        System.out.println("Luas Segitiga : "+luas);
        return luas;
    }
       
        static double persegipanjang(int panjang, int lebar, double luas){
        
        System.out.print("Masukan Panjang       : ");
        panjang=sc.nextInt();
        System.out.print("Masukan Lebar         : ");
        lebar=sc.nextInt();
        
        luas=panjang*lebar;
        System.out.println("Luas Persegi Panjang : "+luas);
        return luas;
    }
        static double lingkaran(int jarijari, double luas){
        
        System.out.print("Masukan jari-jari       : ");
        jarijari=sc.nextInt();
        
        luas=jarijari*jarijari*3.14;
        System.out.println("Luas Lingkaran        : "+luas);
        return luas;
    }

}
