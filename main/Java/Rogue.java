package Sem2.main.Java;

import java.util.ArrayList;

public class Rogue extends Melee {
    boolean delivery;
    public Rogue(ArrayList<BaseHero> group) {
        super(8, 3, 10, 6, new int[]{2,4}, "", States.ALIVE);
        super.group = group;
        delivery = false;
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
