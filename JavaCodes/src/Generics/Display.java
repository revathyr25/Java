package Generics;

public class Display<T> {
    T thing;
    Display(T thing){
        this.thing=thing;
    }
    public void displayThing(){
        System.out.println(thing);
    }
}
