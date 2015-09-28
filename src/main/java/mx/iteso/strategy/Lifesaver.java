package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FloatBehavior;

public abstract class Lifesaver {
    public String type;
    public DeflateBehavior deflateBehavior;
    public FloatBehavior floatBehavior;

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String performFloat(){
        return floatBehavior.floating();
    }

    public String display() {
        return "I'm a " + type;
    }
}
