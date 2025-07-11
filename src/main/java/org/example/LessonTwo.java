package org.example;

import java.util.Scanner;

public class LessonTwo {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        //fiveMetod();
        //sixthMethod();
        //seventhMethod();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 6;
        int b = -9;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void printColor(){
        int value = 100;
        if (value <= 0){
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100 ){
            System.out.println("Жёлтый");
        }
        if (value > 100 ){
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers(){
        int a = 10;
        int b = 1;
        if (a >= b){
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }

    public static boolean fiveMetod(){
        System.out.print("Введите число а: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }

    public static void sixthMethod(){
        System.out.print("Введите целое число: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a >= 0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean seventhMethod(){
        System.out.print("Введите целое число: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a >= 0){
            System.out.println("false");
            return false;
        }
        else {
            System.out.println("true");
            return true;
        }
    }
}
