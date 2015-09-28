package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Floatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by ALEX on 20/09/2015.
 */
public class SwimBelt extends Lifesaver {
    public SwimBelt(){
        type = "Swim belt";
        deflateBehavior = new NotDeflatable();
        floatBehavior = new Floatable();
    }
}
