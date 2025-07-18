package org.example;

public class Tovar {
    private String name; //Название
    private String datePr; //Дата производства
    private String producer; //Производитель
    private String country; //Страна происхождения
    private int price; //Цена
    private boolean status; //Состояние бронирования покупателем

    Tovar(String name, String datePr, String producer, String country, int price, boolean status) {
        this.name = name;
        this.datePr = datePr;
        this.producer = producer;
        this.country = country;
        this.price = price;
        this.status = status;
    }

    void printTovar(){
        System.out.println(name + " " + datePr + " " + producer + " " + country + " " + price + " " + status);
    }
}
