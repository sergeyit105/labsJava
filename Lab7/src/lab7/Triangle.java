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
     double a = 0;
     double b = 0;
     double c = 0;     
          public Triangle(){
      }
    @Override
    public double Perimetr(){
    double result = a + b + c;
    return result;
    }
    @Override
    public double Square(){
    double p = (a + b + c)/2;
    double result = p * (p - a) * (p - b) * (p - c);
    return result;
    }
}

