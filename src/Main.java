import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random r=new Random();
        int secretNum=1+r.nextInt(10);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I have chosen a number between 1 and 10. Try to guess it");
        int guess = keyboard.nextInt();
        while (guess != secretNum) {
            if (guess != secretNum) {
                System.out.println("Your guess: " + guess + "\nThat is incorrect. guess again");
                guess = keyboard.nextInt();
            }
        }
        System.out.println("That's right! You're a good guesser.");
    }
}


