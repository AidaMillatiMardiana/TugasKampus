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
public class Node {
    int data;
    Node next; // pointer di linked hanya 'next' karena data selanjutnya

    public Node(int nilai, Node berikutnya) {
        this.data = nilai; // nilai paramater nilai akan dimasukkan ke variabel data
        this.next=berikutnya; // nilai parameter node untuk nilai berikutnya
    }
}
