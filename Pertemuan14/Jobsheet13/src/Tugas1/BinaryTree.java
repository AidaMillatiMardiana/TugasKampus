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
public class BinaryTree {
    Node root;
    
    public BinaryTree(){
        root = null;
    }
    
    boolean isEmpty(){ // mengecek apakah binary tree kosong atau ada node nya
        return root == null;
    }
    
    void add(int data){ // sebelum menambahkan dicek terlebih dahulu, apakah binary tree kosong atau tidak
        if (isEmpty()) { //tree is empty
            root = new Node(data);
        } else {
            Node current = root; //node yg saat ini bisa ter-update, tidak statis nilainya
            while(true){
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node (data);
                        break;
                    }
                } else if (data > current.data){
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node (data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
    
    // JAWABAN
    // NO. 1 (MENAMBAHKAN NODE SECARA REKURSIF)
    void addRekursif(int data){
        addData(data, root);
    }
    
    void addData(int i, Node a){ // fungsi untuk membantu proses penambahan node secara rekursif
        if (root == null) {
            root = new Node(i);
            return;
        } else if (i > a.data){
            if (a.right != null) {
                addData(i, a.right);
            } else {
                a.right = new Node(i);
            }
        } else if (i < a.data){
            if (a.left != null) {
                addData(i, a.left);
            } else {
                a.left = new Node(i);
            }
        }
    }
    
    boolean find(int data){ //true false
        boolean hasil = false;
        Node current = root;
        while(current != null){ // kondisi root tidak kosong
            if (current.data == data) {
                hasil = true; //apabila datanya ditemukan, maka hasilnya true
                break;
            } else if(data < current.data){
                current = current.left; //apabila datanya kurang maka akan pindah di left child
            } else {
                current = current.right; //apabila datanya lebih maka akan disebelah kanan
            }
        }
        return hasil;
    }
    
    void traversePreOrder(Node node){
        if (node != null) {
            System.out.println(" " + node.data);
            traversePreOrder(node.left); //menyelesaikan yg disebelah kiri dulu sampai selesai
            traversePreOrder(node.right);
        }
    }
    
    void traversePostOrder(Node node){
        if (node != null) {
            traversePreOrder(node.left); //gantian left, right (berbasis sub-tree)
            traversePreOrder(node.right);
            System.out.println(" " + node.data);
        }
    }
    
    // perbedaan post dan in adalah jika 
    // post --> fokus di sebelah kiri yg bawah samapi habis
    // in --> fokus di sebelah kiri naik ke atas 
    
    void traverseInOrder(Node node){
        if (node != null) {
            traversePreOrder(node.left); // fokus left sampai dihabiskan, lalu right (berbasis sub-tree)
            System.out.println(" " + node.data);
            traversePreOrder(node.right);
        }
    }
    
    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        // find node (current) that will be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current != null){ // masih proses current nya ada
            if(current != null){
                break;
            } else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            //if there is no child, simply delete it
            if (current.left == null && current.right == null) { //penegecekan jika kedua current null
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { //if there is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //if there is 2 childs
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
        
    }
}
