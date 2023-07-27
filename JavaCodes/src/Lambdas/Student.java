package Lambdas;

public class Student implements Printable{
    @Override
    public String print(String Branch) {
        System.out.println(Branch);
        return Branch;
    }
}
