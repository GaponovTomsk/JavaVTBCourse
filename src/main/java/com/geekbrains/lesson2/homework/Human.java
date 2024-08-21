package com.geekbrains.lesson2.homework;

public class Human implements  Competition {
    private String name;

    boolean humanStatus;

    public Human(String name) {
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
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void jump(int height) {
        if(!humanStatus) {
            if (height > 5) {
                System.out.println("Человек " + name + " выбыл из соревнования.");
                humanStatus = true;
            } else {
                System.out.println("Человек " + name + " прыгнул на " + height + " м.");
            }
        }
    }

    @Override
    public void run(int length) {
        if(!humanStatus) {
            if (length > 1000) {
                System.out.println("Человек " + name + " выбыл из соревнования.");
                humanStatus = true;
            } else {
                System.out.println("Человек " + name + " пробежал на " + length + " м.");
            }
        }
    }
}
