package org.example;

import java.util.Scanner;

public class LessonTwo {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        fiveMetod(10, 20);
        sixthMethod(5);
        seventhMethod(-5);
        eightMethod("Строка", 5);
        ninthMethod();
        tenthMethod();
        eleventhMethod();
        twelvethMethod();
        thirteenthMethod();
        fourteenthMethod(6, 7);
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 6;
        int b = -9;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 101;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers(){
        int a = 10;
        int b = 1;
        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static boolean fiveMetod(int a, int b){
        return ((a + b) >= 10 && (a + b) <= 20);
    }

    public static void sixthMethod(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean seventhMethod(int a){
        if (a >= 0){
            return false;
        }
        else {
            return true;
        }
    }

    public static void eightMethod(String str, int a){
        for (int i = 0; i < a; i++){
            System.out.println(str);
        }
    }

    public static boolean ninthMethod() {
        System.out.print("Введите год: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year %4 == 0 || year %400 == 0){
            return true;
        }
        else {
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
        int num[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < num.length; i++){
            if(num[i] < 6){
                num[i] = num[i]*2;
            }
            System.out.print(num[i] + " ");
        }
    }

    public static void  thirteenthMethod(){
        int counter = 1;
        System.out.print("Введите количество строк: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = a;
        int[][] table = new int [a][b];
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                table[i][j] = counter;
                if(i == j){
                    table[i][j] = 1;
                }
                if(j == (a - 1) - i){
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static int[] fourteenthMethod(int len, int initialValue){
        int[] num = new int[len];
        for (int i = 0; i < len; i++){
            num[i] = initialValue;
            //System.out.print(num[i] + " "); //Писал для себя, чтобы проверить
        }
        return num;
    }
}
