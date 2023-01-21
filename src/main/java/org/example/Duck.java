package org.example;

public class Duck extends Animal implements Runable,Flyable,Swimable{

    public Duck(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Duck say: кря-кря";
    }

    @Override
    public int speedOfFly() {
        return 35;
    }

    @Override
    public int speedOfRun() {
        return 5;
    }

    @Override
    public int speedOfSwim() {
        return 15;
    }
}
