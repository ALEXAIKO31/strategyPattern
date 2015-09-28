package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 20/09/2015.
 */
public class BeachBallTest {
    @Test
    public void testBeachBall() {
        BeachBall beachBall = new BeachBall();
        assertEquals("I'm bouncing normally!", beachBall.performBounce());
        assertEquals("I'm deflating!", beachBall.performDeflate());
        assertEquals("I'm inflating!", beachBall.performInflate());
        assertEquals("Beach ball is rolling!", beachBall.roll());
        assertEquals("Flexible hit", beachBall.performHit());
    }
}