public class Dog extends Pet{
    

    private int hunger;
    private int thirst;
    private int mange;
    private int boredom;
    private int dirtyHabitat;
    private int days;
    private boolean alive;
    
 public Dog(String name, String description, int hunger, int thirst,
 int mange, int boredom, int dirtyHabitat, boolean isCanine, boolean alive){

    
}

public void cleanCage(){



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


}

