package Actions;

import java.util.Objects;

public class LocalAction extends Action{


    private String name;

    private int power;

    LocalAction(String name, int power) {
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



    public void getInformation() {
        System.out.println("name: "+ this.name + " power: " + this.power);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalAction that = (LocalAction) o;
        return power == that.power && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power);
    }

    @Override
    public String toString() {
        return "LocalAction{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
