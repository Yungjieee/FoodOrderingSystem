package myhellokittyfoodorderingsystem;
// Inheritance: Customer inherit from Client
public class Customer extends Client{


    public Customer(int id, String name, String address, String email) {
        super(id, name, address, email);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer ID: ").append(getId()).append("\n");
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Address: ").append(getAddress()).append("\n");
        sb.append("Email: ").append(getEmail()).append("\n\n");

        return sb.toString();
    }
}
