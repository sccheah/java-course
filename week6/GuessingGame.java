import java.util.Scanner;

// uses binary search to guess user's number between 1-100

public class GuessingGame {
    private Scanner reader;

    public GuessingGame() {
        reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        int numOfInstructions = instructions(upperLimit, lowerLimit);
        int avg = -1;

        for (int i = 0; i < numOfInstructions; i++) {
            avg = average(lowerLimit, upperLimit);

            if (isGreaterThan(avg)) {
                if (avg + 1 == upperLimit) {
                    avg++;
                    break;
                }

                lowerLimit = avg;
            }
            else {
                if (avg - 1 == lowerLimit)
                {
                    avg--;
                    break;
                }

                upperLimit = avg;
            }
        }

        System.out.println("The number you're thinking of is " + avg);
    }

    // implemet here the methods isGreaterThan and average
    public boolean isGreaterThan(int value)
    {
        System.out.println("Is your number greater than " + value + "? (y/n)");

        String input = reader.nextLine();

        if (input.equals("y"))
            return true;

        if (input.equals("n"))
            return false;

        return false;
    }

    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

    public static int howManyTimesHalvable(int number) {
        // create a base two log with the given value
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public static int instructions(int upperLimit, int lowerLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");
        System.out.println("I can guess the number with " + maxQuestions + " questions.");
        System.out.println();
        System.out.println("Answer these questions honestly.");
        System.out.println();

        return maxQuestions;
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();

        game.play(1,10);
        game.play(10, 100);
    }
}