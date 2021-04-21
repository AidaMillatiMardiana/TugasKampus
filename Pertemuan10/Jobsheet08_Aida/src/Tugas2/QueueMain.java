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
import java.util.Scanner;
public class QueueMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueu");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("-----------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        
        Queue Q = new Queue(n);
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan data baru");
                    System.out.println("Masukkan NIM : ");
                    String nim = sc.nextLine();
                    System.out.println("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    System.out.println("Masukkan Absen : ");
                    int absen = sc.nextInt();
                    System.out.println("Masukkan IPK : ");
                    double ipk = sc.nextDouble();
                    
                    Mahasiswa mhs = new Mahasiswa(nim, nama, absen, ipk);
                    Q.Enqueue(mhs);
                    System.out.println();
                    break;
                case 2:
                    Mahasiswa dataKeluar = Q.Dequeue();
                    if(!"".equals(dataKeluar.nim) && !"".equals(dataKeluar.nama)
                      && dataKeluar.absen != 0 && dataKeluar.ipk != 0){
                        System.out.print("Data yang keluar : " + dataKeluar.nim + " " + dataKeluar.nama
                        + " " + dataKeluar.absen + " " + dataKeluar.ipk);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM : ");
                    int nim = sc.nextInt();
                    Q.peekPosition(nim);
                case 7:
                    System.out.println("Index : ");
                    int idx = sc.nextInt();
                    Q.peekAt(idx);
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
