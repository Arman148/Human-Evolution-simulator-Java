package Actions;

import java.util.Objects;

public class AnimalAction extends Action {

    private String name;

    private int power;

    AnimalAction(String name, int power) {
        this.name = name;
        this.power = power;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


    @Override
    public void getInformation() {
        System.out.println("name: "+ this.name + " power: " + this.power);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalAction that = (AnimalAction) o;
        return power == that.power && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power);
    }

    @Override
    public String toString() {
        return "AnimalAction{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", t=" + t +
                '}';
    }

    static class Sheep {
        private static Sheep lonelySheep;

        private Sheep() {

        }

        public static Sheep getInstance() {
            if(lonelySheep == null) {
                lonelySheep = new Sheep();
            }

            return lonelySheep;
        }

    }
}
