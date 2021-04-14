/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author HP
 */
public class Stack {
    int size;
    int top;
    int data[];
    String kalimat, balik = " ";
    
    public Stack(int size){
        this.size = size;
        data = new int[size];
        top = -1;
    }
    
    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public void push(int dt){
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Isi Stack Penuh!");
        }
    }
    
    public void pop(){
        if (!isEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas: " + data[top]);
    }
    
    public void print(String kalimat){
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
        System.out.println("");
//            for (int i = kalimat.length()-1; i >= 0; i--) {
//            balik = balik + kalimat.charAt(i);
//        }
    }
    
    public void clear(){
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
