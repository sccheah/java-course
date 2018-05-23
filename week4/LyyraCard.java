
/*
The University of Helsinki students use a so-called Lyyra cards to pay for their meals in student cafeterias.
In this assignment, we implement the class LyyraCard that simulates the Lyyra card.
 */

public class LyyraCard  {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        if (this.balance >= 2.5)
            this.balance -= 2.5;
    }

    public void payGourmet() {
        if (this.balance >= 4)
            this.balance -= 4;
    }

    public void loadMoney(double amount) {
        if (amount < 0)
            return;

        if (this.balance + amount > 150)
            this.balance = 150;
        else
            this.balance += amount;
    }

    public static void main(String[] args)  {
        LyyraCard pekka = new LyyraCard(20);
        LyyraCard brian = new LyyraCard(30);

        pekka.payGourmet();
        brian.payEconomical();

        System.out.println("Pekka: " + pekka);
        System.out.println("Brian: " + brian);

        pekka.loadMoney(20);
        brian.payGourmet();

        System.out.println("Pekka: " + pekka);
        System.out.println("Brian: " + brian);

        pekka.payEconomical();
        pekka.payEconomical();

        brian.loadMoney(50);

        System.out.println("Pekka: " + pekka);
        System.out.println("Brian: " + brian);

    }
}