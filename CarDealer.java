package project;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class CarDealer {
    private Map<String, Car> cars;
    private Map<String, Integer> additionalFees;

    public CarDealer() {
        cars = new HashMap<>();
        cars.put("Polo Trendline", new Car("Polo Trendline", 870000));
        cars.put("Polo Highline", new Car("Polo Highline", 1009000));
        cars.put("Virtus Trendline", new Car("Virtus Trendline", 1105000));
        cars.put("Virtus Highline", new Car("Virtus Highline", 1308000));
        cars.put("Taigun Trendline", new Car("Taigun Trendline", 1489000));
        cars.put("Taigun Highline", new Car("Taigun Highline", 1542000));
        cars.put("Taigun Topline", new Car("Taigun Topline", 1771000));

        additionalFees = new HashMap<>();
        additionalFees.put("RTO", 113990);
        additionalFees.put("Insurance", 47300);
        additionalFees.put("TCS charges", 11000);
        additionalFees.put("Additional Accessories", 15000);
    }

    public int calculateTotalCost(String carModel, boolean insuranceOption, boolean accessoriesOption, int dealerDiscount) {
        Car selectedCar = cars.get(carModel);
        if (selectedCar == null) {
            System.out.println("Error: Invalid car model");
            return 0;
        }

        int totalCost = selectedCar.getShowroomPrice() + additionalFees.get("RTO") + additionalFees.get("TCS charges");

        if (insuranceOption) {
            totalCost += additionalFees.get("Insurance");
        }

        if (accessoriesOption) {
            totalCost += additionalFees.get("Additional Accessories");
        }

        if (!insuranceOption && !accessoriesOption && dealerDiscount > 0) {
            System.out.println("Error: Please select at least one additional feature and set the dealer discount to 0.");
            return 0;
        }

        if (dealerDiscount > 30000) {
            dealerDiscount = 30000;
        }

        totalCost -= dealerDiscount;
        return totalCost;
    }
}
