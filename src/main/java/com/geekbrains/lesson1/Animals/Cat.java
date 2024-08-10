package com.geekbrains.lesson1.Animals;

public class Cat extends Animal {

    protected static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if(distance < 0 || distance > 200) {
            System.out.println("Кот такие дистанции не бегает");
        } else {
            System.out.println("Кот " + name + " пробежал " + distance + " m.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }

    public static void printCatCount() {
        System.out.println("Создано " + catCount + " экземпляров класса Кот");
    }
}
