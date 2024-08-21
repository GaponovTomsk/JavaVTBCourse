package com.geekbrains.lesson2.homework;

public class MainAppTest {
    public static void main(String[] args) {

        Object[] obstacles = {
                new Wall((int)(Math.random() * 100)),
                new Threadmill((int)(Math.random() * 500)),
                new Wall((int)(Math.random() * 100)),
                new Threadmill((int)(Math.random() * 500)),
                new Wall((int)(Math.random() * 100)),
                new Threadmill((int)(Math.random() * 500))
        };


        Competition[] participants = {
                new Cat("Tom"),
                new Human("Ivan"),
                new Robot("Robocop"),
                new Cat("Murzic"),
                new Human("John"),
                new Robot("Terminator")
        };

        startGame(obstacles, participants);
    }

    public static void startGame(Object[] obstacles, Competition[] participants) {
        for (Object obstacle : obstacles) {
            for (Competition participant : participants) {
                if(obstacle instanceof Wall) {
                    participant.jump(((Wall) obstacle).getHeight());
                } else if (obstacle instanceof Threadmill) {
                    participant.run(((Threadmill) obstacle).getLength());
                    }
                }
            }
        }
    }
