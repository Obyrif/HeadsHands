package Main;
public class Beings {
    private int attack;
    private int defense;
    private int health;

    public Beings(int attack, int defense, int health) {
        setAttack(attack);
        setDefense(defense);
        setHealth(health);

    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if(attack < 1 || attack > 30) {
            throw new IllegalArgumentException("Атака должна быть от 1 до 30");
        }
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        if(defense < 1 || defense > 30) {
            throw new IllegalArgumentException("Защита должна быть от 1 до 30");
        }
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            throw new IllegalArgumentException("Здоровье не может быть отрицательным");
        }
        this.health = health;
    }

    public void takeDamage (int damage) {
        if(damage < 0) {
            throw new IllegalArgumentException("Урон не может быть отрицательным");
        }
        if(health > damage) {
            health -= damage;
        } else {
            health = 0;
        }
    }
}
