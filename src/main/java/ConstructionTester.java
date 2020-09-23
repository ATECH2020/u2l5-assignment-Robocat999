import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        //Declare all needed vars
        Scanner scan = new Scanner(System.in);
        double lumberCost = 8;
        double windowsCost = 11;
        double taxRate;
        int numBoards;
        int numWindows;
        double total;

        //Gather user input for calculations
        System.out.println("Enter the sales tax rate: ");
        taxRate = scan.nextDouble();
        System.out.println("How many boards do you need? ");
        numBoards = scan.nextInt();
        System.out.println("How many windows do you need? ");
        numWindows = scan.nextInt();

        //Create a Construction called construct
        Construction construct = new Construction(lumberCost, windowsCost, taxRate);

        //Find the total
        total = construct.lumberCost(numBoards) + construct.windowCost(numWindows);

        //Print out total and grand total
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + construct.grandTotal(total) );
    }
}
