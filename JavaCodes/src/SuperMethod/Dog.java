package SuperMethod;

public class Dog extends Animal {
    String type;
    public Dog(int age,String name,String type){
        super(age,name); //can call super from sub constructor to super constructor,
        // also it should be the first line inside the constructor
        this.type=type;
    }
    public void Sound(){
        super.Sound();
        System.out.println("My sound is bow bow");
    }

}
