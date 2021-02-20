package edu.grcy.patterns.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        GameState state = new GameState(1, "Bialy Sad");


        GameStateMemento memento1 = state.saveGame();
        state.changeGameState(2, "Velen");

        GameStateMemento memento2 = state.saveGame();
        state.changeGameState(3, "Novigrad");
        System.out.println(state.toString());
        System.out.println("-----------------------");
        state.restore(memento1);
        System.out.println(state.toString());
        System.out.println("----------------------");
        state.restore(memento2);
        System.out.println(state.toString());
    }
}
