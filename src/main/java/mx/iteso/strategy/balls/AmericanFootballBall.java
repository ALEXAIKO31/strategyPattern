package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.FlexibleHit;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        super( new IrregularBounce());
        deflateBehavior = new Deflatable();
        type = "American Football ball";
        hitBehavior = new FlexibleHit();
    }
}
