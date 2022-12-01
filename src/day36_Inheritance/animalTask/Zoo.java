package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husk",'M',"Small",2,"White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.scratch();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',"Small",3,"Brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.meow();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',"Large",4,"Orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);


        Fish fish = new Fish();
        fish.setInfo("Whale","Fish",'F',"Large",6,"Blue");

        fish.eat();
        fish.sleep();
        fish.drink();
        fish.move();
        fish.swim();

        System.out.println(fish);


    }





}
