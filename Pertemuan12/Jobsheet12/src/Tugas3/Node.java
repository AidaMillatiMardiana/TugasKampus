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
public class Node {
    Vaksinasi data;
    Node prev, next;
    
    Node(Node prev, Vaksinasi data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
