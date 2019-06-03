/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Сергей
 */
public class Lab8 {
    public static void main(String[] args) {
    UserHistory<String, String> twogenObj = new UserHistory<String, String>("New User", "New Action");

    String value = twogenObj.getob1();
    System.out.println("Значение: " + value);
    
    String str = twogenObj.getob2();
    System.out.println("Значение: " + str);
    }
    
}
