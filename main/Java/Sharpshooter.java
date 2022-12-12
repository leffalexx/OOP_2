package Sem2.main.Java;

import java.util.ArrayList;

public class Sharpshooter extends Ranged {
    int shots;
    public Sharpshooter(ArrayList<BaseHero> group) {
        super(12, 10, 15, 9, new int[]{8,10}, "", States.ALIVE);
        super. group = group;
        shots = 32;
    }

    @Override
    public void step (ArrayList<BaseHero> group) {

    }

    @Override
    public String getInfo() {
        return super.getInfo() +
        ", shots: " + shots;
    }    
}
