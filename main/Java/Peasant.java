package Sem2.main.Java;

import java.util.ArrayList;

public class Peasant extends Melee {
    boolean delivery;
    public Peasant (ArrayList<BaseHero> group) {
        super(1, 1, 1, 3, new int[]{1,1}, "", States.ALIVE);
        super.group = group;
        delivery = true;
    }

    @Override
    public void step(ArrayList<BaseHero> group) {

    }

    @Override
    public String getInfo() {
        return super.getInfo() +
        ", delivery: " + delivery;
    }    
}
