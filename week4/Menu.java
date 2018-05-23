import java.util.ArrayList;

// we'll implement a Menu class that holds info about meals that are available in cafeteria

public class Menu
{
    private ArrayList<String> meals;

    public Menu()
    {
        this.meals = new ArrayList<String>();
    }

    public void add_meal(String meal)
    {
        if (this.meals.contains(meal))
            return;

        this.meals.add(meal);
    }

    public void print_meals()
    {
        for (String meal : this.meals)
        {
            System.out.println(meal);
        }
    }

    public void clear_menu()
    {
        meals.clear();
    }

    public static void main(String[] args)
    {
        Menu menu = new Menu();

        menu.add_meal("Hamburger");
        menu.add_meal("Fish'n'Chips");
        menu.add_meal("Hot Dog");

        menu.print_meals();

        menu.clear_menu();

        menu.print_meals();

    }
}