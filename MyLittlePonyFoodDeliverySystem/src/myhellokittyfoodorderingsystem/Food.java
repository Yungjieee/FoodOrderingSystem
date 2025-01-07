package myhellokittyfoodorderingsystem;

public class Food {

    private String food;
    private double price;

    public Food(String food, double price) {
        this.food = food;
        this.price = price;

    }

    public void setFood(String food) {
        this.food = food;
    }

    // Encapsulation: setPrice
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public String getFood() {
        return food;
    }

    // Encapsulation: getPrice
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return food + ": RM " + String.format("%.2f", price);
    }

}
