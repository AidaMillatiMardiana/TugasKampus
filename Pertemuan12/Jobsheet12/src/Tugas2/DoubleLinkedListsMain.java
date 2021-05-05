/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class DoubleLinkedListsMain {
    static void menu(){
        System.out.println("**************************");
        System.out.println("Data Buku Perpustakaan");
        System.out.println("**************************");
        System.out.println("");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.println("");
        System.out.println("**************************");
    }
    
    public static void main(String[] args) throws Exception {
        Stack lb = new Stack();
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
                    System.out.println("Judul Buku : ");
                    String title = sc.nextLine();
                    Book tb = new Book(title);
                    lb.push(tb);
                    break;
                case 2:
                    lb.pop();
                    break;
                case 3:
                    System.out.println("Judul Buku Teratas");
                    lb.peek();
                    break;
                case 4:
                    lb.print();
                    break;
                case 5:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Tidak ada opsi");
            }
            
        } while (option == 1 || option == 2 || option == 3 || option == 4 || option == 5);
    }
}
