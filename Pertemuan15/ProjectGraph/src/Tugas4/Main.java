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
        int answer, index, index2;
        
        do{
            System.out.println("0. Malang");
            System.out.println("1. Jember");
            System.out.println("2. Surabaya");
            System.out.println("3. Jogja");
            System.out.println("");
            
            System.out.println("Masukkan Asal : ");
            String source = sc.next();
            if (source.equals("Malang")) {
                index = 0;
            } else if(source.equals("Jember")){
                index = 1;
            } else if(source.equals("Surabaya")){
                index = 2;
            } else {
                index = 3;
            }
            
            System.out.println("Masukkan Tujuan : ");
            String destination = sc.next();
            if (source.equals("Malang")) {
                index2 = 0;
            } else if(source.equals("Jember")){
                index2 = 1;
            } else if(source.equals("Surabaya")){
                index2 = 2;
            } else {
                index2 = 3;
            }
            
            graph.addEdge(source, destination, index, index2);
            System.out.println("Menambahkan edge lain?");
            System.out.println("1. Iya atau 0. Tidak");
            answer = sc.nextInt();
                
        } 
        while (answer == 1);
        System.out.println("");
        graph.printGraph();
    }
}
