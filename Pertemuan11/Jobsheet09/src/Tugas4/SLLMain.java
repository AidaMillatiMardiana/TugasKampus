/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class SLLMain {
    static Scanner sc = new Scanner(System.in);
    static SingleLinkedList singLL = new SingleLinkedList(); 
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. AddFirst");
        System.out.println("2. AddLast");
        System.out.println("3. InsertBefore");
        System.out.println("4. InsertAfter");
        System.out.println("5. InsertAt");
          
        System.out.print("Pilih : ");
        int pilih = sc.nextInt();
        sc.nextLine();
        
        if(pilih >= 0 && pilih <= 5){
            add(pilih);
        }else{
            System.out.println("opsi pilihan tidak ada");
        }
    }
    
    public static void add(int pilih){
        Scanner sc = new Scanner(System.in);
        String rek, nama, nohp, alamat;
        System.out.print("Masukkan Nomor Rekening  : ");
        rek = sc.nextLine();
        System.out.print("Masukkan Nama Nasabah    : ");
        nama = sc.nextLine();
        System.out.print("Masukkan No Hp Nasabah   : ");
        nohp = sc.nextLine();
        System.out.print("Masukkan Alamat          : ");
        alamat = sc.nextLine();
        
        push(pilih, rek, nama, nohp, alamat);
    }
    
    public static void push(int pilih, String rek, String nama, String nohp, String alamat){
        NasabahBank nsb = new NasabahBank(rek, nama, nohp, alamat);
        String keys;
        switch(pilih){
            case 1:
                singLL.addFirst(nsb);
                singLL.print();
                break;
            case 2:
                singLL.addLast(nsb);
                singLL.print();
                break;
            case 3:
                System.out.println("Setelah norek apa ?");
                System.out.print("Masukkan norek (Keys): ");
                keys = sc.nextLine();
                singLL.insertAfter(keys, nsb);
                singLL.print();
                break;
            case 4:
                System.out.println("Sebelum norek apa ?");
                System.out.print("Masukkan norek (Keys): ");
                keys = sc.nextLine();
                singLL.insertBefore(keys, nsb);
                singLL.print();
                break;
            case 5:
                System.out.println("Pada index berapa ?");
                System.out.print("Masukkan index (Keys): ");
                int index = sc.nextInt();
                singLL.insertAt(index, nsb);
                singLL.print();
                break;
        }
        menu();
    }
}
