/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class ArrayOfObject {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tabung[] t1Array = new Tabung[2];
        t1Array[0] = new Tabung(10, 20, 5, 10);
        t1Array[1] = new Tabung(20, 40, 10, 20);
        
          System.out.println("====================== TABUNG =====================");
          for (int i = 1; i <= 1; i++) {
                System.out.print("Luas Alas Tabung ke-" + i + "    : ");
                t1Array[i].luasAlas = sc.nextInt();
                System.out.print("Luas Selimut Tabung ke-" + i + " : ");
                t1Array[i].luasSelimut = sc.nextInt();
                System.out.println("Luas Permukaan           = " + t1Array[i].luasPermukaanTabung());
                System.out.println();
                System.out.print("Jari-jari  Tabung ke-" + i + "    : ");
                t1Array[i].jariTabung = sc.nextInt();
                System.out.print("Tinggi Tabung ke-" + i + "        : ");
                t1Array[i].tinggiTabung = sc.nextInt();
                System.out.print("Phi Tabung ke-" + i + "           : " + t1Array[i].phi);
                System.out.println("\nVolume                    = " + t1Array[i].volumeTabung());
        }
        
        Limas[] l1Array = new Limas[2];
        l1Array[0] = new Limas(10, 20, 5, 10);
        l1Array[1] = new Limas(20, 40, 10, 20);

         System.out.println("====================== LIMAS ======================");
         for (int i = 1; i <= 1; i++) {
                System.out.print("Luas Alas Limas ke-" + i + "    : ");
                l1Array[i].luasAlas = sc.nextInt();
                System.out.print("Tinggi Limas ke-" + i + "       : ");
                l1Array[i].tinggi = sc.nextInt();
                System.out.println("Luas Permukaan          = " + l1Array[i].luasPermukaanLimas());
                System.out.println();
                System.out.print("Luas Alas Limas ke-" + i + "    : ");
                l1Array[i].luasAlas = sc.nextInt();
                System.out.print("Tinggi Limas ke-" + i + "       : ");
                l1Array[i].tinggi = sc.nextInt();
                System.out.println("Volume                  = " + l1Array[i].volumeLimas());
        }
         
        Kubus[] k1Array = new Kubus[2];
        k1Array[0] = new Kubus(10);
        k1Array[1] = new Kubus(20);

         System.out.println("====================== KUBUS ======================");
         for (int i = 1; i <= 1; i++) {
                System.out.print("Sisi Kubus ke-" + i + "         : ");
                k1Array[i].sisi = sc.nextInt();
                System.out.println("Luas Permukaan          = " + k1Array[i].luasPermukaanKubus());
                System.out.println();
                System.out.print("Sisi Kubus ke-" + i + "         : ");
                k1Array[i].sisi = sc.nextInt();
                System.out.println("Volume                  = " + k1Array[i].volumeKubus());
        }

          
    }
    
}
