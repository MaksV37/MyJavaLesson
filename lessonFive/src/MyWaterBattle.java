import java.util.Random;
import java.util.Scanner;

public class MyWaterBattle {
    public static void main(String[] args) {
        int[][] ints = new int[5][5];
        Random rand = new Random();
        int Row = rand.nextInt(5);
        int Colon = rand.nextInt(5);
        ints[Row][Colon] = 1;

        System.out.println("All set. Get ready to rumble!");

        Scanner scanner = new Scanner(System.in);
        while (true) {

            int row = 0;
            while (true) {
                System.out.print("Enter a row (1-5): ");
                String input = scanner.nextLine();
                try {
                    row = Integer.parseInt(input) - 1;
                    if (row < 0 || row > 4) {
                        throw new NumberFormatException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                }
            }
            int col = 0;
            while (true) {
                System.out.print("Enter a column (1-5): ");
                String input = scanner.nextLine();
                try {
                    col = Integer.parseInt(input) - 1;
                    if (col < 0 || col > 4) {
                        throw new NumberFormatException();
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                }
            }
            if (ints[row][col] == 1) {
                System.out.println("You have won!");
                ints[row][col] = 2;
                break;
            } else {
                System.out.println("Missed!");
                ints[row][col] = -1;
            }
            displayField(ints);
        }
        displayField(ints);
    }
    public static void displayField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    System.out.print("* ");
                } else if (field[i][j] == 1) {
                    System.out.print("- ");
                } else if (field[i][j] == 2) {
                    System.out.print("x ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
