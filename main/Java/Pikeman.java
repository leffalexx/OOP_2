package Sem2.main.Java;

import java.util.ArrayList;

public class Pikeman extends Melee {
    boolean delivery;
    public Pikeman(ArrayList<BaseHero> group) {
        super(4, 5, 10, 4, new int[]{1,3}, "", States.ALIVE);
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
