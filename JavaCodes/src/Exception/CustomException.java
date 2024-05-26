package Exception;

public class CustomException {
    public static void main(String[] args) throws AgeLessThanZeroException {
        checkAge(10);
    }
    private static void checkAge(int age) throws AgeLessThanZeroException {
        //passing custom message in custom exception
        if(age<0){
            throw new AgeLessThanZeroException("Age is less than Zero");
        }

        //passing existing exception as parameter. ie cause for custom exception is passed
        if(age==0){
            throw new AgeLessThanZeroException(new RuntimeException());
        }
        //we can pass both message and exception through constructor
        if(age>0){
            throw new AgeLessThanZeroException("Age is less than Zero",new RuntimeException());
        }

    }
}
