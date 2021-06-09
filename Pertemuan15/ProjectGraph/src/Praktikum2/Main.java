/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        graphArray graph;
        
        try{
            System.out.println("Masukkan jumlah vertex : ");
            v = sc.nextInt();
            System.out.println("Masukkan jumlah edge : ");
            e = sc.nextInt();
            
            graph = new graphArray(v);
            System.out.println("Masukkan edge : <to> <from>");
            while(count < e){
                to = sc.nextInt();
                from = sc.nextInt();
                
                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb : ");
            System.out.println("");
            for (int i = 1; i <= v; i++) { // mencetak vertex pada sisi to
                System.out.println(i + " ");
            }
            
            System.out.println("");
            
            for (int i = 1; i <= v; i++) {
                System.out.println(i + " ");
                for (int j = 1; j <= v; j++) {
                    System.out.println(graph.getEdge(i, j) + " ");
                }
                System.out.println("");
            } 
        } catch (Exception ex){
            System.out.println("Error! " + ex.getMessage());
        }
    }
}
