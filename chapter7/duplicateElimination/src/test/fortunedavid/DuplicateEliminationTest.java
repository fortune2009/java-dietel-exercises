package test.fortunedavid;

import com.fortunedavid.DuplicateElimination;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DuplicateEliminationTest {
    DuplicateElimination dupVar;
    private Logger logger;
    private Scanner scanner;
    @BeforeEach
    void setUp() throws Exception {
        dupVar = new DuplicateElimination();
        logger = Logger.getLogger(DuplicateEliminationTest.class.toString());
        scanner = new Scanner(System.in);
    }

    @Test
    void testObjectReference() {
        assertNotNull(dupVar);
        assertNotNull(dupVar.getFiveNumbers());
    }

    @Test
    void testingFiveNumbers(){
        System.out.println("Enter 5 numbers: ");
        dupVar.setFiveNumbers();
        assertEquals(5, dupVar.getFiveNumbers().size());
        logger.info(dupVar.getFiveNumbers().toString());
    }

    @Test
    void testingWithin10And100() {
        System.out.println("Enter 5 numbers within 10 and 100: ");
        dupVar.setFiveNumbers();
        assertEquals(10, dupVar.getFiveNumbers().get(0));
        logger.info(dupVar.getFiveNumbers().toString());
    }

}