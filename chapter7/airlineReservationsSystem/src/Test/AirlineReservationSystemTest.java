package Test;

import com.fortunedavid.AirlineReservationSystem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationSystemTest {
    private AirlineReservationSystem mRSystem;
    private boolean[] array;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        mRSystem = new AirlineReservationSystem();
        array = mRSystem.getSeatCapacity();
    }

    @Test
    void objectTest(){
        assertNotNull(mRSystem);
    }

    @Test
    void seatCapacityTest(){
        int seatCapacity = 10;
        assertEquals(seatCapacity,array.length);
    }

    @Test
    void assignSeatFirstClassTest() {
        System.out.println("Please type 1 for First Class " +
                "and Please type 2 for Economy\n");
        int one = BigInteger.ONE.intValue();
        mRSystem.assignSeat(one);

        assertTrue(array[mRSystem.getOne()]);
        System.out.println(Arrays.toString(array));
    }

    @Test
    void assignSeatEconomyClassTest() {
        System.out.println("Please type 1 for First Class " +
                "and Please type 2 for Economy\n");
        int two = BigInteger.valueOf(2).intValue();

        mRSystem.assignSeat(two);

        assertTrue(array[mRSystem.getTwo()]);
        System.out.println(Arrays.toString(array));
    }

    @Test
    @DisplayName("For more booking options ")
    void moreBookingTest(){
        mRSystem.setMoreBooking();

    }
}