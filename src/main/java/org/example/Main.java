package org.example;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Student Max = new Student("Max", "1A", 1, new int[] { 2, 2, 3, 2, 5 });
            Student Din = new Student("Din", "1A", 2, new int[] { 5, 5, 5, 4, 5 });
            Student Kris = new Student("Kris", "2B", 3, new int[] { 3, 4, 3, 4, 5 });
            Student Tom = new Student("Tom", "2B", 1, new int[] { 3, 3, 3, 3, 2 });
            Student Eva = new Student("Eva", "3C", 2, new int[] { 2, 5, 5, 2, 5 });
            Student Lena = new Student("Lena", "3C", 3, new int[] { 4, 3, 3, 4, 5 });
            ArrayList<Student> studentsList = new ArrayList<Student>(Arrays.asList(Max, Din, Kris, Tom, Eva, Lena));

            Student.printStudents(studentsList, 3);

            /*Student.print(studentsList);
            Student.deleteStudents(studentsList);
            Student.print(studentsList);*/

            //Вторая часть домашки
            Phonebook.add("Ivanov", "+7(20)287-52-91");
            Phonebook.add("Petrov", "+7(8163)057-18-29");
            Phonebook.add("Ivanov", "+7(360)704-01-43");
            Phonebook.get("ivanov");
            Phonebook.get("sidorov");
        }
        public static Map<String, Integer> createFreqMap(String[] strings) {
                Map<String, Integer> map = new HashMap<>();
                for (String key : strings) {
                        Integer count = map.getOrDefault(key, 0);
                        map.put(key, count + 1);
                }
                return map;
        }
}