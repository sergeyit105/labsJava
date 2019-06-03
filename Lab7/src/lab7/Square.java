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
class Square implements Figure{

  public double Perimetr(double a){
    double result = 4 * a;
    return result;
  }
  
  public double Square(double a){
    double result = a * a;
    return result;
  }
}
