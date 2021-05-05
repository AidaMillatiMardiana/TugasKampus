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
public class Queue {
    Node head;
    int size;

    
    public Queue(){
        head = null;
        size = 0;
    }
    
    public boolean IsEmpty(){ 
        if(size == 0){ 
            return true;
        } else { 
            return false;
        }
    }
    
    public int size(){
        return size;
    }
    
    public void addFirst(Vaksinasi item){
        if (IsEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode; // pertukaran, dimana data yg baru diinputkan akan menggeser posisi head
            head = newNode;
        }
        size++;
    }
    
    public void Enqueue(Vaksinasi item){
        if (IsEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
        }
    }
    
    public void Dequeue() throws Exception{
        System.out.println(head.data.namaPengantri + " telah selesai divaksinasi");
        if (IsEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception{
        if (IsEmpty()) {
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
    
    public void print(){
        if (!IsEmpty()) {
            Node tmp = head;
            System.out.println("***********************");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("***********************");
            System.out.println("| No.    | Nama    |");
            while (tmp != null){
                System.out.println(tmp.data.antrian + "    | " + tmp.data.namaPengantri);
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian : " + size());
        } else {
            System.out.println("Data masih kosong");
        }
    }
}
