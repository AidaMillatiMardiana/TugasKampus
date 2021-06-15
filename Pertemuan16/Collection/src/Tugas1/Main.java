/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import java.util.Stack;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Stack<Book> book = new Stack();
    static String isbn, judul, terbit, penerbit;
    
    public static void main(String[] args) {
        menu();
    }
    
    static void menu(){
        System.out.println("**********************");
        System.out.println("Data Buku Perpustakaan");
        System.out.println("**********************");
        System.out.println("");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.println("**********************");
        int opt;
        do{
            System.out.print("Pilih : ");
            opt = sc.nextInt();
            sc.nextLine();
            switch(opt){
                case 1:
                    add();
                    break;
                case 2:
                    ambilBuku();
                    break;
                case 3:
                    cekBukuAtas();
                    break;
                case 4:
                    // print all
                    info();
                    break;
                case 5:
                    System.out.print("Keluar");
                    break;
                default:
            }
        }
        while(opt == 1 || opt == 2 || opt == 3 || opt == 4 || opt == 5);
        
    }
    
    // Method
    static void add(){
        System.out.print("Isbn      : ");
        isbn = sc.nextLine();
        System.out.print("Judul     : ");
        judul = sc.nextLine();
        System.out.print("Terbit    : ");
        terbit = sc.nextLine();
        System.out.print("Penerbit  : ");
        penerbit = sc.nextLine();
        Book buku = new Book(isbn, judul, terbit, penerbit);
        book.push(buku);
        menu();
    }
    
    static void ambilBuku(){
        System.out.printf("%s %s %s %s\n", book.peek().isbn, book.peek().judul, book.peek().terbit,
                book.peek().penerbit);
        book.pop();
        menu();
    }
    
    static void cekBukuAtas(){
        System.out.printf("%s %s %s %s\n", book.peek().isbn, book.peek().judul, book.peek().terbit,
                book.peek().penerbit);
        menu();
    }
    
    static void info(){
        int no = 1;
        for (Book buku : book) {
            System.out.printf("%d . %s %s %s %s \n", no++, buku.isbn, buku.judul, buku.terbit, buku.penerbit);
        }
        menu();
    }
}
