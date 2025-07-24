package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("1. Корректный массив с суммой эл-в 20 -> 20");
        String[][] arr = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"-1", "-2", "-3", "-4"}};
        try {
            System.out.println("Сумма элементов массива: " + Array4x4.sum(arr));
        } catch (Exception e) {
            System.err.println(e);
        }
        Thread.sleep(50);

        System.out.println("2. Массив размера 4х3 -> MyArraySizeException");
        arr = new String[][]{{"5", "7", "3", "17"}, {"7", "0", "1", "12"}, {"8", "1", "2", "3"}};
        try {
            System.out.println("Сумма элементов массива: " + Array4x4.sum(arr));
        } catch (Exception e) {
            System.err.println(e);
        }
        Thread.sleep(50);

        System.out.println("3. Массив размера 3х4 -> MyArraySizeException");
        arr = new String[][]{{"5", "7", "3"}, {"7", "0", "1"}, {"8", "1", "2"}, {"18", "11", "21"}};
        try {
            System.out.println("Сумма элементов массива: " + Array4x4.sum(arr));
        } catch (Exception e) {
            System.err.println(e);
        }
        Thread.sleep(50);

        System.out.println("4. Массив 4х4, не только числа -> MyArrayDataException");
        arr = new String[][]{{"1", null, "3", "4"}, {"1", "@", "3", "4"}, {"1", "2", "3", "4"}, {"-1", "-2", "-3", "-4"}};
        try {
            System.out.println("Сумма элементов массива: " + Array4x4.sum(arr));
        } catch (Exception e) {
            System.err.println(e);
        }
        Thread.sleep(50);

        System.out.println("5. Массив 4х4, не только числа -> несколько MyArrayDataException");
        Integer sum = Array4x4.sumWithInnerErrPrint(arr);
        System.out.println("Сумма элементов массива: " + ((sum == null) ? "ошибка" : sum));
    }
}