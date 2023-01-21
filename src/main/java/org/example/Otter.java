package org.example;

public class Otter extends Animal implements Runable,Swimable{

    public Otter(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Otter say: кхр-шш-ич-еч-шшш";
    }

    @Override
    public int speedOfRun() {
        return 28;
    }

    @Override
    public int speedOfSwim() {
        return 32;
    }
}
