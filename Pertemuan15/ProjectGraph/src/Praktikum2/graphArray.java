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
public class graphArray {
    
    private final int vertices;
    private final int[][] a2D;
    
    public graphArray(int v){
        vertices = v;
        a2D = new int[vertices + 1][vertices + 1];
    }
    
    public void makeEdge(int to, int from, int edge){
        try{
            a2D[to][from] = edge;
        } catch(ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        }
    }
    
    public int getEdge(int to, int from){
        try{
            return a2D[to][from];
        } catch(ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        } return -1;
    }
}
