
package org.example;

public class EqualsAB {
    public static boolean equalsAB(int a, int b){
        if (a > b){
            System.out.println("Число А больше Б");
            return true;
        } else if (a < b){
            System.out.println("Число А меньше Б");
            return true;
        } else {
            System.out.println("Числа А и Б равны");
            return true;
        }
    }
}
