package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 20/09/2015.
 */
public class PingPongBallTest {
    @Test
    public void testPingPongBall() {
        PingPongBall pingPongBall = new PingPongBall();
        assertEquals("I'm bouncing normally!", pingPongBall.performBounce());
        assertEquals("I can't deflate!", pingPongBall.performDeflate());
        assertEquals("I can't inflate!", pingPongBall.performInflate());
        assertEquals("Ping Pong ball is rolling!", pingPongBall.roll());
        assertEquals("Solid hit", pingPongBall.performHit());
    }
}
