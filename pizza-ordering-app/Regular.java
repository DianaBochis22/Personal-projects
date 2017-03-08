import java.util.Scanner;

/**
 * Created by Diana Bochis on 07/03/2017.
 */
public class Regular extends Pizza {
    public Regular(int size) {
        super(size);
        this.type = "REGULAR";
    }

    public Regular() {
    }

    public double getCost () {
        return this.cost;
    }

    @Override
    public void getToppings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many toppings?");
        int numToppings = sc.nextInt();
        while (numToppings > 4) {
            System.out.println("you can have only 4 toppings");
            System.out.println("how many toppings would you like?");
            numToppings = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i<numToppings;i++) {
            System.out.println("enter toppings : ");
            String topping = sc.nextLine();
            toppingss.add(topping);
            this.cost += 2.00;

        }
    }
}

