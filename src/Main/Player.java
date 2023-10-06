package Main;
public class Player extends Beings {
    private int maxHealth;
    private int healingCount;

    public Player(int attack, int defense, int health, int maxHealth) {
        super(attack, defense, health);
        setMaxHealth(maxHealth);
        healingCount = 0;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        if(maxHealth < 0) {
            throw new IllegalArgumentException("Максимальное Здоровье не может быть отрицательным");
        }
        this.maxHealth = maxHealth;
    }

    public int getHealingCount() {
        return healingCount;
    }

    public void setHealingCount(int healingCount) {
        this.healingCount = healingCount;
    }
    public  void heal() {
        if(healingCount < 4) {
            int maxHealing = (int) (maxHealth * 0.3);
            int currentHealth = getHealth();
            if(currentHealth + maxHealing <= maxHealing) {
                setHealth(currentHealth + maxHealing);
            } else {
                setHealth(maxHealing);
            }
            healingCount++;
        }
    }
}
