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
public class BinaryTreeArray {
    int[] data;
    int idxLast;
    
    public BinaryTreeArray(){
        data = new int [10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart){
        if (idxStart<=idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.println(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
    
    // JAWABAN NO 5
    // Menambahkan Data
    public void add(int idx, int data){
        this.data[idx] = data;
    }
    
    // Traverse pre order
    public void traversePreOrder(int idxawal){
        if (idxawal <= idxLast) {
            if (data[idxawal] != 0) {
                System.out.print(data[idxawal] + " ");
            } else {
                System.out.print(idxLast + " ");
            }
            traverseInOrder((2 * idxawal) + 1);
            traverseInOrder((2 * idxawal) + 2);
        }  
    }
    
    // Traverse post order
    public void traversePostOrder(int idxawal){
        if (idxawal <= idxLast) {
            traverseInOrder((2 * idxawal) + 1);
            traverseInOrder((2 * idxawal) + 2);
            if (data[idxawal] == 0) {
                System.out.print(idxLast + " ");
            } else {
                System.out.print(data[idxawal] + " ");
            }
        }
    }
}
