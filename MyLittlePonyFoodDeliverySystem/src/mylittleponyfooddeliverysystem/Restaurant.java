package mylittleponyfooddeliverysystem;

import java.util.List;
import java.util.Objects;

public class Restaurant extends Client {

    private List<Food> foods;

    public Restaurant(int id, String name, String address, String email) {
        super(id, name, address, email);

    }

    public Restaurant(int id, String name, String address, String email, List<Food> foods) {
        super(id, name, address, email);
        this.foods = foods;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Restaurant r = (Restaurant) obj;
        return this.getId() == r.getId() ;
    }

    public int hashcode() {
        return Objects.hash(getId());
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Restaurant ID: ").append(getId()).append("\n");
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Address: ").append(getAddress()).append("\n");
        sb.append("Email: ").append(getEmail()).append("\n");
        sb.append("Foods:\n");
        for (Food food : foods) {
            sb.append("  - ").append(food.getFood()).append(": RM ").append(String.format("%.2f", food.getPrice())).append("\n");
        }
        sb.append("\n");
        return sb.toString();
    }

}
