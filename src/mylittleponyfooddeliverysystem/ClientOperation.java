package mylittleponyfooddeliverysystem;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Iterator;

public class ClientOperation {

    private List<Customer> cust = new ArrayList<>();
    private List<Restaurant> rest = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String username = "root";
    private static final String password = "";
    private Connection connection;

    public ClientOperation() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            createTablesIfNotExist();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        loadCustomersFromDatabase();
        loadRestaurantsFromDatabase();
        loadOrdersFromDatabase();
    }

    private void createTablesIfNotExist() {
        try (Statement stmt = connection.createStatement()) {
            String createCustomerTable = "CREATE TABLE IF NOT EXISTS customer ("
                    + "idCust INT PRIMARY KEY, "
                    + "name VARCHAR(100), "
                    + "address VARCHAR(255), "
                    + "email VARCHAR(100))";
            stmt.execute(createCustomerTable);

            String createRestaurantTable = "CREATE TABLE IF NOT EXISTS restaurant ("
                    + "idRest INT PRIMARY KEY, "
                    + "name VARCHAR(100), "
                    + "address VARCHAR(255), "
                    + "email VARCHAR(100))";
            stmt.execute(createRestaurantTable);

            String createFoodTable = "CREATE TABLE IF NOT EXISTS food ("
                    + "idRest INT, "
                    + "food VARCHAR(100), "
                    + "price DOUBLE, "
                    + "idFood INT PRIMARY KEY NOT NULL AUTO_INCREMENT, "
                    + "FOREIGN KEY (idRest) REFERENCES restaurant(idRest))";
            stmt.execute(createFoodTable);

            String createOrderTable = "CREATE TABLE IF NOT EXISTS orders ("
                    + "orderId INT AUTO_INCREMENT PRIMARY KEY, "
                    + "customerId INT, "
                    + "restaurantName VARCHAR(45), "
                    + "dateOrdered DATE, "
                    + "totalAmount DOUBLE, "
                    + "FOREIGN KEY (customerId) REFERENCES customer(idCust))";
            stmt.execute(createOrderTable);

            String createOrderItemsTable = "CREATE TABLE IF NOT EXISTS order_items ("
                    + "orderId INT, "
                    + "foodName VARCHAR(45), "
                    + "price DOUBLE, "
                    + "quantity INT, "
                    + "subPrice DOUBLE, "
                    + "PRIMARY KEY (orderId, foodName), "
                    + "FOREIGN KEY (orderId) REFERENCES orders(orderId))";
            stmt.execute(createOrderItemsTable);

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Loads all customers from the customer table in the database into the cust list.
    public void loadCustomersFromDatabase() {
        try {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM test.customer";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("idCust");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String email = rs.getString("email");
                cust.add(new Customer(id, name, address, email));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Loads all restaurants from the restaurant table in the database into the rest list.
    public void loadRestaurantsFromDatabase() {
        try {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM test.restaurant";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("idRest");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String email = rs.getString("email");
                rest.add(new Restaurant(id, name, address, email, getFoodsByRestaurantId(id)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Returns a list of Food objects associated with a specific restaurant ID from the food table.
    public List<Food> getFoodsByRestaurantId(int idRest) {
        List<Food> foods = new ArrayList<>();
        try {
            String sql = "SELECT food, price, category FROM test.food WHERE idRest = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, idRest);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("food");
                double price = rs.getDouble("price");
                String category = rs.getString("category");

                Food food;
                switch (category) {
                    case "Main Course":
                        food = new MainCourse(name, price);
                        break;
                    case "Beverage":
                        food = new Beverage(name, price);
                        break;
                    case "Dessert":
                        food = new Dessert(name, price);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown category: " + category);
                }
                foods.add(food);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return foods;
    }

    // Loads all orders from the orders table into the orders list.
    public void loadOrdersFromDatabase() {
        try {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM orders";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int orderId = rs.getInt("orderId");
                int customerId = rs.getInt("customerId");
                String restaurantName = rs.getString("restaurantName");
                Date dateOrdered = rs.getDate("dateOrdered");
                double totalAmount = rs.getDouble("totalAmount");

                orders.add(new Order(orderId, customerId, restaurantName, dateOrdered, totalAmount, loadOrderItems(orderId)));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Returns a list of OrderItem objects associated with a specific order ID from the order_items table.
    public List<OrderItem> loadOrderItems(int orderId) {
        List<OrderItem> items = new ArrayList<>();
        try {
            String sql = "SELECT * FROM order_items WHERE orderId = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, orderId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String foodName = rs.getString("foodName");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                double subPrice = rs.getDouble("subPrice");
                items.add(new OrderItem(foodName, price, quantity, subPrice));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return items;
    }

    // Registers a new customer by inserting their details into the customer table and adds the customer to the cust list.
    public void registerCustomer(Customer c) {

        try {
            String sql = "INSERT INTO customer (idCust, name, address, email) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getId());
            stmt.setString(2, c.getName());
            stmt.setString(3, c.getAddress());
            stmt.setString(4, c.getEmail());
            stmt.executeUpdate();

            cust.add(c);

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    // Registers a new restaurant by inserting its details into the restaurant table.
    public void registerRestaurant(Restaurant r) {
        try {
            // Insert restaurant details into the restaurant table
            String sql = "INSERT INTO restaurant (idRest, name, address, email) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, r.getId());
            stmt.setString(2, r.getName());
            stmt.setString(3, r.getAddress());
            stmt.setString(4, r.getEmail());
            stmt.executeUpdate();

            String sql2 = "INSERT INTO food (idRest, food, price, category) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt2 = connection.prepareStatement(sql2);

            for (Food f : r.getFoods()) {
                stmt2.setInt(1, r.getId());
                stmt2.setString(2, f.getName());
                stmt2.setDouble(3, f.getPrice());
                stmt2.setString(4, f.getCategory());
                stmt2.executeUpdate();
            }

            // Add the restaurant to the local list
            rest.add(r);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Food createFood(String name, double price, String category) {
        switch (category) {
            case "Main Course":
                return new MainCourse(name, price);
            case "Beverage":
                return new Beverage(name, price);
            case "Dessert":
                return new Dessert(name, price);
            default:
                throw new IllegalArgumentException("Invalid food category: " + category);
        }
    }

    // Adds a new order by inserting its details into the orders table.
    public void addOrder(Order order) {
        try {
            connection.setAutoCommit(false);  // Start transaction

            // Insert into orders table
            String orderSQL = "INSERT INTO orders (customerId, restaurantName, dateOrdered, totalAmount) VALUES (?, ?, ?, ?)";
            PreparedStatement orderStmt = connection.prepareStatement(orderSQL, Statement.RETURN_GENERATED_KEYS);
            orderStmt.setInt(1, order.getCustomerId());
            orderStmt.setString(2, order.getRestaurantName());
            orderStmt.setDate(3, new java.sql.Date(order.getDateOrdered().getTime()));
            orderStmt.setDouble(4, order.getTotalAmount());
            orderStmt.executeUpdate();

            ResultSet generatedKeys = orderStmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                int orderId = generatedKeys.getInt(1);

                // Insert into order_items table
                String itemSQL = "INSERT INTO order_items (orderId, foodName, price, quantity, subPrice) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement itemStmt = connection.prepareStatement(itemSQL);

                for (OrderItem item : order.getOrderItems()) {
                    itemStmt.setInt(1, orderId);
                    itemStmt.setString(2, item.getFoodName());
                    itemStmt.setDouble(3, item.getPrice());
                    itemStmt.setInt(4, item.getQuantity());
                    itemStmt.setDouble(5, item.getSubPrice());
                    itemStmt.addBatch();
                }
                itemStmt.executeBatch();
            }

            connection.commit();  // Commit transaction
            orders.add(order);

        } catch (SQLException ex) {
            ex.printStackTrace();
            try {
                connection.rollback();  // Rollback transaction if any statement fails
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isValidId(String id) {
        if (id.length() != 6) {
            return false;
        }

        for (char c : id.toCharArray()) {
            if (!Character.isDigit(c)) { //check only it is digit
                return false;
            }
        }
        return true;
    }

    // Checks if a customer ID is unique within the cust list.
    public boolean isUniqueCustId(int id) {
        for (Client c : cust) {
            if (c.getId() == id) {
                return false;
            }
        }
        return true;
    }

    // Checks if a restaurant ID is unique within the rest list.
    public boolean isUniqueRestId(int id) {
        for (Client r : rest) {
            if (r.getId() == id) {
                return false;
            }
        }
        return true;
    }

    public List<Customer> getCustList() {
        return cust;
    }

    public List<Restaurant> getRestList() {
        return rest;
    }

    public List<Order> getOrderList() {
        return orders;
    }

    // Checks if a customer with a specific ID is already registered in the cust list.
    public boolean isCustomerRegistered(int id) {
        for (Customer c : cust) {
            if (c.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Returns a list of Food objects associated with a specific restaurant name by iterating through the rest list.
    public List<Food> getFoodsByRestaurantName(String restName) {
        List<Food> foods = new ArrayList<>();

        for (Restaurant r : rest) {
            if (r.getName().equals(restName)) {
                for (Food f : r.getFoods()) {
                    foods.add(f);
                }
            }
        }
        return foods;
    }

    //Added
    public List<Food> getFoodsByRestaurantID(int restId) {
        List<Food> foods = new ArrayList<>();

        for (Restaurant r : rest) {
            if (r.getId() == restId) {
                for (Food f : r.getFoods()) {
                    foods.add(f);
                }
            }
        }
        return foods;
    }

    public boolean isRestaurantRegistered(int id) {
        for (Client r : rest) {
            if (r.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean isRestaurantNameUnique(String name) {
        for (Client r : rest) {
            if (r.getName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }

    public Client getCustomerById(int custId) {
        Client customer = null;
        for (Client c : cust) {
            if (c.getId() == custId) {
                customer = new Client(c.getId(), c.getName(), c.getAddress(), c.getEmail());
            }
        }
        return customer;
    }

    public Restaurant getRestaurantById(int restId) {
        Restaurant restaurant = null;
        for (Restaurant r : rest) {
            if (r.getId() == restId) {
                restaurant = new Restaurant(r.getId(), r.getName(), r.getAddress(), r.getEmail(), r.getFoods());
            }
        }
        return restaurant;
    }

    public List<Order> getOrdersByCustomerId(int customerId) {
        List<Order> customerOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getCustomerId() == customerId) {
                customerOrders.add(order);
            }
        }
        return customerOrders;
    }

    public void deleteCustomer(int clientId) {
        try {
            connection.setAutoCommit(false);

            String deleteOrderItemsQuery = "DELETE FROM order_items WHERE orderId IN (SELECT orderId FROM orders WHERE customerId = ?)";
            PreparedStatement deleteOrderItemsStmt = connection.prepareStatement(deleteOrderItemsQuery);
            deleteOrderItemsStmt.setInt(1, clientId);
            deleteOrderItemsStmt.executeUpdate();

            String deleteOrdersQuery = "DELETE FROM orders WHERE customerId = ?";
            PreparedStatement deleteOrdersStmt = connection.prepareStatement(deleteOrdersQuery);
            deleteOrdersStmt.setInt(1, clientId);
            deleteOrdersStmt.executeUpdate();

            String query = "DELETE FROM customer WHERE idCust = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, clientId);
            pstmt.executeUpdate();

            connection.commit();

            // delete customer from cust list
            Client clientToRemove = null;
            for (Client customers : cust) {
                if (customers.getId() == clientId) {
                    clientToRemove = customers;
                    break;
                }
            }

            if (clientToRemove != null) {
                cust.remove(clientToRemove);

                // Remove associated orders from orders list
                Iterator<Order> orderIterator = orders.iterator();
                while (orderIterator.hasNext()) {
                    Order order = orderIterator.next();
                    if (order.getCustomerId() == clientId) {
                        orderIterator.remove();
                    }
                }
            }

        } catch (SQLException ex) {
            try {
                connection.rollback(); // Rollback transaction on error
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        } finally {
            try {
                connection.setAutoCommit(true); // Restore auto-commit mode
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void deleteRestaurant(int clientId) {
        try {
            // Delete related food entries first
            String deleteFoodQuery = "DELETE FROM food WHERE idRest = ?";
            PreparedStatement deleteFoodStmt = connection.prepareStatement(deleteFoodQuery);
            deleteFoodStmt.setInt(1, clientId);
            deleteFoodStmt.executeUpdate();

            // Delete the restaurant entry
            String deleteRestaurantQuery = "DELETE FROM restaurant WHERE idRest = ?";
            PreparedStatement deleteRestaurantStmt = connection.prepareStatement(deleteRestaurantQuery);
            deleteRestaurantStmt.setInt(1, clientId);
            deleteRestaurantStmt.executeUpdate();

            // delete restaurant from rest list
            Restaurant restaurantToRemove = null;
            for (Restaurant restaurant : rest) {
                if (restaurant.getId() == clientId) {
                    restaurantToRemove = restaurant;
                    break;
                }
            }

            if (restaurantToRemove != null) {
                rest.remove(restaurantToRemove);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateCustomer(int clientId, String name, String address, String email) {
        try {
            String query = "UPDATE customer SET name = ?, address = ?, email = ? WHERE idCust = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, email);
            pstmt.setInt(4, clientId);
            pstmt.executeUpdate();

            // Find and update the customer from the cust list
            for (Client customer : cust) {
                if (customer.getId() == clientId) {
                    customer.setName(name);
                    customer.setAddress(address);
                    customer.setEmail(email);
                    break;
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void updateRestaurant(int clientId, String name, String address, String email, String[] foods, double[] prices, String[] categories) {
        try {
            // Update restaurant details
            String query = "UPDATE restaurant SET name = ?, address = ?, email = ? WHERE idRest = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, email);
            pstmt.setInt(4, clientId);
            pstmt.executeUpdate();

            // Retrieve food IDs from database
            int[] foodIds = getFoodIds(clientId);

            if (foods.length != foodIds.length) {
                throw new SQLException("Number of food items does not match number of food IDs.");
            }

            // Update food items
            for (int i = 0; i < foods.length; i++) {
                updateFood(foodIds[i], foods[i], prices[i], categories[i]);
            }

            // Update restaurant in local list
            for (Restaurant restaurant : rest) {
                if (restaurant.getId() == clientId) {
                    restaurant.setName(name);
                    restaurant.setAddress(address);
                    restaurant.setEmail(email);

                    // Update food list
                    List<Food> updatedFoodList = restaurant.getFoods();
                    for (int i = 0; i < foods.length; i++) {
                        updatedFoodList.get(i).setName(foods[i]);
                        updatedFoodList.get(i).setPrice(prices[i]);
                        updatedFoodList.get(i).setCategory(categories[i]);
                    }
                    restaurant.setFoods(updatedFoodList);
                    break;
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateFood(int foodId, String food, double price, String category) {
        try {
            String query = "UPDATE food SET food = ?, price = ?, category = ? WHERE idFood = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, food);
            pstmt.setDouble(2, price);
            pstmt.setString(3, category);
            pstmt.setInt(4, foodId);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public int[] getFoodIds(int clientId) {
        List<Integer> foodIds = new ArrayList<>();
        try {
            String query = "SELECT idFood FROM food WHERE idRest = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, clientId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                foodIds.add(rs.getInt("idFood"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return foodIds.stream().mapToInt(Integer::intValue).toArray();
    }

}
