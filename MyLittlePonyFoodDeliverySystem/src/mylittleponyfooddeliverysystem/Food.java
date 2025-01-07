package mylittleponyfooddeliverysystem;

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

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFood() {
        return food;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return food + ": RM " + String.format("%.2f", price);
    }

}
