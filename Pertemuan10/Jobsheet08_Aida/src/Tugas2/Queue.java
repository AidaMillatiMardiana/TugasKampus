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
public class Queue {
    int max;
    int front;
    int rear;
    int size;
    Mahasiswa[] Q;
    
    public Queue(int max){
        this.max = max;
        Create();
    }

    public void Create(){
        Q = new Mahasiswa[max];
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
            System.out.println("Elemen Queue Terdepan : " + Q[front].nama + " " + Q[front].absen + " "
            + Q[front].nim + " " + Q[front].ipk + " ");
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    
    public void print(){
        if (IsEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
//            int i = front;
            System.out.println(front + " " + rear);
            int i = rear;
            while(i > front){
                System.out.println(Q[front].nama + " " + Q[front].absen + " "
            + Q[front].nim + " " + Q[front].ipk + " ");
                i--;
            }
            System.out.println("Banyak elemen : " + size);
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
    
    public void Enqueue(Mahasiswa data){
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
    
    public Mahasiswa Dequeue(){
        Mahasiswa data = new Mahasiswa("", "", 0, 0);
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
    
    public void peekPosition(String nim){
        if (!IsEmpty()) {
            int idx = -1;
            int count = 0;
            for (int i = front; i < max; i++) {
                if (Q[i].nim.equals(nim)) {
                    idx = i;
                    count++;
                    break;
                }
            }
            if (count > 0) {
                System.out.println(Q[front].nama + " " + Q[front].absen + " "
            + Q[front].nim + " " + Q[front].ipk + " ");
            } else {
                System.out.println("Maaf, data yang anda masukkan tidak ada");
            }
        } else {
            System.out.println("Data masih kosong");
        }
    }
    
    public void peekRear(){
        if (!IsEmpty()) {
            System.out.println("Elemen Queue Terdepan : " + Q[rear].nama + " " + Q[rear].absen + " "
            + Q[rear].nim + " " + Q[rear].ipk + " ");
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }
    
    public void printMahasiswa(int posisi){
        if (!IsEmpty()) {
            if (posisi <= max || posisi > 0) {
                System.out.println(Q[rear].nama + " " + Q[rear].absen + " "
            + Q[rear].nim + " " + Q[rear].ipk + " ");
            } else {
                System.out.println("Mohon periksa kembali size nya");
            }
        } else {
            System.out.println("Data masih kosong");
        }
    }

}
