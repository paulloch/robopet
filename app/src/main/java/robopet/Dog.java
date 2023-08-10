package robopet;

public class Dog extends Pet{
    

    private int hunger;
    private int thirst;
    private int mange;
    private int boredom;
    private int dirtyHabitat;
    private int days;
    private boolean alive;
    private boolean canine;
    


public Dog(String petName, String description, int hunger, int thirst,
 int mange, int boredom, int dirtyHabitat, int days, boolean canine, boolean alive){
    this.hunger = hunger;
    this.thirst = thirst;
    this.mange = mange;
    this.boredom = boredom;
    this.dirtyHabitat = dirtyHabitat;
    this.alive = alive;
    this.canine = canine;
    
}


public void cleanCage(){
    /*  need method to cleanCage

    dirtyHabitat goes down
    all other variables go up

    also need to change the methods to include 
    the dirtyHabitat variable

*/
}

public void tick() {
    hunger = hunger + 5;
    thirst = thirst + 5;
    boredom = boredom + 5;
    mange = mange  + 5;
    if (hunger<0){hunger=0;}
    if (thirst<0){hunger=0;}
    if (boredom<0){hunger=0;}
    if (mange<0){hunger=0;}
    days = days + 1;
}

public void feed() {
    hunger = hunger - 10;
    thirst = thirst + 5;
    boredom = boredom + 5;
    mange = mange + 5;

}
 
public void water() {
    thirst = thirst - 10;
    hunger = hunger + 5;
    boredom = boredom + 5;
    mange = mange + 5;
}

public void play() {
    boredom = boredom - 10;
    hunger = hunger + 5;
    thirst = thirst + 5;
    mange = mange + 5;
}

public void clean() {
    mange = mange - 10;
    hunger = hunger + 5;
    thirst = thirst + 5;
    boredom = boredom + 5;

}

public boolean status() {

    System.out.println("your dogs hunger = " + hunger);
    System.out.println("Your dogs thirst = " + thirst);
    System.out.println("your dogs boredom = " + boredom);
    System.out.println("your dogs parasites = " + mange);
    if (hunger > 60 || thirst > 60 || boredom > 60 || mange> 60) {
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

