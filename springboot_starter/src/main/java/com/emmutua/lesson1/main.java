package com.emmutua.lesson1;
//learning tight and loose coupling in java
//loose coupling is faster and can be implemented with creating an interface
public class main {
    public static void main(String[] args) {

       // MarioGame game = new MarioGame();
       // var game = new SuperContraGame();
        var game = new NaturalSuper();
        GameRunner GameRunner = new GameRunner(game);
        //Object creation + wiring of dependencies
        //wiring the objects / game has been wired to the gamerunner class, gamerunner needs a dependency
        GameRunner.run();
    }
}
