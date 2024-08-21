package com.geekbrains.lesson2.homework;

public class Robot implements Competition {
    private String name;

    boolean robotStatus;

    public Robot(String name) {
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
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void jump(int height) {
        if(!robotStatus) {
            if (height > 10) {
                System.out.println("Робот " + name + " выбыл из соревнования.");
                robotStatus = true;
            } else {
                System.out.println("Робот " + name + " прыгнул на " + height + " м.");
            }
        }
    }

    @Override
    public void run(int length) {
        if(!robotStatus) {
            if (length > 700) {
                System.out.println("Человек " + name + " выбыл из соревнования.");
                robotStatus = true;
            } else {
                System.out.println("Робот " + name + " пробежал на " + length + " м.");
            }
        }
    }
}
