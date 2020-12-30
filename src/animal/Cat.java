package animal;

public class Cat extends Animal{

    private String sound;

    public Cat(String breed, String behavior, int lifespan, double price) {
        super(breed, behavior, lifespan, price);
    }

    public String getSound() {
        return "Meow!";
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
