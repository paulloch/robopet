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

    public void infoPet() {
        System.out.println(name + " " + description);}

    /* need  method to send info about pet to the screen
    
       if (alive == false) {

        } else if (canine == true) {

        } else {

        }

    }
   */

    public void carePet() {    
/*  need method to give user options to care for the pet

    for each kind of pet.
    


 */

        if (alive == false) {

        } else if (canine == true) {

        } else {

        }

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

    ;

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
