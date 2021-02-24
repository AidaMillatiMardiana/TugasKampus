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
public class PacMan {
    int x, y, width, height;
    
    void moveLeft(){
        x -= 1;
        printPosition();
    }
    
    void moveRight(){
        x += 1;
        printPosition();
    }
    void moveUp(){
        y -= 1;
        printPosition();
    }
    void moveDown(){
        y += 1;
        printPosition();
    }
    void printPosition(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((j == x) && (i == y)) {
                    System.out.println("X");
                } else {
                    System.out.println("*");
                }
                
            }
            System.out.println("");
        }
        
    }
}
