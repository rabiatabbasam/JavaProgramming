package day37_Inheritance.animalTask;

public class Cat extends Animal{// alt enter enter



    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void scratch(){
        System.out.println(name+" is scratching");
    }




}
