package animal;

public class Dog {

    //declare fields
    private String breed;
    private int lifespan;
    private String behavior;
    private double price;

    //Declare Constructor

    public Dog(String breed, int lifespan, String behavior, double price )
    {
        this.breed = breed;
        this.lifespan= lifespan;
        this.behavior= behavior;
        this.price= price;


    }
    //Declare Methods -Getter and setters
    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
