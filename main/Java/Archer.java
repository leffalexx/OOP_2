package Sem2.main.Java;

import java.util.ArrayList;

public class Archer extends Ranged {
    int shots;
    public Archer(ArrayList<BaseHero> group) {
        super(6, 3, 10, 4, new int[]{2,3}, "", States.ALIVE);
        super.group = group;
        shots = 16;
    }

    @Override
    public void step (ArrayList<BaseHero> group) {

    }

    @Override
    public String getInfo() {
        return super.getInfo() +
        ", shots=" + shots;
    }
}
