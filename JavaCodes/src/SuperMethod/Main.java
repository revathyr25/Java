package SuperMethod;

public class Main {
    public static void main(String[] args){
        Dog dog=new Dog(3,"harry","Dash");
        System.out.println("Age:"+dog.age+" Name:"+dog.name+" Type:"+dog.type);
        dog.Sound();
    }
}
