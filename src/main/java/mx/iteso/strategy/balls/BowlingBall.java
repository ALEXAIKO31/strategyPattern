package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.SolidHit;

/**
 * Created by ALEX on 20/09/2015.
 */
public class BowlingBall extends Ball{
    public BowlingBall() {
        super( new Crash());
        deflateBehavior = new NotDeflatable();
        type = "Bowling ball";
        hitBehavior = new SolidHit();
    }
}
