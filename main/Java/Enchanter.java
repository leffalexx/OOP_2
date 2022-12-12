package Sem2.main.Java;

import java.util.ArrayList;

public class Enchanter extends Healer {
    public Enchanter(ArrayList<BaseHero> group) {
        super(17, 12, 30, 9, new int[]{-5,-5}, "", States.ALIVE);
        super.group = group;
    }

        @Override
        public void step(ArrayList<BaseHero> group) {
            
    }
}
