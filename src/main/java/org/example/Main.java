package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tovar tovar = new Tovar("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        tovar.printTovar();
    }
}