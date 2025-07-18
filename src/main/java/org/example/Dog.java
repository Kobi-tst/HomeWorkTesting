package org.example;

public class Dog extends Animal {

    final static int MAX_RUN_DISTANCE = 500;
    final static int MAX_SWIM_DISTANCE = 10;
    public static int dogQty;

    public Dog(String name) {
        super(name);
        dogQty += 1;
    }
    public static void printQuantity() {
        System.out.println("Собак: " + dogQty);
    }
    public void run(int distance) {
        if (distance <= 0){
            System.out.println(name + " не захотел бежать");
        } else if (distance >= MAX_RUN_DISTANCE){
            System.out.println(name + " захотел пробежать " + distance + " но смог только " + MAX_RUN_DISTANCE );
        } else {
            System.out.println(name + " пробежал " + (distance) + "м");
        }
    }
    public void swim(int distance) {
        if (distance <= 0){
            System.out.println(name + " не захотел плыть");
        } else if (distance >= MAX_SWIM_DISTANCE){
            System.out.println(name + " захотел проплыть " + distance + " но смог только " + MAX_SWIM_DISTANCE );
        } else {
            System.out.println(name + " проплыл " + (distance) + "м");
        }
    }
}