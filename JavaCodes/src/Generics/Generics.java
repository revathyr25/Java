package Generics;

public class Generics {

    public static void main(String[] args){
        Display<Integer> displayNumber=new Display<>(1);
        displayNumber.displayThing();
        Display<String> displayString=new Display<>("Potter");
        displayString.displayThing();

        Dog dog=new Dog("Tommy");
        dog.sound();
        AnimalDisplay<Dog> dog1=new AnimalDisplay<Dog>(dog);
        dog1.Print();

        genericMethod(1);
        genericMethod("Car");

    }

    public static <T> void genericMethod(T thing){
        System.out.println("printing :"+thing);
     }
}
