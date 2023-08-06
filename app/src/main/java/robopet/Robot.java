package robopet;

public class Robot extends Pet {
    
    private String name;
    private String description;
    private int hunger;
    private int thirst;
    private int days;
    private boolean canine;
    private boolean alive;
    
    public Robot (String name, String description, int health, int thirst, int days,boolean canine, boolean alive){

// finish constructor

        
    }

    
    public void chargeRobot(){

// need method

    }

    public void oilRobot(){

// need method

    }

    public void tick(){

// need method


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
