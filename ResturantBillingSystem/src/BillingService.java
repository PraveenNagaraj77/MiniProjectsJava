public class BillingService {
    public static double calculateItemTotal(int choice, int quantity){
        double price  = MenuService.getPrice(choice);
        return  price * quantity;
    }

    public static void printFinalBill(double totalBill){
        double gst = totalBill * 0.05;
        double finalAmount = totalBill + gst;

        System.out.println("\n===== FINAL BILL =====");
        System.out.println("Subtotal : ₹" + totalBill);
        System.out.println("GST 5%   : ₹" + gst);
        System.out.println("Total    : ₹" + finalAmount);
        System.out.println("======================");

    }
}
