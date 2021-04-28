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
public class SLLMain {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList singLL = new SingleLinkedList(); 
        
        singLL.addFirst("b");
        singLL.insertBefore("b", "a");
        singLL.insertAfter("b", "c");
        singLL.insertAfter("c", "d");
        singLL.addLast("e");
        singLL.print();
        
    }
}
