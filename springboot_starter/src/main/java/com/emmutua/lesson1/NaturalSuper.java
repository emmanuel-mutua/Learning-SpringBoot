package com.emmutua.lesson1;

public class NaturalSuper implements gamingConsole {
    @Override
    public void up() {
        System.out.println("up");
    }

    @Override
    public void down() {
        System.out.println("dawn");
    }

    @Override
    public void left() {
        System.out.println("left");
    }

    @Override
    public void right() {
        System.out.println("right");
    }
}
