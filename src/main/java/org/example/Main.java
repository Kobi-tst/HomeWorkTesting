package org.example;
import java.util.Arrays;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Student Sam = new Student("sam", "636-02", 1, new int[] { 2, 2, 3, 2, 5 });
            Student Din = new Student("din", "436-01", 2, new int[] { 5, 5, 5, 4, 5 });
            Student Kris = new Student("kris", "706-02", 2, new int[] { 3, 4, 3, 4, 5 });
            Student Tom = new Student("tom", "401-02", 1, new int[] { 3, 3, 3, 3, 2 });
            Student Sandi = new Student("sandi", "602-04", 3, new int[] { 2, 5, 5, 2, 5 });
            Student Robbi = new Student("robbi", "332-01", 3, new int[] { 4, 3, 3, 4, 5 });
            ArrayList<Student> studentsList = new ArrayList<Student>(Arrays.asList(Sam, Din, Kris, Tom, Sandi, Robbi));

            Student.printStudents(studentsList, 3);

            System.out.println("-------");

            Student.print(studentsList);
            Student.deleteStudents(studentsList);
            Student.print(studentsList);
        }
}