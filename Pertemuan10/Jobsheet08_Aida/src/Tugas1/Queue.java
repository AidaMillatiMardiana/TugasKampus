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
public class Queue {
    public int max;
    public int size;
    public int front;
    public int rear;
    public int[] Q;
    
    public Queue(int max){
        this.max = max;
        Create();
    }

    public void Create(){
        Q = new int [max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){ 
        if(size == 0){ 
            return true;
        } else { 
            return false;
        }
    }
    
    public boolean IsFull(){ 
        if (size == max) { 
            return true;
        } else {
            return false;
        }
    }
    
    public void peek(){
        if (!IsEmpty()) {
            System.out.println("Elemen Queue Terdepan : " + Q[front]);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    
    public void print(){
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            int i = front;
            while(i != rear){
                System.out.println(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah Elemen : " + size);
        }
    }
    
    public void clear(){ 
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void Enqueue(int data){
        if (IsFull()) {
            System.out.println("Queue Sudah Penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0; 
            } else {
                if (rear == max-1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            Q[rear] = data; 
            size++;
        }
    }
    
    public int Dequeue(){
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max-1) {
                    front = 0;
                }
            }
        }
        return data;
    }
    
    public void peekPosition(int data){
        if (!IsEmpty()) {
            int idx = -1;
            int count = 0;
            for (int i = 0; i != rear; i++) {
                if (data == Q[i]) {
                    idx = i;
                    count++;
                    break;
                }
                i = (i + 1) % max;
            }
            if (count > 0) {
                System.out.println("Data " + data + " terdapat pada index " + idx);
            } else {
                System.out.println("Maaf, data yang anda masukkan tidak ada");
            }
        } else {
            System.out.println("Data masih kosong");
        }
    }
    
    public void peekAt(int position){
        if (!IsEmpty()) {
            if (position <= max || position > 0) {
                System.out.println("Pada index "  + position + " adalah data " + Q[position]);
            } else {
                System.out.println("Mohon periksa kembali size nya");
            }
        } else {
            System.out.println("Data masih kosong");
        }
    }
}
