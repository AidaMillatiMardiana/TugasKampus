/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Main {
        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        boolean directedGraph;
        System.out.println("Apakah Graph akan dibuat directed ? ");
        System.out.println("1. Iya atau 0. Tidak");
        
        int type = sc.nextInt();
        if (type == 1) {
            directedGraph = true;
        } else {
            directedGraph = false;
        }
        Graph graph = new Graph(6, directedGraph);
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
        graph.removeEdge(2, 1);
        System.out.println("");
    }
}
