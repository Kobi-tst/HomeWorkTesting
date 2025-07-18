package org.example;

public class Park {
    private String namePark; //Название парка
    private String timePark; //Время работы парка

    public Park(String namePark, String timePark){
        this.namePark = namePark;
        this.timePark = timePark;
    }

    void printPark(){
        System.out.println(namePark + " Время работы: " + timePark);
    }

    public class Attraction {
        private String nameAttr; //Название аттракциона
        private String timeAttr; //Время работы аттракциона
        private int price;  //Стоимость аттракциона

        public Attraction(String nameAttr, String timeAttr, int price){
            this.nameAttr = nameAttr;
            this.timeAttr = timeAttr;
            this.price = price;
        }

        void printAttr(){
            System.out.println("Аттракцион: " + nameAttr + " Время работы: " + timeAttr + " Стоимость: " + price);
        }
    }
}
