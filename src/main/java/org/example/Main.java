package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tovar tovar = new Tovar("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        tovar.printTovar();

        Tovar[] productsArray = new Tovar[5];
        productsArray[0] = new Tovar("Apple iPhone 16 Pro Max", "09.09.2024", "Foxconn", "USA", 5999, true);
        productsArray[1] = new Tovar("Xiaomi 15 Ultra", "02.03.2025", "Xiaomi", "China", 4499, true);
        productsArray[2] = new Tovar("Poco M7 Pro", "17.12.2024", "Xiaomi", "China", 2500, false);
        productsArray[3] = new Tovar("Tecno Camon 40", "16.05.2025", "Tecno", "China", 2999, true);
        productsArray[4] = new Tovar("OnePlus 13", "31.10.2024", "OnePlus", "China", 4999, false);

        /*for (int i = 0; i < productsArray.length; i++){
            productsArray[i].printTovar();                  //Вывод в задании вроде не нужен
        }*/

        Park central = new Park("Центральный парк", "9:00-23:00");
        Park.Attraction[] centralAtrr = new Park.Attraction[3];
        centralAtrr[0] = central.new Attraction("Емеля", "10:00-18:00", 500);
        centralAtrr[1] = central.new Attraction("Карусель", "11:00-17:00", 750);
        centralAtrr[2] = central.new Attraction("Тир", "14:00-19:00", 666);

        /*central.printPark();
        for (int i = 0; i < centralAtrr.length; i++){
            centralAtrr[i].printAttr();                 //Вывод парка с аттракционами
        }*/
    }
}