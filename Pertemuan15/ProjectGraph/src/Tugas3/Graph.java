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
public class Graph {
    int vertex;
    LinkedList list[];
    boolean directedGraph = false;
    
    public Graph(int vertex, boolean type){
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
        this.directedGraph = type;
    }
    
    //Menambahkan edge
    public void addEdge(int source, int destination){ // source = asal, destination = tujuan
        // add edge
        list[source].addFirst(destination); // dari asal akan disambungkan ke tujuan
        // add back edge (for undirected)
        if (directedGraph == false) {
            list[destination].addFirst(source);
        } 
    }
    
public void degree(int source) throws Exception{
        // degree undireted graph
        System.out.println("degree vertex "+source+" : "+list[source].size());
        
        // degree direted graph
            // indegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++){
            for (int j = 0; j < list[i].size(); j++){
                if (list[i].get(j)==source)
                    ++totalIn;
                
            }
                //outDegree
            for (k = 0; k < list[source].size(); k++){
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex "+ source +" : "+totalIn);
        System.out.println("Outdegree dari vertex "+ source +" : "+totalOut);
        System.out.println("degree dari vertex "+ source +" : "+(totalIn+totalOut));
    }
    
    public void removeEdge(int source, int destination) throws Exception{
        for (int i = 0; i < list[source].size(); i++) {
            if (destination == list[source].get(i)) {
                list[source].remove(i);
            }
        }
    }
    
    public void removeAllEdges(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.print("Graph berhasil dikosongkan");
    }
    
    public void printGraph() throws Exception{ // SKIP DULU
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) { // nge list semua vertex
                System.out.print("Vertex " + i + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) { // dari semua vertex yg ada di list, dicek mana saja yg sudh terhubung lalu di cetak
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
}
