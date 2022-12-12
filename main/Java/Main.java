package Sem2.main.Java;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> Red = new ArrayList<>();
        Red.add(new Peasant(Red));
        Red.add(new Peasant(Red));
        Red.add(new Monk(Red));
        Red.add(new Archer(Red));
        Red.add(new Archer(Red));
        Red.add(new Archer(Red));
        Red.add(new Pikeman(Red));
        Red.add(new Pikeman(Red));
        Red.add(new Pikeman(Red));
        Red.add(new Pikeman(Red));

        ArrayList<BaseHero> Blue = new ArrayList<>();
        Blue.add((new Peasant(Blue)));
        Blue.add((new Peasant(Blue)));
        Blue.add(new Enchanter(Blue));
        Blue.add(new Sharpshooter(Blue));
        Blue.add(new Sharpshooter(Blue));
        Blue.add(new Sharpshooter(Blue));
        Blue.add(new Rogue(Blue));
        Blue.add(new Rogue(Blue));
        Blue.add(new Rogue(Blue));
        Blue.add(new Rogue(Blue));


    }
    
}
