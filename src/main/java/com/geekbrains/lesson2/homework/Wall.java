package com.geekbrains.lesson2.homework;

public class Wall {
    private int height;

    public Wall(int height) {
        if(height < 0) {
            System.out.println("Вы ввели некорретное значение");
        } else {
            this.height = height;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
