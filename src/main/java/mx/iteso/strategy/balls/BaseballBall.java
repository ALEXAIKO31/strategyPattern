package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.SolidHit;

public class BaseballBall extends Ball {
    public BaseballBall() {
        super( new NormalBounce());
        deflateBehavior = new NotDeflatable();
        type = "Baseball ball";
        hitBehavior = new SolidHit();
    }
}
