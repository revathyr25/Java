package AnonymousInnerClass;

public class AnnonymousInnerClass {
    public static void main(String[] args) {

        Animal dog=new Animal();
        dog.makeNoise();

        Animal lion=new Animal(){
            @Override
            public void makeNoise(){
                System.out.println("graaaaaaahhhh");
            }
        };
        lion.makeNoise();

        Runnable anonymousRunnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("pikachu");
            }
        };
        anonymousRunnable.run();
    }
}