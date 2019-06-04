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
double a = 0;
  @Override
  public double Perimetr(){
    double result = 4 * a;
    return result;
  }
  @Override
  public double Square(){
    double result = a * a;
    return result;
  }
}
