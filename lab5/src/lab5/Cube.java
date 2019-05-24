
package lab5;


public class Cube {
    double a = 0;

  public Cube(double param){
    a = param;
  }

  public double square() {
    double sq = 6 * (a * a); 
    return sq;
  }

  public double v(){
   double v = a * a * a;
   return v;
  }

  public double length(){
    double length = Math.round(Math.sqrt(3) * a);
    return length;
  }
}
