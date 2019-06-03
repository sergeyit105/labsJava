/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author Сергей
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
       Scanner in = new Scanner(System.in);
        System.out.println("1 - Triangle" + "\n" + "2 - Square" );
        double num = in.nextDouble();
        in.close();
        if(num == 1){
        Triangle tr = new Triangle();
        double a = 3, b = 4, c = 5;
        System.out.println("A = " + a + " B = " + b + " C = " + c);
        double result1 = tr.Perimetr(a, b, c);
        double result2 = tr.Square(a, b, c);
        System.out.println("Perimetr: " + result1);
        System.out.println("Squarae: " + result2);
        }
        
        else if (num == 2){
        Square sq = new Square();
        double a = 5;
        System.out.println("A: " + a);
        double result1 = sq.Perimetr(a);
        double result2 = sq.Square(a);
        System.out.println("Perimetr: " + result1);
        System.out.println("Squarae: " + result2);
        }
    }
     catch(IllegalArgumentException ex){
      ex.getMessage();
    }
    }
    
}
