package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.HitBehavior;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.SolidHit;

/**
 * Created by ALEX on 20/09/2015.
 */
public class PingPongBall extends Ball{
    public PingPongBall(){
        super( new NormalBounce());
        deflateBehavior = new NotDeflatable();
        hitBehavior = new SolidHit();
        type = "Ping Pong ball";
    }
}
