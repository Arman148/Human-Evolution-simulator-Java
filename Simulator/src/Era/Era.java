package Era;

import java.util.Objects;

public class Era implements Wiki, GettersSetters {
    private String name;

    private int year;
    private String Bonus;
    private int helathBonus;
    private int amountBonus;
    private int technologiesBonus;
    private int powerBonus;
    private String info;


    @Override
    public void show() {
        System.out.println("name of era: " + this.name);
        System.out.println("year of era: " + this.year);
        System.out.println("what we found in wiki: " + this.info);
    }

    @Override
    public void changeinfo(String text) {
        this.info = text;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String getBonus() {
        return Bonus;
    }

    @Override
    public void setBonus(String bonus) {
        Bonus = bonus;
    }

    @Override
    public int getHelathBonus() {
        return helathBonus;
    }

    @Override
    public void setHelathBonus(int helathBonus) {
        this.helathBonus = helathBonus;
    }

    @Override
    public int getAmountBonus() {
        return amountBonus;
    }

    @Override
    public void setAmountBonus(int amountBonus) {
        this.amountBonus = amountBonus;
    }

    @Override
    public int getTechnologiesBonus() {
        return technologiesBonus;
    }

    @Override
    public void setTechnologiesBonus(int technologiesBonus) {
        this.technologiesBonus = technologiesBonus;
    }

    @Override
    public int getPowerBonus() {
        return powerBonus;
    }

    @Override
    public void setPowerBonus(int powerBonus) {
        this.powerBonus = powerBonus;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Era era = (Era) o;
        return year == era.year && helathBonus == era.helathBonus && amountBonus == era.amountBonus && technologiesBonus == era.technologiesBonus && powerBonus == era.powerBonus && Objects.equals(name, era.name) && Objects.equals(Bonus, era.Bonus) && Objects.equals(info, era.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, Bonus, helathBonus, amountBonus, technologiesBonus, powerBonus, info);
    }

    @Override
    public String toString() {
        return "Era{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", Bonus='" + Bonus + '\'' +
                ", helathBonus=" + helathBonus +
                ", amountBonus=" + amountBonus +
                ", technologiesBonus=" + technologiesBonus +
                ", powerBonus=" + powerBonus +
                ", info='" + info + '\'' +
                '}';
    }
}
