package animal;

public class Dog extends Animal {
    private String sound;

    public Dog(String breed, String behavior, int lifespan, double price) {
        super(breed, behavior, lifespan, price);
        // If you want to call methods in the superclass and give it a value: super.setBreed("Golden Retriever");
    }

    public String getSound() {
        return "Woof Woof!";
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


}
