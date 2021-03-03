/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class MahasiswaMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] mhs = new Mahasiswa[4];
        
        for (int i = 1; i < 4; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Mahasiswa Ke-" + i);
            System.out.print("Masukkan Nama            : ");
            mhs[i].nama = sc.next();
            System.out.print("Masukkan NIM             : ");
            mhs[i].nim = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin   : ");
            mhs[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK             : ");
            mhs[i].ipk = sc.nextDouble();
            System.out.println();
        }
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Data Mahasiswa ke- " + i);
            System.out.print("\nNama          : " + mhs[i].nama);
            System.out.println("\nNIM           : " + mhs[i].nim);
            System.out.println("Jenis Kelamin : " + mhs[i].jenisKelamin);
            System.out.println("Nilai IPK     : " + mhs[1].ipk);
        }
    }
}
