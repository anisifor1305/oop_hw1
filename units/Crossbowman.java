package units;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Crossbowman extends Unit {
    int countArrow;
    public Crossbowman(String name) {
        super(name, 150, "crossbow", 20, 4, 15, 50, 40);
        countArrow = 10;
    }
    @Override
    public String toString(){
        return name;
    }

    public void step(ArrayList<Unit> enemy) {

    }





}
