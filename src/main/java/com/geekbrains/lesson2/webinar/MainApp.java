package com.geekbrains.lesson2.webinar;

public class MainApp {
    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.fly();
        duck.swim();

        System.out.println();

        Swimable [] swimables = {new Duck(), new Fish()};

        for (Swimable swimable : swimables) {
            swimable.swim();
        }
    }
}
