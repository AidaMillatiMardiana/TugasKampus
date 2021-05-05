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
import java.util.Scanner;
public class DoubleLinkedListMain {
        static void menu(){
        System.out.println("==============================");
        System.out.println("SISTEM PENGOLAH DATA MAHASISWA");
        System.out.println("==============================");
        System.out.println("");
        System.out.println("1. Tambah Data awal");
        System.out.println("2. Tambah Data akhir");
        System.out.println("3. Tambah Data index tertentu");
        System.out.println("4. Hapus Data pertama");
        System.out.println("5. Hapus Data terakhir");
        System.out.println("6. Hapus Data tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari NIM");
        System.out.println("9. Urut data IPK-DESC");
        System.out.println("10. Keluar");
        System.out.println("");
        System.out.println("==============================");
    }
        
        public static void main(String[] args) throws Exception {
        DoubleLinkedLists dm = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
//        Stack lb = new Stack();
        int option;
        int nim;
        int indeks;
        String nama;
        double ipk;
//        String title;
        do{
            menu();
            option = sc.nextInt();
            sc.nextLine();
            
            switch(option){
                case 1:
                    System.out.println("Masukkan Data Mahasiswa Posisi Awal");
                    System.out.println("NIM : ");
                    nim = sc.nextInt();
                    System.out.println("Nama : ");
                    nama = sc.nextLine();
                    System.out.println("IPK : ");
                    ipk = sc.nextDouble();
                    Mahasiswa dt = new Mahasiswa(nim ,nama, ipk);
                    dm.addFirst(dt);
                    break;
                case 2:
                    System.out.println("Masukkan Data Mahasiswa Posisi Akhir");
                    System.out.println("NIM : ");
                    nim = sc.nextInt();
                    System.out.println("Nama : ");
                    nama = sc.nextLine();
                    System.out.println("IPK : ");
                    ipk = sc.nextDouble();
                    Mahasiswa dtl = new Mahasiswa(nim ,nama, ipk);
                    dm.addLast(dtl);
                    break;
                case 3:
                    System.out.println("Masukkan Data Mahasiswa Posisi Tertentu");
                    System.out.println("NIM : ");
                    nim = sc.nextInt();
                    System.out.println("Nama : ");
                    nama = sc.nextLine();
                    System.out.println("IPK : ");
                    ipk = sc.nextDouble();
                    System.out.print("Indeks ke-");
                    indeks = sc.nextInt();
                    Mahasiswa dtt = new Mahasiswa(nim ,nama, ipk);
                    dm.add(dtt, indeks);
                    break;
                case 4:
                    dm.removeFirst();
                    break;
                case 5:
                    dm.removeLast();
                case 6:
                    System.out.print("Hapus data indeks ke-");
                    indeks = sc.nextInt();
                    dm.remove(indeks);
                case 7:
                    dm.print();
                case 8:
                    System.out.println("Cari data");
                    System.out.println("Masukkan NIM yang Dicari : ");
                    int cari = sc.nextInt();
                    dm.findSeq(cari);
                case 9:
                    System.out.println("Mengurutkan Data (DESC)");
                    dm.selectionSort(true);
                    dm.print();
                case 10:
                    System.out.println("Keluar");
                default:
                    System.out.println("Tidak ada opsi");
            }
            
        } while (option == 1 || option == 2 || option == 3 || option == 4 || option == 5 || option == 6
                || option == 7 || option == 8 || option == 9 || option == 10);
    }
}
