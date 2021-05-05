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
public class Stack {
    int size;
    Node head;
    
    public Stack(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void push(Book item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode; 
            head = newNode;
        }
        size++;
    }
    
    public void pop() throws Exception{
        if (size == 1) {
            removeLast();
        } else if (isEmpty()){
            System.out.println("Stack masih kosong");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
        
    }
    
    public void peek(){
        if (isEmpty()) {
            System.out.println("Stack masih kosong");
        } else {
            Node tmp = head;
            System.out.println("Buku teratas adalah : ");
            System.out.println(tmp.data.title);
        }
    }
    
    public void print(){
        if (isEmpty()) {
            System.out.println("Stack masih kosong");
        } else {
            Node tmp = head;
            System.out.println("Daftar Judul Buku");
            while(tmp != null){
                System.out.println("-> " + tmp.data.title + "\n");
                tmp = tmp.next;
            }
        }
    }
    
    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
}
