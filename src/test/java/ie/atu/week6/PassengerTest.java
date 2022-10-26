package ie.atu.week6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger myPass;

    @BeforeEach
    void setUp() {
        myPass = new Passenger();
    }

    @Test
    void TestgetTitle(){
        assertEquals("Mr",myPass.getTitle("Mr"));
        assertEquals("Mrs",myPass.getTitle("Mrs"));
        assertEquals("Ms",myPass.getTitle("Ms"));
    }

    @AfterEach
    void tearDown() {
    }
}