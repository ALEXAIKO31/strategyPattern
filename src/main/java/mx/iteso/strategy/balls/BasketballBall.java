package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.FlexibleHit;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

/**
 * Created by ALEX on 20/09/2015.
 */
public class BasketballBall extends Ball{
    public BasketballBall(){
        super(new NormalBounce());
        deflateBehavior = new Deflatable();
        type = "Basketball ball";
        hitBehavior = new FlexibleHit();
    }
}
