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
import java.util.Scanner;
public class DoubleLinkedListsMain {
    static void menu(){
        System.out.println("\n==================================================");
        System.out.println("PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLY LINKED LIST");
        System.out.println("==================================================");
        System.out.println("1. Tambah Head");
        System.out.println("2. Tambah Tail");
        System.out.println("3. Tambah Data");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. Urut Data");
        System.out.println("10. Keluar");
    }
    
    public static void main(String[] args) throws Exception{
        DoubleLinkedLists dll = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        
        int option;
        do{
            menu();
            option = sc.nextInt();
            sc.nextLine();
            switch(option){
            case 1:
                System.out.println("Masukkan data pada posisi head");
                int datahead = sc.nextInt();
                dll.addFirst(datahead); 
                break;
            case 2:
                System.out.println("Masukkan data pada posisi tail");
                int datatail = sc.nextInt();
                dll.addLast(datatail);
                break;
            case 3:
                System.out.println("Masukkan data yang ingin ditambahkan"); // sek eror
                int adddata = sc.nextInt();
                System.out.println("Masukkan posisi");
                int pss = sc.nextInt();
                dll.add(adddata, pss);
                break;
            case 4:
                System.out.print("Hapus data pertama\t");
                dll.removeFirst();
                break;
            case 5:
                System.out.println("Hapus data terakhir");
                dll.removeLast();
                break;
            case 6:
                System.out.println("Hapus data tertentu");
                dll.remove(option);
                break;
            case 7:
                System.out.println("Cetak");
                dll.print();
                break;
            case 8:
                System.out.println("Mencari data");
                pss = sc.nextInt();
                dll.findSeq(pss);
                break;
            case 9:
                System.out.println("Mengurutkan data");
                System.out.println("Mengurutkan data secara descending");
                dll.selectionSort(true);
                break;
            case 10:
                System.out.println("Keluar atau menu tidak ada");
                break;
            default:
                    System.out.println("Tidak ada opsi");
        }
    } while (option == 1 || option == 2 || option == 3 || option == 4 || option == 5 || option == 6 || option == 7 ||
                option == 8 || option == 9 || option == 10);
    }
}
