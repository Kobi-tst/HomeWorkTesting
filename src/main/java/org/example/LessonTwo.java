package org.example;

import java.util.Scanner;

public class LessonTwo {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        fiveMetod();
        sixthMethod();
        seventhMethod();
        eightMethod();
        ninthMethod();
        tenthMethod();
        eleventhMethod();
        twelvethMethod();
        thirteenthMethod();
        fourteenthMethod();
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

    public static void eightMethod(){
        System.out.print("Введите текст: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        for (int i = 0; i < a; i++){
            System.out.println(str);
        }
    }

    public static boolean ninthMethod() {
        System.out.print("Введите год: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year %4 == 0 || year %400 == 0){
            System.out.println("Год високосный");
            return true;
        }
        else {
            System.out.println("Год не високосный");
            return false;
        }
    }

    public static void tenthMethod(){
        int num[] = new int [10];
        num[0] = 1;
        num[1] = 1;
        num[2] = 0;
        num[3] = 0;
        num[4] = 1;
        num[5] = 0;
        num[6] = 1;
        num[7] = 1;
        num[8] = 0;
        num[9] = 0;
        for (int i = 0; i < 10; i++){
            if (num[i] == 1){
                num[i] = 0;
            }
            else {
                num[i] = 1;
            }
            System.out.print(num[i]);
        }
    }

    public static void eleventhMethod(){
        int num[] = new int [100];
        for (int i = 0; i < 100; i++){
            num[i] = i+1;
            System.out.println(num[i]);
        }
    }

    public static void twelvethMethod(){
        int num[] = new int [12];
        num[0] = 1;
        num[1] = 5;
        num[2] = 3;
        num[3] = 2;
        num[4] = 11;
        num[5] = 4;
        num[6] = 5;
        num[7] = 2;
        num[8] = 4;
        num[9] = 8;
        num[10] = 9;
        num[11] = 1;
        for(int i = 0; i < 12; i++){
            if(num[i] < 6){
                num[i] = num[i]*2;
            }
            System.out.println(num[i]);
        }
    }

    public static void  thirteenthMethod(){
        int counter = 1;
        int[][] table = new int [10][10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                table[i][j] = counter;
                if(i == j){
                    table[i][j] = 1;
                }
                if(j == 9 - i){
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void fourteenthMethod(){
        System.out.print("Введите len: ");
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();
        int[] num = new int[len];

        System.out.print("Введите initialValue: ");
        int initialValue = scan.nextInt();

        for (int i = 0; i < len; i++){
            num[i] = initialValue;
            System.out.print(num[i] + " ");
        }
    }
}
