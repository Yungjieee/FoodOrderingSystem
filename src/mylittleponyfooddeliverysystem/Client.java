package mylittleponyfooddeliverysystem;

import java.util.List;
import java.util.Objects;

public class Client {

    private int id;
    private String name;
    private String address;
    private String email;

    public Client(int id, String name, String address, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Client c = (Client) obj;
        return this.id == c.id && this.name.equalsIgnoreCase(c.name)
                && this.address.equalsIgnoreCase(c.address) && this.email.equalsIgnoreCase(c.email);

    }

    public int hashcode() {
        return Objects.hash(id, name, address, email);
    }

}
