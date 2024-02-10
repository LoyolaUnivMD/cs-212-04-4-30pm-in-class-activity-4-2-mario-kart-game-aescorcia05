//Create a Java class called MarioKartGame with the following:

import java.util.Scanner;

public class MarioKartGame {

//In the main method:
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String temporaryName;
        String temporaryCharacter;
        int temporarySpeed;

        System.out.println("Player 1");

        System.out.println("Name: ");
        temporaryName = input.next();
        System.out.println("Character: ");
        temporaryCharacter = input.next();
        System.out.println("Speed: ");
        temporarySpeed = input.nextInt();

        MarioKartPlayer player1 = new MarioKartPlayer(temporaryName, temporaryCharacter, temporarySpeed);

        System.out.println("Player 2");

        System.out.println("Name: ");
        temporaryName = input.next();
        System.out.println("Character: ");
        temporaryCharacter = input.next();
        System.out.println("Speed: ");
        temporarySpeed = input.nextInt();

        MarioKartPlayer player2 = new MarioKartPlayer(temporaryName, temporaryCharacter, temporarySpeed);

        player1.displayInfo();
        player2.displayInfo();

        player1.boost();
        player2.boost();

        player1.displayInfo();
        player2.displayInfo();

    }


}