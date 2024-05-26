package Generics;

public class Dog extends Animal{
    String name;
    Dog(String name){
        this.name=name;
    }
    public void sound(){
        System.out.println("Bow Bow");
    }
}
