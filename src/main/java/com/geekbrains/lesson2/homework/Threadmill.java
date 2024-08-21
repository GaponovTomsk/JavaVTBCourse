package com.geekbrains.lesson2.homework;

public class Threadmill {
    private int length;

    public Threadmill(int length) {
        if(length < 0) {
            System.out.println("Вы ввели некорретное значение");
        } else {
            this.length = length; 
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
