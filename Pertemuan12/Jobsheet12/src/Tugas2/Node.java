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
public class Node {
    Book data;
    Node prev, next;
    
    Node(Node prev, Book data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
