/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class DoubleLinkedListsMain {
        static void menu(){
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++");
    }
    
    public static void main(String[] args) throws Exception {
        Queue av = new Queue();
        Scanner sc = new Scanner(System.in);
//        Stack lb = new Stack();
        int option;
//        String title;
        do{
            menu();
            option = sc.nextInt();
            sc.nextLine();
            
            switch(option){
                case 1:
                    System.out.println("--------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("--------------------");
                    System.out.println("Nomor Antrian : ");
                    int antrian = sc.nextInt();
                    System.out.println("Nama Penerima : ");
                    String namaPengantri = sc.nextLine();
                    Vaksinasi dt = new Vaksinasi(antrian ,namaPengantri);
                    av.Enqueue(dt);
                    break;
                case 2:
                    av.Dequeue();
                    break;
                case 3:
                    av.print();
                    break;
                case 4:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Tidak ada opsi");
            }
            
        } while (option == 1 || option == 2 || option == 3 || option == 4);
    }
}
