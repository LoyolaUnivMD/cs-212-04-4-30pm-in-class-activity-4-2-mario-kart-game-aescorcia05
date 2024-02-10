//Define a Java class called MarioKartPlayer with the following attributes:

public class MarioKartPlayer {
    // Attributes
    String playerName;
    String character;
    int speed;

    // Constructor
    public MarioKartPlayer(String name, String character, int startingSpeed) {
        this.playerName = name;
        this.character = character;
        this.speed = startingSpeed;
    }

    // Methods
    public void boost() {
        speed += 10;
    }

    public void displayInfo() {
        System.out.println("Player name: " + playerName);
        System.out.println("Character: " + character);
        System.out.println("Speed: " + speed);
    }

}