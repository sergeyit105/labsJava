/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author Сергей
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("1 - PC" + "\n" + "2 - Laptop" + "\n" + "3 - Tablet");
    String s1 = new String(reader.nextLine());
    reader.close();
    int inp = Integer.parseInt(s1);
    try {
       if(inp == 1){
       PC p = new PC();
       p.charac();
       }
       else if(inp == 2){
       Laptop l = new Laptop();
       l.charac();
       }
       else if (inp == 3){
       Tablet t = new Tablet();
       t.charac();
       }
    }
    
    catch(IllegalArgumentException ex) { 
        ex.getMessage();
    }
    }
}
