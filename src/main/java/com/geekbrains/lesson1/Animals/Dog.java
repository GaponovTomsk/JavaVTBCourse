package com.geekbrains.lesson1.Animals;

public class Dog extends Animal {

    protected static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }


    @Override
    public void run(int distance) {
        if(distance < 0 || distance > 500) {
            System.out.println("Собаки не умеют бегать на такие дистанции.");
        } else {
            System.out.println(name + " пробежал " + distance + " m.");
        }
    }

    @Override
    public void swim(int distance) {
        if(distance < 0 || distance > 10) {
            System.out.println("Собаки не умеют плавать на такие дистанции.");
        } else {
            System.out.println(name + " проплыл " + distance + " m.");
        }
    }

    public static void printDogCount() {
        System.out.println("Создано " + dogCount + " экземпляров класса Собака");
    }
}
