package Sem2.main.Java;

import java.util.ArrayList;

public class Monk extends Healer {
    public Monk(ArrayList<BaseHero> group) {
        super(12, 7, 30, 5, new int[]{-4,-4}, "", States.ALIVE);
        super.group = group;
    }
    
    @Override
    public void step(ArrayList<BaseHero> group) {
        
    }
}
