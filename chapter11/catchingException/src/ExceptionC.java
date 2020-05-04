public class ExceptionC extends ExceptionB {

    @Override
    public void catcherTool() throws Exception {
        throw new Exception("Exception thrown at ExceptionC");
    }
}
