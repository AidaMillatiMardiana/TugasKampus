/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class MainNasabah {
    static Scanner sc = new Scanner(System.in);
    static QueueNasabah qn = new QueueNasabah(); 
    
    public static void main(String[] args) {
        menu();
    }
    
    static void add(){
        System.out.print("Nomor Rekening  : ");
        String rek = sc.nextLine();
        System.out.print("Nama Nasabah    : ");
        String nama = sc.nextLine();
        System.out.print("No Hp Nasabah   : ");
        String nohp = sc.nextLine();
        System.out.print("Alamat Nasabah   : ");
        String alamat = sc.nextLine();
        NasabahBank nb = new NasabahBank(rek, nama, nohp, alamat);
        qn.Enqueue(nb);
    }
    public static void menu(){
        System.out.println("Menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        System.out.println("4. Peek Position");
        System.out.println("5. Peek Rear");
        System.out.println("6. Print");
        System.out.println("");
        
        System.out.print("pilih :  ");
        int pilih;
        pilih = sc.nextInt();
        sc.nextLine();

        switch(pilih){
            case 1:
                add();
                break;
            case 2:
                qn.Dequeue();
                break;
            case 3:
                qn.peek();
                break;
            case 4:
                System.out.print("Masukkan no rekening  : ");
                String x = sc.nextLine();
                qn.peekPosition(x);
                break;
            case 5:
                qn.peekRear();
                break;
            case 6:
                qn.print();
        }
        menu();
    }
}
