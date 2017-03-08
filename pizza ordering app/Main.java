import java.util.ArrayList;

/**
 * Created by Diana Bochis on 07/03/2017.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your name, please: ");
        String name = sc.nextLine();
        System.out.println("regular or sicilian pizza?");
                String type = sc.nextLine();
                 if (type.equalsIgnoreCase("Regular")){
                     System.out.println("small, medium or large?");
                     String size = sc.nextLine();
                     Regular pizza1 = new Regular();
                     if (size.equalsIgnoreCase("small")){
                        pizza1 = new Regular(12);
                     }
                     else if (size.equalsIgnoreCase("medium"))
                     {
                         pizza1 = new Regular(14);
                     }
                     else if (size.equalsIgnoreCase("large"))
                     {
                         pizza1 = new Regular(16);
                     }
                     pizza1.getToppings();
                     pizza1.prinString();
                 }
                 else
                 {
                     System.out.println("What size?");
                     String size = sc.nextLine();
                     Sicilian pizza1 = new Sicilian();
                     if (size.equalsIgnoreCase("small")){
                         pizza1 = new Sicilian(10);
                     }
                     else if (size.equalsIgnoreCase("medium"))
                     {
                         pizza1 = new Sicilian(12);
                     }
                     else if (size.equalsIgnoreCase("large"))
                     {
                         pizza1 = new Sicilian(14);
                     }
                     pizza1.getToppings();
                     pizza1.prinString();
                 }




    }
}
