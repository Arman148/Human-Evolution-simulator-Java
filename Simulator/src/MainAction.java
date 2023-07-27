import Human.Human;
import Actions.LocalAction;
import Actions.GlobalAction;
import Actions.AnimalAction;

import java.util.Objects;


public final class MainAction {

    private Human humanoid;

    private LocalAction local;


    private GlobalAction global;
    private AnimalAction animal;

    static class Time {
        int year;
        int step;

        Time (int year, int step) {
            this.year = year;
            this.step = step;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getStep() {
            return step;
        }

        public void setStep(int step) {
            this.step = step;
        }
    }

    Time time = new Time (-20000, 500);


    public Human getHumanoid() {
        return humanoid;
    }

    public void setHumanoid(Human humanoid) {
        this.humanoid = humanoid;
    }


    public LocalAction getLocal() {
        return this.local;
    }

    public void setLocal(LocalAction local) {
        this.local = local;
    }

    public GlobalAction getGlobal() {
        return this.global;
    }

    public void setGlobal(GlobalAction global) {
        this.global = global;
    }

    public AnimalAction getAnimal() {
        return this.animal;
    }

    public void setAnimal(AnimalAction animal) {
        this.animal = animal;
    }

    public void affectOnHuman () {
        

        System.out.println("test");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainAction that = (MainAction) o;
        return Objects.equals(humanoid, that.humanoid) && Objects.equals(local, that.local) && Objects.equals(global, that.global) && Objects.equals(animal, that.animal) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(humanoid, local, global, animal, time);
    }

    @Override
    public String toString() {
        return "MainAction{" +
                "humanoid=" + humanoid +
                ", local=" + local +
                ", global=" + global +
                ", animal=" + animal +
                ", time=" + time +
                '}';
    }






}