import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionATest {
    ExceptionA exceptionA;
    ExceptionB exceptionB;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        exceptionA = new ExceptionA();
        exceptionB = new ExceptionB();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void testThrownExceptionInTryBlock(){
        try{
            exceptionA.throwingException();
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            //exception.printStackTrace();
        }

    }
}