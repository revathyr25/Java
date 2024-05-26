package Exception;

public class AgeLessThanZeroException extends Exception{
    public AgeLessThanZeroException(String e){
        super(e);
    }
    public AgeLessThanZeroException(Throwable cause){
        super(cause);
    }

    public AgeLessThanZeroException(String e,Throwable cause){
        super(e,cause);
    }
}
