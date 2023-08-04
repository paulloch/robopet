public class Cat extends Pet {

    private int hunger;
    private int thirst;
    private int mange;
    private int boredom;
    private int dirtyHabitat;
    private int days;
    private boolean alive;

    public Cat(String name, String description, int hunger, int thirst,
            int mange, int boredom, int dirtyHabitat, boolean isCanine, boolean alive) {

    }

    public void cleanLitter() {

        

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
        boredom = boredom  +7;
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

}
