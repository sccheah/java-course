import java.util.Scanner;

public class NumberStatistics
{
    private int amountOfNumbers;
    private int sum, sumOfEvens, sumOfOdds;

    public NumberStatistics() {
        amountOfNumbers = 0;
        sum = 0;
        sumOfEvens = 0;
        sumOfOdds = 0;
    }

    public void addNumber(int number) {
        amountOfNumbers++;
        sum += number;

        if (number % 2 == 0)
            sumOfEvens += number;
        else
            sumOfOdds += number;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        return sum;
    }

    public int getSumOfEvens() {
        return sumOfEvens;
    }

    public int getSumOfOdds() {
        return sumOfOdds;
    }

    public double average() {
        if (amountOfNumbers == 0)
            return 0.0;

        return (double) sum / amountOfNumbers;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();

        System.out.println("Type numbers: ");
        int num = Integer.parseInt(reader.nextLine());

        while (num != -1)
        {
            stats.addNumber(num);
            num = Integer.parseInt(reader.nextLine());
        }

        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());
        System.out.println("sum of even: " + stats.getSumOfEvens());
        System.out.println("sum of odd: " + stats.getSumOfOdds());
    }
}