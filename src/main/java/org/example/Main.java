//На основе работы на уроке сделать:
//
//        Создать интерфейс, скорость плаванья
//        Добавить новое животное, способное плавать
//        Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

package org.example;

public class Main {
    public static void main(String[] args) {

        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Васька", 17, "белый"))
                .addAnimal(new Horse("Пухляк", 22))
                .addAnimal(new Duck("Пеликан", 3))
                .addAnimal(new Otter("Призрак",4));
        for (Animal an : zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.say());
        }
        System.out.println("Кто что говорит:");
        for (Speakable speak : zoo1.getSpeakable()) {
            System.out.println(speak.say());
        }
        System.out.println("Скорости бега животных:");
        for (Runable runner : zoo1.getRunner()) {
            System.out.println(runner.speedOfRun());
        }
        //int maxspeed= zoo1.getChampionesOfRuner();
        System.out.println(String.format("Максимальная скорость бега: %d", zoo1.getChampionesOfRuner()));
        System.out.println("Скорости летающих животных:");
        for (Flyable fly : zoo1.getFlyable()) {
            System.out.println(fly.speedOfFly());
        }
        System.out.println("Скорости плавающих животных:");
        for (Swimable swim : zoo1.getSwimable()) {
            System.out.println(swim.speedOfSwim());
        }
    }
}