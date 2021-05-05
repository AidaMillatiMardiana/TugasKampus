/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author HP
 */
public class DoubleLinkedLists {
    Node head;
    int size;
    
    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null; // jika kondisi null, maka double link lists tersebut kosong
    }
    
    public void addFirst(Mahasiswa item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode; // pertukaran, dimana data yg baru diinputkan akan menggeser posisi head
            head = newNode;
        }
        size++;
    }
    
    public void addLast(Mahasiswa item){
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head; // current merupaka node yg kita fokuskan saat itu (berarti fokusnya pada head)
            while (current.next != null){ // apakah ada node lain setelah head
                current = current.next; // jika ada, maka current (fokus) nya menjadi pindah setelah hed
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void add(Mahasiswa item, int index) throws Exception{
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size){ 
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
            } else {
                Node newNode = new Node(null, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
                
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null){
                System.out.println("NIM     : " + tmp.data.nim);
                System.out.println("Nama    : " + tmp.data.nama);
                System.out.println("IPK     : " + tmp.data.ipk);
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    // PRAKTIKUM 2
    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
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
    
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public void findSeq(int cari){
        if (!isEmpty()) {
            Node tmp = head;
            int nim = 0, i = -1;
            String nama = " ";
            double ipk = 0;
             while (tmp != null){
                if(cari == tmp.data.nim){
                    nim = tmp.data.nim;
                    nama = tmp.data.nama;
                    ipk = tmp.data.ipk;
                    i++;
                }
                tmp = tmp.next;
            }
            System.out.println(cari + " pada indeks ke-" + i);
            System.out.println("NIM     : " + nim);
            System.out.println("Nama    : " + nama);
            System.out.println("IPK     : " + ipk);
            
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void selectionSort(boolean bool){
        Node current = head, index = null;
        int temp;
        if (head == null) {
            //return;
        }else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                        if (current.data.ipk < index.data.ipk) {
                            temp = (int) (double) current.data.ipk;
                            current.data.ipk = index.data.ipk;
                            index.data.ipk = temp;
                        }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
}
