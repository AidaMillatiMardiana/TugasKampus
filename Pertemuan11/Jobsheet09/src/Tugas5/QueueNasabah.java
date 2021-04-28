/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author HP
 */
public class QueueNasabah {
    Node front, rear;
    
    public boolean IsEmpty(){ 
        return front == null;
    }
    
    public void peek(){
        if (!IsEmpty()) {
            Node tmp = front;
            System.out.println("Elemen Queue Terdepan : " );
            System.out.println("No Rekening    : " + tmp.data.rek);
            System.out.println("Nama Nasabah   : " + tmp.data.nama);
            System.out.println("No Hp Nasabah  : " + tmp.data.nohp);
            System.out.println("Alamat Nasabah : " + tmp.data.alamat);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    
    public void print(){
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            Node tmp = front;
            System.out.println("Elemen Queue Terdepan : " );
            System.out.println("No Rekening    : " + tmp.data.rek);
            System.out.println("Nama Nasabah   : " + tmp.data.nama);
            System.out.println("No Hp Nasabah  : " + tmp.data.nohp);
            System.out.println("Alamat Nasabah : " + tmp.data.alamat);
        }
    }
    
    public void Enqueue(NasabahBank input){
        Node ndInput = new Node(input, null);
        if (front != null) {
            if (IsEmpty()) {
                front = ndInput;
                rear = ndInput;
            } else {
                front.next = ndInput;
                rear = ndInput;
            }
        } else {
            if (IsEmpty()) {
                front = ndInput; 
                rear = ndInput; 
            } else {
                ndInput.next = front;
                front = ndInput;
            }
        }
    }
    
    public void Dequeue(){
        if (IsEmpty()) {
            System.out.println("Queue masih kosong tidak dapat dihapus");
        } else if (front == rear ) {
            front = rear = null;
        } else {
            front = front.next;
        }
    }
    
    public void peekPosition(String key){
        if (!IsEmpty()) {
            Node tmp = front;
            while (tmp != null) {
                if (tmp.data.rek.equals(key)) {
                    System.out.println("No Rekening    : " + tmp.data.rek);
                    System.out.println("Nama Nasabah   : " + tmp.data.nama);
                    System.out.println("No Hp Nasabah  : " + tmp.data.nohp);
                    System.out.println("Alamat Nasabah : " + tmp.data.alamat);
                    tmp = tmp.next;
                }
                break;
            }
            System.out.println("");
        } else {
            System.out.println("Data masih kosong");
        }
    }
    
    public void peekRear(){
        if (!IsEmpty()) {
            Node tmp = front;
            System.out.println("Elemen Queue Terdepan : " );
            System.out.println("No Rekening    : " + tmp.data.rek);
            System.out.println("Nama Nasabah   : " + tmp.data.nama);
            System.out.println("No Hp Nasabah  : " + tmp.data.nohp);
            System.out.println("Alamat Nasabah : " + tmp.data.alamat);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
}
