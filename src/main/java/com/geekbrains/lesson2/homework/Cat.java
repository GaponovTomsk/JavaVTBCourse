package com.geekbrains.lesson2.homework;

public class Cat implements Competition {
    private String name;

    boolean catStatus;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void jump(int height) {
        if(!catStatus) {
            if (height > 50) {
                System.out.println("Кот " + name + " из соревнования выбыл");
                catStatus = true;
            } else {
                System.out.println("Кот " + name + " прыгнул на " + height + " м.");
            }
        }
    }

    @Override
    public void run(int length) {
        if (!catStatus) {
            if (length > 500) {
                System.out.println("Кот " + name + " из соревнования выбыл");
                catStatus = true;
            } else {
                System.out.println("Кот " + name + " пробежал на " + length + " м.");
            }
        }
    }
}
