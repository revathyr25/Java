package Generics;

public class AnimalDisplay <T extends Animal>{
    T Animals;
    AnimalDisplay(T Animals){
        this.Animals=Animals;
    }
    public void Print(){
        Animals.eat();
        System.out.println("AnimalDisplay is printed :"+Animals);
    }
}
