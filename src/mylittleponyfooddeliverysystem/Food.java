//package mylittleponyfooddeliverysystem;
//
//public class Food {
//
//    private String food;
//    private double price;
//
//    public Food(String food, double price) {
//        this.food = food;
//        this.price = price;
//
//    }
//
//    public void setFood(String food) {
//        this.food = food;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public String getFood() {
//        return food;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    @Override
//    public String toString() {
//        return food + ": RM " + String.format("%.2f", price);
//    }
//
//}
package mylittleponyfooddeliverysystem;

public abstract class Food {

    private String name;
    private double price;
    private String category;

    public Food(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    public String getCategory() {
        return category; // Getter for category
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Abstract method to be implemented by subclasses
    //public abstract String getCategory();

    @Override
    public String toString() {
        return getCategory() + " - " + name + ": RM " + String.format("%.2f", price);
    }
}
