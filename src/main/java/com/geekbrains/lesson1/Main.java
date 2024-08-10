package com.geekbrains.lesson1;

import com.geekbrains.lesson1.Animals.Animal;
import com.geekbrains.lesson1.Animals.Cat;
import com.geekbrains.lesson1.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = {
            new Cat("Барсик"),
            new Dog("Бобик"),
            new Dog("Персик"),
            new Dog("Тузик"),
            new Cat("Мурзик")
        };


        for (Animal animal : animals) {
            animal.run((int) (Math.random() * 500));
        }

        for (Animal animal : animals) {
            animal.swim((int) (Math.random() * 100));
        }

        Dog.printDogCount();
        Cat.printCatCount();
    }
}
