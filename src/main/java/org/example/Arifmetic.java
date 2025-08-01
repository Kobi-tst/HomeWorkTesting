package org.example;

public class Arifmetic {

    public static int sum(int a, int b){
        return a + b;
    }

    public static int raz(int a, int b){
        return a - b;
    }

    public static int pr(int a, int b){
        return a * b;
    }

    public static double ch(int a, int b){
        if (b != 0){
            return (double) a / b;
        }
        else {
            System.out.println("Ошибка!");
        }
        return 0;
    }
}