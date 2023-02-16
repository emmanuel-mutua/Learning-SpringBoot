package com.emmutua.lesson1;

public class GameRunner {
    private gamingConsole game;

    //game runner class is tightly coupled because we can not
    // run a  new game auto, we should run a game by game

    //laptop - loosely coupled
    //desktop - tightly coupled
    public GameRunner(gamingConsole game) {
        this.game =game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
