package org.example;

public abstract class Animal implements Speakable{
    private String name;
    private int box;
    public Animal(String name, int box){
        this.name=name;
        this.box=box;
    }

    @Override
    public String toString() {
        return String.format("name is: %s in box num: %d",this.name,this.box) ;
    }
    public abstract String say();

}
