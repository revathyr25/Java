package Lambdas;

public class Lambda {
    public static void main(String[] args)  {

        Printable printable=(branch)->branch+" engineers";
        System.out.println(printable);
        printing((branch)->(branch+" engineers"));

    }
    static void printing(Printable p){p.print("IT");
    }
}
