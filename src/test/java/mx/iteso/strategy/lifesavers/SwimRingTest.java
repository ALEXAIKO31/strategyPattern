package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 20/09/2015.
 */
public class SwimRingTest {
    @Test
    public void testSwimRing(){
        SwimRing swimRing = new SwimRing();
        assertEquals("I'm a Swim ring", swimRing.display());
        assertEquals("I can't deflate!", swimRing.performDeflate());
        assertEquals("I can't inflate!", swimRing.performInflate());
        assertEquals("I'm floating!", swimRing.performFloat());
    }
}
