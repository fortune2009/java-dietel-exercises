import java.io.IOException;

public class ExceptionB extends ExceptionA{


    @Override
    public void throwingException() throws Exception {
        try {
            super.throwingException();
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            throwingForExceptionB();
        }

    }

    public void throwingForExceptionB() throws Exception {
        try{
            throwingNullPointer();
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            throw new Exception("Exception thrown at BBB");
        }
    }
    public void throwingNullPointer() throws NullPointerException{
        try{
            throwingIOException();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new NullPointerException(
                    "Null Pointer Exception thrown at Exception B");
        }
    }

    public void throwingIOException() throws IOException {
        throw new IOException(
                "IOException thrown at Exception B");
    }
}
