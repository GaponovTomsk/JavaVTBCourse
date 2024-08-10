package com.geekbrains.lesson1.Animals;

public abstract class  Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int distance;

    public abstract void run(int distance);
    public abstract void swim(int distance);
}
