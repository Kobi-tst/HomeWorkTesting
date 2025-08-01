package org.example;

//Программа выполняющая арифметические действия

public class MainArifmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("Сумма: " + Arifmetic.sum(a,b));
        System.out.println("Разность: " + Arifmetic.raz(a,b));
        System.out.println("Произведение: " + Arifmetic.pr(a,b));
        System.out.println("Частное: " + Arifmetic.ch(a,b));
    }
}
