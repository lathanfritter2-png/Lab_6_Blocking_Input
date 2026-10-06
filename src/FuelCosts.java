import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double gasPrice = 0;
        String trash;
        boolean done = false;

        do {
            System.out.print("Enter gallons in tank: ");

            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                if (gallons > 0) {
                    done = true;
                } else {
                    System.out.println("Enter a number greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter miles per gallon: ");

            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                if (mpg > 0) {
                    done = true;
                } else {
                    System.out.println("Enter a number greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter gas price per gallon: ");

            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
                if (gasPrice > 0) {
                    done = true;
                } else {
                    System.out.println("Enter a number greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        double cost = (100.0 / mpg) * gasPrice;
        double distance = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + cost);
        System.out.println("Distance with full tank: " + distance + " miles");
    }
}
