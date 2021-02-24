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
public class BarangMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barang b1 = new Barang("Kursi", 10000);
        Barang b2 = new Barang("Meja", 20000);
        Barang b3 = new Barang("Papan", 30000);
//        Barang b4 = new Barang("Galon", 40000);
//        Barang b5 = new Barang("Kabel", 50000);
        
        System.out.print("Pilih Barang  : ");
        int pil = sc.nextInt();
        switch(pil){
            case 1:
                System.out.println("Nama          : " + b1.nama);
                System.out.println("Harga         : Rp. " + b1.hargaSatuan);
//                System.out.println("Jumlah        : " + b1.jumlah);
                System.out.println("--------------------------------------");
                System.out.print("Jumlah yang akan dipinjam : ");
                b1.jumlah = sc.nextInt();
                int total = b1.jumlah*b1.hargaSatuan; 
                System.out.println("Total                     : " + total);
                b1.hitungHargaTotal();
                b1.hitungDiskon();
                b1.hitungHargaBayar();
                
                break;
            case 2:
                System.out.println("Nama          : " + b2.nama);
                System.out.println("Harga         : Rp. " + b2.hargaSatuan);
//                System.out.println("Jumlah        : " + b2.jumlah);
                System.out.println("--------------------------------------");
                System.out.print("Jumlah yang akan dipinjam : ");
                b2.jumlah = sc.nextInt();
                int total1 = b2.jumlah*b2.hargaSatuan; 
                System.out.println("Total                     : " + total1);
                b2.hitungHargaTotal();
                b2.hitungDiskon();
                break;
            case 3:
                System.out.println("Nama          : " + b3.nama);
                System.out.println("Harga         : Rp. " + b3.hargaSatuan);
//                System.out.println("Jumlah        : " + b3.jumlah);
                System.out.println("--------------------------------------");
                System.out.print("Jumlah yang akan dipinjam : ");
                b3.jumlah = sc.nextInt();
                int total2 = b3.jumlah*b3.hargaSatuan; 
                System.out.println("Total                     : " + total2);
                b3.hitungHargaTotal();
                b2.hitungDiskon();
                break;
//            case 4:
//                System.out.println("Nama          : " + b4.nama);
//                System.out.println("Harga         : Rp. " + b4.hargaSatuan);
////                System.out.println("Jumlah        : " + b4.jumlah);
//                System.out.println("--------------------------------------");
//                System.out.print("Jumlah yang akan dipinjam : ");
//                b3.jumlah = sc.nextInt();
//                int total3 = b4.jumlah*b4.hargaSatuan; 
//                System.out.println("Total                     : " + total3);
//                b4.hitungHargaTotal();
//                break;
//            case 5:
//                System.out.println("Nama          : " + b5.nama);
//                System.out.println("Harga         : Rp. " + b5.hargaSatuan);
////                System.out.println("Jumlah        : " + b5.jumlah);
//                System.out.println("--------------------------------------");
//                System.out.print("Jumlah yang akan dipinjam : ");
//                b3.jumlah = sc.nextInt();
//                int total4 = b5.jumlah*b5.hargaSatuan; 
//                System.out.println("Total                     : " + total4);
//                b5.hitungHargaTotal();
//                break;
        }
       
    }

    private static void hitungDiskon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
