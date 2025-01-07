package mylittleponyfooddeliverysystem;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order {

    private int orderId;
    private int customerId;
    private String restaurantName;
    private Date dateOrdered;
    private double totalAmount;
    private List<OrderItem> orderItems;

    public Order(int orderId, int customerId, String restaurantName, java.sql.Date dateOrdered, double totalAmount, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.restaurantName = restaurantName;
        this.dateOrdered = dateOrdered;
        this.totalAmount = totalAmount;
        this.orderItems = orderItems;
    }

    // Getters and setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId)
                .append(", Customer ID: ").append(customerId)
                .append(", Restaurant: ").append(restaurantName)
                .append(", Date: ").append(dateOrdered)
                .append(", Total Amount: ").append(totalAmount)
                .append(", Order Items: ");
        for (OrderItem item : orderItems) {
            sb.append("[").append(item.toString()).append("] ");
        }
        return sb.toString();
    }
}
