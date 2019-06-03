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
    class UserHistory<T, V> {
    T ob1;
    V ob2;
    
    UserHistory(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    
    
    T getob1() {
        return ob1;
    }
    
    V getob2() {
        return ob2;
    }

}

