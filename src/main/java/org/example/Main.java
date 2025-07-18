package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(350);
        dogBobik.swim(20);

        Cat catBoris = new Cat("Борис");
        catBoris.run(0);
        catBoris.swim(20);

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

        // Второе задание
        Circle circle = new Circle(2f,"Нет","Белый");
        circle.info();
        Triangle triangle = new Triangle(3f, 4f,5f,"Красный","Желтый");
        triangle.info();
        Rectangle rectangle = new Rectangle(3.1f, 3.2f,"Синий","Зеленый");
        rectangle.info();
    }
}