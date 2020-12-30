package animal;

public class Animal {


    //Declare fields
    private String breed, behavior;
    private int lifespan;
    private double price;

    public Animal(String breed, String behavior, int lifespan, double price) {
        this.breed = breed;
        this.behavior = behavior;
        this.lifespan = lifespan;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
