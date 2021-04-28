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
public class SingleLinkedList {
    Node head; // posisi awal linked list
    Node tail; // posisi akhir linked list
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void print() { // method untuk mencetak semua elemen
        if(!isEmpty()) {
            Node tmp = head; // membaca nilai yang dimiliki head
            System.out.print("Isi Linked List: \t");
                while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next; // untuk geser ke tmp yg lain (.next)
            }
            System.out.println("");
         } else {
             System.out.println("Linked list kosong");
        }
    }
    
    public void addFirst(String input) { // menambahkan node di posisi bagian paling awal
        Node ndInput = new Node (input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }   
    
    public void addLast(String input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput; // head dan tail sama dengan node input
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    public void insertAfter(String key, String input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next==null) tail=ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    
    public void insertAt(int index, String input) { // insert menggunakan index
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) { // jika terletak di index 0 maka akan menjalankan method addFirst
            addFirst(input);
        } else { // tidak 0 dan tidak -1
            Node temp = head;
            for (int i = 0; i < index - 1 ; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next==null) tail = temp.next;
        }
    }
    
    public void insertBefore(String key, String input) {
      Node temp = head;
        do {
            if (head.data == key) {
                addFirst(input);
                break;
            } 
            if(temp.next.data == key){
                temp.next = new Node(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
}
