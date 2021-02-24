/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class SewaGameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SewaGame sg1 = new SewaGame(1001, 50000, "Mobile Legend");
        SewaGame sg2 = new SewaGame(2002, 55000, "Among Us");
        SewaGame sg3 = new SewaGame(3003, 60000, "Free Fire");
        SewaGame sg4 = new SewaGame(4004, 65000, "PUBG");
        SewaGame sg5 = new SewaGame(5005, 70000, "CZ");
        
        System.out.println("======================================");
        sg1.tampilGame();
        sg2.tampilGame();
        sg3.tampilGame();
        sg4.tampilGame();
        sg5.tampilGame();
        System.out.println("======================================");
        
        System.out.print("Pilih ID Game   : ");
        int pil = sc.nextInt();
        switch(pil){
            case 1001:
                sc.nextLine();
                System.out.print("Masukkan Nama Member : ");
                sg1.namaMember = sc.nextLine();
                System.out.print("Masukkan Lama Sewa   : ");
                sg1.lamaSewa = sc.nextInt();
                System.out.println("--------------------------------");
                sg1.dataSewa();
                break;
            case 2002:
                sc.nextLine();
                System.out.print("Masukkan Nama Member : ");
                sg2.namaMember = sc.nextLine();
                System.out.println("Masukkan Lama Sewa   : ");
                sg2.lamaSewa = sc.nextInt();
                System.out.println("--------------------------------");
                sg2.dataSewa();
            case 3003:
                System.out.println("Masukkan Nama Member : ");
                sg3.namaMember = sc.nextLine();
                System.out.println("Masukkan Lama Sewa   : ");
                sg3.lamaSewa = sc.nextInt();
                sg3.dataSewa();
            case 4004:
                System.out.println("Masukkan Nama Member : ");
                sg4.namaMember = sc.nextLine();
                System.out.println("Masukkan Lama Sewa   : ");
                sg4.lamaSewa = sc.nextInt();
                sg4.dataSewa();
            case 5005:
                System.out.println("Masukkan Nama Member : ");
                sg5.namaMember = sc.nextLine();
                System.out.println("Masukkan Lama Sewa   : ");
                sg5.lamaSewa = sc.nextInt();
                sg5.dataSewa();
            default :
                System.out.println("MAAF ID YANG ANDA MASUKKAN SALAH");
        }
        
        
    }
    
}
