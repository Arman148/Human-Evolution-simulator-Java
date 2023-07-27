package Actions;

public abstract class Action {                  // Action is abstract, because there's no place were its creates
    private int affectOnHealth;
    private int affectOnAmount;
    private int affectOnTechnologies;
    private int affectOnPower;

    public int t = 10;

    public int getAffectOnHealth() {
        return affectOnHealth;
    }

    public void setAffectOnHealth(int affectOnHealth) {
        this.affectOnHealth = affectOnHealth;
    }

    public int getAffectOnAmount() {
        return affectOnAmount;
    }

    public void setAffectOnAmount(int affectOnAmount) {
        this.affectOnAmount = affectOnAmount;
    }

    public int getTechnologies() {
        return affectOnTechnologies;
    }

    public void setTechnologies(int technologies) {
        affectOnTechnologies = technologies;
    }

    public int getAffectOnPower() {
        return affectOnPower;
    }

    public void setAffectOnPower(int affectOnPower) {
        this.affectOnPower = affectOnPower;
    }

    public void getInformation () {
        System.out.println("Affect on health: " + this.affectOnHealth);
        System.out.println("Affect on Amount: " + this.affectOnAmount);
        System.out.println("Affect on Technologies: " + this.affectOnTechnologies);
        System.out.println("Affect on Health: " + this.affectOnHealth);
    }

}

