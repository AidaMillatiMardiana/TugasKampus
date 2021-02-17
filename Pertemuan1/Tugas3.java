/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Tugas3 {
    public static void main(String[] args){

        int[] numbers = new int[30];
        
        for (int i = 2; i <= numbers.length; i++) {
            if (i % 2 == 0) {
                if (i % 4 != 0) {
                    System.out.println(i);
                }
                
            }
        }
    }
}
