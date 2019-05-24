/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;
import java.util.ArrayList;


public class Lab4 {
  public static void main(String[] args) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    char[] alph =  alphabet.toCharArray();
    //System.out.println(alph.length);
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String s1 = new String(reader.nextLine());
    reader.close();
    char[] s1arr = s1.toCharArray();
    for (int i = 0; i < s1arr.length; i++ ){
      for (int j = 0; j < alph.length; j++){
        if (s1arr[i] == alph[j]){
            /*double z = j;
            double test = (z+3)/25;
            //System.out.println((z+3)/25);
            if (test > 1){
              int k = j - 23;*/ 
             int index = check(j);
              System.out.print(alph[index]);  
            }
            /*else{
             // System.out.print(alph[j+3]);  
            }*/
        }
        }
      }

    public static int check(int x) {
    double index = x;
    int x2 = 0;
    double test = (index + 3)/25;
    if (test > 1){
       x2 = (int)index - 23; 
    }
    else {
      x2 = (int)index + 3;
    }
    return x2;
  }
   }
