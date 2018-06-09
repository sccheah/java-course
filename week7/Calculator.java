// basic calculator supporting sum, difference, and product
public class Calculator
{
    private Reader reader;
    private int calcCounter = 0;

    public Calculator() { reader = new Reader(); }

    private int getFirstValue()
    {
        System.out.print("value1: ");
        return reader.readInteger();
    }

    private int getSecondValue()
    {
        System.out.print("value2: ");
        return reader.readInteger();
    }

    private void sum()
    {
        int value1 = getFirstValue();
        int value2 = getSecondValue();

        System.out.println("sum of the values " + (value1 + value2));
    }

    private void difference()
    {
        int value1 = getFirstValue();
        int value2 = getSecondValue();

        System.out.println("difference of the values " + (value1 - value2));
    }

    private void product()
    {
        int value1 = getFirstValue();
        int value2 = getSecondValue();

        System.out.println("product of the values " + (value1 * value2));
    }

    private void statistics()
    {
        System.out.println("Calculations done " + calcCounter);
    }

    public void start() {

        String command = null;

        while(true) {
            System.out.print("command: ");
            command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                calcCounter++;
            }
            else if (command.equals("difference")) {
                difference();
                calcCounter++;
            }
            else if (command.equals("product")) {
                product();
                calcCounter++;
            }
        }

        statistics();
    }

    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}