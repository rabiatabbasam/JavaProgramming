package day37_Inheritance.animalTask;

public class Dog extends Animal{
  //  public int a;

    //           "Max"
    public Dog(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size, color);
    //    this.a= a;//do it manually with this.key
    }

    public void bark(){
        System.out.println(name+" is barking");
    }





}
