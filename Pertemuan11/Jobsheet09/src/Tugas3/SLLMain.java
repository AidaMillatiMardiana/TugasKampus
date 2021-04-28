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
public class SLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList singLL = new SingleLinkedList(); 
        
        singLL.addFirst("Android");
        singLL.print();
        singLL.insertBefore("Android", "Bahasa");
        singLL.print();
        singLL.insertAfter("Android", "Komputer");
        singLL.print();
        singLL.insertAfter("Komputer", "Basis Data");
        singLL.print();
        singLL.insertAfter("Basis Data", "Matematika");
        singLL.print();
        singLL.insertAfter("Matematika", "Statistika");
        singLL.print();
        singLL.insertBefore("Statistika", "Algoritma");
        singLL.print();
        singLL.addLast("Multimedia");
        singLL.print();
    }
}
