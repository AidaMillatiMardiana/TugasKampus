/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class TanahMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah tanah : ");
        int n = sc.nextInt();
        System.out.println();
        Tanah[] ta1Array = new Tanah[4];
        
        for (int i = 1; i < 4; i++) {
            ta1Array[i] = new Tanah();
            System.out.println("Tanah Ke " + i);
            System.out.print("Masukkan Panjang : ");
            ta1Array[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar   : ");
            ta1Array[i].lebar = sc.nextInt();
            
        }
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("\nLuas Tanah " + i + " adalah : " + ta1Array[i].luasTanah());
        }
    }  
}
