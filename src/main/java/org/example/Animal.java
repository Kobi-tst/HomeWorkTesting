package org.example;

public abstract class Animal {
    String name;    //Название животного
    public static int animalQty; //Счетчик животных

    public Animal(String name) {
        this.name = name;
        animalQty += 1;
    }

    public static void printQuantity() {
        System.out.println("Животных: " + animalQty);
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + "м");
    }
    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + "м");
    }
}
