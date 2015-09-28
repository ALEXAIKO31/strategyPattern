package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FloatBehavior;

/**
 * Created by ALEX on 20/09/2015.
 */
public class NotFloatable implements FloatBehavior{
    public String floating() {
        return "I can't float!";
    }
}