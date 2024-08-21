package com.geekbrains.lesson2.webinar;

public class Duck implements Flyable, Swimable{
    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывёт");
    }
}
