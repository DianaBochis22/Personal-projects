/**
 * Created by Diana Bochis on 07/03/2017.
 */
import java.util.*;
public abstract class Pizza implements Comparable{

   public static final int small = 12;
   public static final int medium = 14;
   public static final int large = 16;
   public double [] price = {10.00, 12.00, 14.00,16};
   public double cost;
   public String type;

    ArrayList<String> toppingss = new ArrayList<>();
    int size;

    public Pizza() {
    }

    public Pizza(double cost, String type, ArrayList<String> toppingss, int size) {
        this.cost = cost;
        this.type = type;
        this.toppingss = toppingss;
        this.size = size;
    }

    public Pizza(int size) {
        switch (size)  {
            case   small:
                cost = price[0];size = small;
            break;
            case medium :
                cost = price[1];size = medium;
            break;
            case large :
                cost = price[2];size = large;
            default:
                System.out.println("There is no such size");
                break;
        }
    }

    public Pizza(String type) {
         type = "pizza";
    }
public void prinString ()
{
    String topping ="";
    if (toppingss.size()==0)
        topping = "what topping?";
}
    public abstract void getToppings ();

    @Override
    public int compareTo(Object o) {
        Pizza other = (Pizza)o;
        if (this.size < other.size)
            return -1;
        else if (this.size == other.size)
            return 0;
        else
            return 1;
    }
}

