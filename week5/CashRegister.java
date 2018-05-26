public class CashRegister
{
    private static final double ECONOMICAL_LUNCH_COST = 2.50;
    private static final double GOURMET_LUNCH_COST = 4.00;

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister()
    {
        cashInRegister = 1000;
        economicalSold = 0;
        gourmetSold = 0;
    }

    // the price of the economical lunch is 2.50 euros
    // if the given cash is at least the price of the lunch:
    //    the price of lunch is added to register
    //    the amount of the sold lunches is incremented by one
    //    the method returns cashGiven - lunch price
    // if not enough money is given, all is returned and nothing else happens
    public double payEconomical (double cashGiven)
    {
        if (cashGiven >= ECONOMICAL_LUNCH_COST)
        {
            cashInRegister += ECONOMICAL_LUNCH_COST;
            economicalSold++;

            return cashGiven - ECONOMICAL_LUNCH_COST;
        }

        return cashGiven;
    }

    // the price of the gourmet lunch is 4.00 euros
    // if the given cash is at least the price of the lunch:
    //    the price of lunch is added to the register
    //    the amount of the sold lunches is incremented by one
    //    the method returns cashGiven - lunch price
    // if not enough money is given, all is returned and nothing else happens
    public double payGourmet(double cashGiven)
    {
        if (cashGiven >= GOURMET_LUNCH_COST)
        {
            cashInRegister += GOURMET_LUNCH_COST;
            gourmetSold++;

            return cashGiven - GOURMET_LUNCH_COST;
        }

        return cashGiven;
    }

    // the price of the economical lunch is 2.50 euros
    // if the balance of the card is at least the price of the lunch:
    //    the amount of sold lunches is incremented by one
    //    the method returns true
    // if not, the method returns false
    public boolean payEconomical (LyyraCard card)
    {
        if (card.balance() >= ECONOMICAL_LUNCH_COST)
        {
            economicalSold++;
            card.pay(ECONOMICAL_LUNCH_COST);

            return true;
        }

        return false;
    }

    // the price of the gourmet lunch is 4.00 euros
    // if the balance of the card is at least the price of the lunch:
    //    the amount of sold lunches is incremented by one
    //    the method returns true
    // if not, the method returns false
    public boolean payGourmet (LyyraCard card)
    {
        if (card.balance() >= GOURMET_LUNCH_COST)
        {
            gourmetSold++;
            card.pay(GOURMET_LUNCH_COST);

            return true;
        }

        return false;
    }

    /*
    To complete the assignment, extend the cash register with a method that can be used to load cash to Lyyra Cards.
    When a certain amount is loaded to the card, the amount stored in the register increases correspondingly.
     */
    public void loadMoneyToCard(LyyraCard card, double sum)
    {
        if (sum < 0)
            return;

        card.loadMoney(sum);
        cashInRegister += sum;

        return;
    }

    public String toString()
    {
        return "money in register " + cashInRegister + " economical lunches sold: "
                + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }

    public static void main(String[] args) {
        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );
    }
}