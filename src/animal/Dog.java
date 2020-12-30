package animal;

public class Dog extends Animal {
    private String sound;

    public Dog(String breed, String behavior, int lifespan, double price) {
        super(breed, behavior, lifespan, price);
    }

    public String getSound() {
        return "Woof Woof!";
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
