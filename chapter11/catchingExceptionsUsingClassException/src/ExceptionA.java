public class ExceptionA extends Exception {

    public ExceptionA(){}

    public ExceptionA(String message){
        super(message);
    }

    public ExceptionA(Throwable thrown){
        super(thrown);
    }

    public ExceptionA(String message, Throwable thrown){
        super(message, thrown);
    }

    public void throwingException() throws Exception{
        try{
            ExceptionB exceptionB = new ExceptionB();
            exceptionB.throwingForExceptionB();
        }
        catch(Exception exception) {
            System.out.println(exception.getMessage());

            throw new Exception("Exception thrown at Exception AAA");
        }
    }
}
