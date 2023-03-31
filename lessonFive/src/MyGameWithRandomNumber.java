import java.util.Random;
import java.util.Scanner;

public class MyGameWithRandomNumber {

        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Set your name: ");
            String name = myScanner.nextLine();
            System.out.println("Welcome " + name + " Let the game begin!");

            int myInt = 100;
            int randomNumber = random.nextInt(myInt + 1);
            int guess = -1;

            System.out.println("Try guess the number:");
            while (guess != randomNumber) {

                guess = myScanner.nextInt();

                if (guess < randomNumber) {
                    System.out.println("This number is too small. Please, try again");
                } else if (guess > randomNumber) {
                    System.out.println("This number is too big. Please, try again");
                } else {
                    System.out.println("Congratulations " + name);
                }
                if (guess == randomNumber) break;{

                }

            }
        }
    }
