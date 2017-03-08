import java.util.Scanner;

/**
 * Created by Diana Bochis on 07/03/2017.
 */

public class Sicilian extends Pizza {
    public Sicilian() {
    }

    public Sicilian(int size) {
        super(size);
        this.type = "REGULAR";
    }
    public double getCost () {
        return this.cost;
    }
    @Override
    public void getToppings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many toppings?");
        int numToppings = sc.nextInt();
        while (numToppings > 2) {
            System.out.println("you can choose only 2 toppings");
            System.out.println("how many toppings?");
            numToppings = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i<numToppings; i++) {
            System.out.println("enter topping: ");
            String topping = sc.nextLine();
            toppingss.add(topping);
            this.cost += 2.50;

        }
    }
}
