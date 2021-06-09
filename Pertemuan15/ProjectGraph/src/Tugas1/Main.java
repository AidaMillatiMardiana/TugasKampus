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
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph(6);
        int answer;
        
        do{
            System.out.print("Masukkan Asal     : ");
            int source = sc.nextInt();
            System.out.print("Masukkan Tujuan   : ");
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
            System.out.println("Menambahkan edge lain?");
            System.out.println("1. Iya atau 0. Tidak");
            answer = sc.nextInt(); 
        }
        while (answer == 1);
        
        graph.printGraph();
        graph.degree(2);
        System.out.println("");
    }
}
