package project;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CarDealer carDealer = new CarDealer();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select car model: ");
        String carModel = scanner.nextLine();

        System.out.print("Do you need Insurance (yes/no): ");
        boolean insuranceOption = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Do you need Additional Accessories (yes/no): ");
        boolean accessoriesOption = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Dealer discount (in percentage or rupees): ");
        int dealerDiscount = scanner.nextInt();

        int totalCost = carDealer.calculateTotalCost(carModel, insuranceOption, accessoriesOption, dealerDiscount);
        System.out.println("Total cost: " + totalCost);
    }

}
