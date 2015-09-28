package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 20/09/2015.
 */
public class BasketballBallTest {
    @Test
    public void testBasketballBall() {
        BasketballBall basketballBall = new BasketballBall();
        assertEquals("I'm bouncing normally!", basketballBall.performBounce());
        assertEquals("I'm deflating!", basketballBall.performDeflate());
        assertEquals("I'm inflating!", basketballBall.performInflate());
        assertEquals("Basketball ball is rolling!", basketballBall.roll());
        assertEquals("Flexible hit", basketballBall.performHit());
    }
}
