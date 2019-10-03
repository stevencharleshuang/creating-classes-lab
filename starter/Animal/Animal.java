package Animal;

public class Animal {
    private int numLegs;
    private int topSpeed;
    private boolean isEndangered;
    private String name;

    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name){
        //Set properties here
        this.numLegs = numLegs;
        this.topSpeed = topSpeed;
        this.isEndangered = isEndangered;
        this.name = name;
    }

    //Put getters and setters here
    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFact() {
        return "The " + name + " has a top speed of " + topSpeed + " mph.";
    }
}
