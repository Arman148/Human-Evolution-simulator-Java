package Human;
import java.util.*;
public class Human {

    private String name;
    private int health;
    private int amount;
    private int technologies;
    private int power;
    private String era;
    private int level;
    private List<String> bonus = new ArrayList<>();



    public Human(String name, int health, int amount, int technologies, int power, String era, int level) {
        this.name = name;
        this.health = health;
        this.amount = amount;
        this.technologies = technologies;
        this.power = power;
        this.era = era;
        this.level = level;
    }

    public Human() {
        this.name = "test_humanoid";
        this.health = 5;
        this.amount = 10;
        this.technologies = 1;
        this.power = 1;
        this.era = "Paleolit";
        this.level = 1;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTechnologies() {
        return technologies;
    }

    public void setTechnologies(int technologies) {
        this.technologies = technologies;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<String> getBonus() {
        return bonus;
    }

    public void setBonus(List<String> bonus) {
        this.bonus = bonus;
    }


    public void addToBonus (String newBonus) {
        this.bonus.add(newBonus);
    }

    public String ToString () {
        return getName() + ": " + getAmount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return health == human.health && amount == human.amount && technologies == human.technologies && power == human.power && level == human.level && Objects.equals(name, human.name) && Objects.equals(era, human.era) && Objects.equals(bonus, human.bonus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, amount, technologies, power, era, level, bonus);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", amount=" + amount +
                ", technologies=" + technologies +
                ", power=" + power +
                ", era='" + era + '\'' +
                ", level=" + level +
                ", bonus=" + bonus +
                '}';
    }
}
