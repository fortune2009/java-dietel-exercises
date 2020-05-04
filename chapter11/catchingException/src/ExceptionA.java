public class ExceptionA {

    public void catcherTool() throws Exception {
        try{
            ExceptionB exB = new ExceptionB();
            exB.catcherTool();
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
