package test.com.fortunedavid; 

import com.fortunedavid.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/** 
* Turtle Tester. 
* 
* @author <Fortune David> 
* @since <pre>May 12, 2020</pre> 
* @version 1.0 
*/ 
public class TurtleTest {
    private Logger logger = Logger.getLogger(TurtleTest.class.getName());
    private Turtle turtle;
    private SketchPad sketchPad;

    @Before
public void before() throws Exception {
    turtle = new Turtle();
    Pen biro = new Pen();
    turtle.setTurtlePen(biro);
    sketchPad = new SketchPad();
} 

@After
public void after() throws Exception { 
} 

    @Test
    public void isTurtleActiveTest(){
    assertNotNull(turtle);
    assertNotNull(turtle.getTurtlePen());
    assertEquals(PenPosition.UP, turtle.getTurtlePen().getPosition());
    assertEquals(Compass.EAST, turtle.getDirection());
    }

    @Test
    public void penPositionChangeTest(){
        assertEquals(PenPosition.UP,turtle.getTurtlePen().getPosition());
        turtle.getTurtlePen().setPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, turtle.getTurtlePen().getPosition());
    }

    @Test
    public void turtleMoveForwardTest(){
        assertEquals(0,turtle.getxMove());
        turtle.moveForward(13, sketchPad.getFloor());
        assertEquals(12, turtle.getxMove());
        logger.info(String.valueOf(turtle.getxMove()));
    }

    @Test
    public void turtleTurnRightFromEast(){
        assertEquals(Compass.EAST, turtle.getDirection());
        logger.info(String.valueOf(turtle.getDirection()));
        turtle.turnRight();
        assertEquals(Compass.SOUTH, turtle.getDirection());
        logger.info(String.valueOf(turtle.getDirection()));
    }
} 
