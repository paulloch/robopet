package robopet;

public class Robot extends Pet {

    private String name;
    private String description;
    private int hunger;
    private int thirst;
    private int days;
    private boolean canine;
    private boolean alive;

    public Robot(String name, String description, int hunger, int thirst, int days, boolean canine, boolean alive) {
        this.name = name;
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.days = days;
        this.canine = canine;
        this.alive = alive;
    }

    public void infoPet() {
        if (days == 0) {
            System.out.println();
            System.out.println("Your Robotic Pet is non-functional. ");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Charge = " + getHunger() + " %" + "   Oil Level = " + getThirst() + " %"
                    + "   Days in Shelter = " + getDays());
            System.out.println();
        }
    }

    public void feed() {

        hunger = 100;

    }

    public void water() {

        thirst = 100;

    }

    public void tick() {

        if (days != 0) {
            days = days + 1;
        }
        if (days % 2 == 0) {
            hunger = hunger - 49;
        }
        if (days % 7 == 0) {
            thirst = thirst - 95;
        }
        if (hunger < 0 || thirst < 0) {
            days = 0;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean isCanine() {
        return canine;
    }

    public void setCanine(boolean canine) {
        this.canine = canine;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}
