package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(150);
        dogBobik.swim(20);

        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(350);
        catBarsik.swim(20);

        Cat catPushok = new Cat("Пушок");

        Animal.printQuantity();
        Dog.printQuantity();
        Cat.printQuantity();

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Мурзик");
        cats[1] = new Cat("Черныш", 15);
        cats[2] = new Cat("Жорик", 50);

        Bowl catsBowl = new Bowl(70);
        for (Cat cat: cats) {
            cat.eat(catsBowl);
            cat.printWellfed();
        }
    }
}