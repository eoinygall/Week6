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
    void testGetTitle(){
        assertEquals("Mr",myPass.GetTitle("Mr"));
        assertEquals("Mrs",myPass.GetTitle("Mrs"));
        assertEquals("Ms",myPass.GetTitle("Ms"));
    }

    @Test
    void testGetName(){
        assertEquals("Eoin",myPass.GetName("Eoin"));
    }

    @AfterEach
    void tearDown() {
    }
}