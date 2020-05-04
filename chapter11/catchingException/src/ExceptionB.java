public class ExceptionB extends ExceptionA {

    @Override
    public void catcherTool() throws Exception {
        try{
            ExceptionC ex = new ExceptionC();
            ex.catcherTool();
        }
        catch (Exception ex) {
            System.err.println(ex.getMessage());
            throw new Exception("Exception thrown at ExceptionB");
        }
    }
}
