/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Сергей
 */
public class Triangle implements Figure{
          public Triangle(){
      }
  
    public double Perimetr(double a, double b, double c){
    double result = a + b + c;
    return result;
    }
    
    public double Square(double a, double b, double c){
    double p = (a + b + c)/2;
    double result = p * (p - a) * (p - b) * (p - c);
    return result;
    }
}

