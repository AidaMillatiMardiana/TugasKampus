/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double saldo = 1000000;
        
        for (int a = 0, b = 0; saldo <= 1500000; a++) {
            System.out.println("Bulan ke" + (b+1) + " saldo sebesar Rp." + saldo);
            saldo = saldo + (saldo * 0.02);
            a++;
            b++;

        }
    }
}
