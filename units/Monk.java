package units;

import java.util.ArrayList;

public class Monk extends Unit {
    int healing;
    public Monk(String name) {
        super(name, 150, "null", 0, 4, 10, 50, 40);
        healing = 0;
    }
    @Override
    public String toString(){
        return name;
    }


    public void step(ArrayList<Unit> enemy) {

    }
}
