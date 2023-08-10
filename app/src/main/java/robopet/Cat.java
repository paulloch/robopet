package robopet;

public class Cat extends Pet {

    private int hunger;
    private int thirst;
    private int mange;
    private int boredom;
    private int dirtyHabitat;
    private int days;
    private boolean alive;
    private boolean canine;

    public Cat(String name, String description, int hunger, int thirst,
            int mange, int boredom, int dirtyHabitat, int days, boolean canine, boolean alive) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.mange = mange;
        this.boredom = boredom;
        this.dirtyHabitat = dirtyHabitat;
        this.alive = alive;
        this.canine = canine;

    }

    public void cleanLitter() {
        /*
         * need method to clean Litter
         * 
         * dirtyHabitat goes down
         * all other variables go up
         * 
         * also need to change the methods to include
         * the dirty Habitat variable
         * 
         */

    }

    public void tick() {
        hunger = hunger + 7;
        thirst = thirst + 7;
        boredom = boredom + 7;
        mange = mange + 7;
        if (hunger < 0) {
            hunger = 0;
        }
        if (thirst < 0) {
            hunger = 0;
        }
        if (boredom < 0) {
            hunger = 0;
        }
        if (mange < 0) {
            hunger = 0;
        }
        days = days + 1;
    }

    public void feed() {
        hunger = hunger - 12;
        thirst = thirst + 7;
        boredom = boredom + 7;
        mange = mange + 7;

    }

    public void water() {
        thirst = thirst - 12;
        hunger = hunger + 7;
        boredom = boredom + 7;
        mange = mange + 7;
    }

    public void play() {
        boredom = boredom - 12;
        hunger = hunger + 7;
        thirst = thirst + 7;
        mange = mange + 7;
    }

    public void clean() {
        mange = mange - 12;
        hunger = hunger + 7;
        thirst = thirst + 7;
        boredom = boredom + 7;

    }

    public boolean status() {

        System.out.println("your dogs hunger = " + hunger);
        System.out.println("Your dogs thirst = " + thirst);
        System.out.println("your dogs boredom = " + boredom);
        System.out.println("your dogs mange = " + mange);
        if (hunger > 50 || thirst > 50 || boredom > 50 || mange > 50) {
            alive = false;
        } else {
            alive = true;
        }

        return alive;
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

    public int getMange() {
        return mange;
    }

    public void setMange(int mange) {
        this.mange = mange;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getDirtyHabitat() {
        return dirtyHabitat;
    }

    public void setDirtyHabitat(int dirtyHabitat) {
        this.dirtyHabitat = dirtyHabitat;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isCanine() {
        return canine;
    }

    public void setCanine(boolean canine) {
        this.canine = canine;
    }

}
