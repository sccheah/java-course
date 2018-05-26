public class LyyraCard
{
    private double balance;

    public LyyraCard(double balance)
    {
        this.balance = balance;
    }

    public double balance()
    {
        return this.balance;
    }

    public void loadMoney(double amount)
    {
        this.balance += amount;
    }

    public boolean pay(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        LyyraCard cardOfPekka = new LyyraCard(10);

        System.out.println("Money on card " + cardOfPekka.balance());
        System.out.println("Money taken: " + cardOfPekka.pay(8));
        System.out.println("Money on card " + cardOfPekka.balance());
    }
}