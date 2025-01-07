package mylittleponyfooddeliverysystem;

public class OrderItem {

    private String foodName;
    private double price;
    private int quantity;
    private double subPrice;
    //private int orderId;

    public OrderItem(String foodName, double price, int quantity, double subPrice) {
        
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
        this.subPrice = subPrice;
    }

    public double calculateSubPrice() {
        return quantity * price;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubPrice() {
        return subPrice;
    }

    @Override
    public String toString() {
        return foodName + ": $" + price + " x " + quantity + " = $" + subPrice;
    }
}
