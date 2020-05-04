import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionATest {
    ExceptionA exception;
    private Logger logger = Logger.getLogger(ExceptionATest.class.getName());
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void testPrintStackTrace(){
        exception = new ExceptionA();
        try{
            exception.catcherTool();
        }
        catch (Exception e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        }

    }
}