package robopet;

public abstract class Pet {

    private String name;
    private String description;
    private int hunger;
    private int thirst;
    private int mange;
    private int boredom;
    private int dirtyHabitat;
    private int days;
    private boolean canine;
    private boolean alive;

    // common shared method infoPet and tick for organic pets

    public void infoPet() {
        if (getDays() == 0) {
            System.out.println();
            System.out.println("Your Organic Pet is Dead");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Hunger  = " + getHunger() + "\t    Thirst          = " + getThirst());
            System.out.println("Boredom = " + getBoredom() + "\t    Mange           = " + getMange());
            System.out.println("Feces   = " + getDirtyHabitat() + "\t    Days in Shelter = " + getDays());
            System.out.println();
        }
    }

    public void tick() {
        if (getDays() != 0) {
            setDays(getDays() + 1);
        }
        setHunger(getHunger() + 3);
        setThirst(getThirst() + 3);
        setBoredom(getBoredom() + 3);
        setMange(getMange() + 3);
        setDirtyHabitat(getDirtyHabitat() + 3);
        if (getHunger() < 0) {
            setHunger(0);
        }
        if (getThirst() < 0) {
            setThirst(0);
        }
        if (getBoredom() < 0) {
            setBoredom(0);
        }
        if (getMange() < 0) {
            setMange(0);
        }
        if (getDirtyHabitat() < 0) {
            setDirtyHabitat(0);
        }
        if (getHunger() > 60 || getThirst() > 60 || getBoredom() > 60 || getMange() > 60 || getDirtyHabitat() > 60) {

            setDays(0);
        }
    }

    public void feed() {
    }

    public void water() {
    }

    public void clean() {
    }

    public void play() {
    }

    public void cleanCage() {
    }

    public void cleanLitter() {
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
}
