package lab2;
public class Lab2 {
  public static double task1() {
    double x = 2.1, a = 5.1, b = 2.23, c = -1.13;
    double ac1 = Math.log((x - c)/(x + c));
    double ac2 = a * (Math.pow((x + b), 1/4));
    double result = ac2 - ac1;
    return result;
  }
  
  public static double task2() {
    double c = Math.random()* 1000, a = Math.random()* 1000, b = Math.random()* 1000;
    double x = (Math.random() * 1000) + c;
    double ac1 = Math.log((x - c)/(x + c));
    double ac2 = a * (Math.pow((x + b), 1/4));
    double result = ac2 - ac1;
    return result;
  }
  
  public static void main(String[] args) {
    double  result1 = task1(), result2 = task2();
    //System.out.println(result2);
    System.out.println("Task's 1 result is: " + result1 + " Task's 2 result is: " + result2);
  }   
}
