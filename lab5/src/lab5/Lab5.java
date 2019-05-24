
package lab5;

import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a: ");
    String s1 = new String(reader.nextLine());
    reader.close();
    double sd = Double.parseDouble(s1);
    Cube newcub = new Cube(sd);
    double result1 = newcub.square();
    double result2 = newcub.v();
    double result3 = newcub.length();
    System.out.println("Square is: " + result1);
    System.out.println("V is: " + result2);
    System.out.println("Length is: " + result3);
    }
    
}
