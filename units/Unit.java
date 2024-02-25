package units;
import java.util.Comparator;
import java.util.List;

public abstract class Unit{
    String name;
    int health;
    String weapon;
    int powerHit;
    int speed;
    int bronya;
    int atackRange;
    int hidding;
    int maxHealth;

    String className;

    public Unit(String name, int health, String weapon, int powerHit, int speed, int bronya, int atackRange, int hidding){
        this.className = this.getClass().getSimpleName();
        this.name = name;
        this.maxHealth = this.health = health;
        this.weapon = weapon;
        this.powerHit = powerHit;
        this.speed = speed;
        this.bronya = bronya;
        this.atackRange = atackRange;
        this.hidding = hidding;


    }

    public void print() {
        System.out.println("units.Unit:" + className + ", Name: " + name + ", Health: " + health + ", Weapon: " + weapon + ", PowerHit: " + powerHit + ", Speed: " + speed + ", Bronya: " + bronya + ", AtackRange: " + atackRange + ", Hidding: " + hidding +  ".");
    }

    public void printShort() {
        System.out.println("units.Unit: " + className + ", Name: " + name + ".");
    }

    public void getHit(float damage) {
        health -= damage;
        if (health < 0) health = 0;
        if (health > maxHealth) health = maxHealth;

    }

    // Метод лечения
    public void Heal(Monk monk, Unit unit1) {
        unit1.health = unit1.health + monk.healing;

    }

    // Метод получения урона
    public void Damag(Unit unit1, Unit unit2) {
        unit1.health = unit1.health - unit2.powerHit;

    }

    // Метод колдовства
    public void Magical(Mag mag, Unit unit1) {
        unit1.health = unit1.health - mag.mana;

    }


    public int getSpeed() {
        return speed;
    }
}


