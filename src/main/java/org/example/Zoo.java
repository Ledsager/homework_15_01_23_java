package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> animals;
    private Radio radio = new Radio();

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public Zoo addAnimal(Animal a) {
        animals.add(a);
        return this;
    }
    public List<Speakable> getSpeakable(){
        List<Speakable> answer=new ArrayList<Speakable>();
        for (Animal an: animals) {
            answer.add(an);
        }
        answer.add(radio);
        return answer;
    }
    public ArrayList<Animal> getAnimals() {
        return animals;
    }
    public List<Runable> getRunner(){
        List<Runable> runner=new ArrayList<Runable>();
        for (Animal an:animals) {
            if( an instanceof Runable){
                runner.add((Runable)an);
            }
        }
        return runner;
    }
    public int getChampionesOfRuner(){
        int max1=0;
        for (Runable runner:getRunner()) {
            if(max1<runner.speedOfRun()){
                max1=runner.speedOfRun();
            }
        }
        return max1;
    }
    public List<Flyable> getFlyable(){
        List<Flyable> fly=new ArrayList<Flyable>();
        for (Animal an:animals) {
            if( an instanceof Flyable){
                fly.add((Flyable) an);
            }
        }
        return fly;
    }

    public List<Swimable> getSwimable() {
        List<Swimable> fly=new ArrayList<Swimable>();
        for (Animal an:animals) {
            if( an instanceof Swimable){
                fly.add((Swimable) an);
            }
        }
        return fly;
    }
}
