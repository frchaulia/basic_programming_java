import java.util.Scanner;

public class Jobsheet4_Quiz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the land area (in square meters): ");
        int landArea = scanner.nextInt();
        
        int landPricePerMeter = 1300000; 
        int landPrice = landArea * landPricePerMeter;
        
        double landTaxRate = 0.015; 
        int landTax = (int) (landPrice * landTaxRate); 
        
        double discountRate = 0.05; 
        int discountAmount = (int) (landPrice * discountRate);
        
        int finalCost = landPrice + landTax - discountAmount;
        
        System.out.println("Land Price: Rp " + landPrice);
        System.out.println("Land Tax: Rp " + landTax);
        System.out.println("Discount: Rp " + discountAmount);
        System.out.println("Total Cost: Rp " + finalCost);
        
        scanner.close();
    }
}
