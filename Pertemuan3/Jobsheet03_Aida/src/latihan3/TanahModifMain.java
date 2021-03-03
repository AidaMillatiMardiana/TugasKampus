/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class TanahModifMain {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah tanah : ");
        int n = sc.nextInt();
        System.out.println();
        TanahModif[] ta1Array = new TanahModif[4];
        
        for (int i = 1; i < 4; i++) {
            ta1Array[i] = new TanahModif();
            System.out.println("Tanah Ke " + i);
            System.out.print("Masukkan Panjang : ");
            ta1Array[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar   : ");
            ta1Array[i].lebar = sc.nextInt();
            
        }
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("\nLuas Tanah " + i + " adalah : " + ta1Array[i].luasTanah());
        }
        
        TanahModif besar = new TanahModif();
        System.out.println();
        System.out.println("\nTanah terluas : Tanah " + besar.tanahTerluas(ta1Array[1].luasTanah(),ta1Array[2].luasTanah(), ta1Array[3].luasTanah() ));
    }
}
