package org.example;

public class MainFactorial {
    public static void main(String[] args) {
        for (int i = 0; i < 31; i++) {
            System.out.println(i + "!=" + Factorial.get(i));
        }
    }
}