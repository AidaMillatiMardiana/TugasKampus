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
public class Book {
    String isbn;
    String judul;
    String terbit;
    String penerbit;
    
    public Book(String isbn, String judul, String terbit, String penerbit){
        this.isbn = isbn;
        this.judul = judul;
        this.terbit = terbit;
        this.penerbit = penerbit;
    }
}
