package org.example;

public class Horse extends Animal implements Runable{
    public Horse(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Horse say: игого";
    }
    @Override
    public String toString() {
        return String.format("Horse: " + super.toString());
    }

    @Override
    public int speedOfRun() {
        return 45;
    }
}
