package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Floatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class SwimRing extends Lifesaver {
    public SwimRing() {
        type = "Swim ring";
        deflateBehavior = new NotDeflatable();
        floatBehavior = new Floatable();
    }
}