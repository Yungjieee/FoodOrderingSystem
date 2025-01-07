package myhellokittyfoodorderingsystem;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddOrder extends javax.swing.JFrame {

    private ClientOperation clientOp;
    private HomePage homePage;
    private List<Food> foodServed;
    private List<OrderItem> orderedFood;

    public AddOrder(HomePage homePage) {
        setTitle("MyHelloKitty");
        initComponents();
        clientOp = new ClientOperation();
        this.homePage = homePage;
        this.foodServed = new ArrayList<>();
        orderedFood = new ArrayList<>();

        displayRestaurantName();

        
        tblDisplayFood.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Food", "Price"}
        ));
        jScrollPane1.setViewportView(tblDisplayFood);
        tblDisplayFood.setEnabled(false);
        SpnQty.setEnabled(false);
        txtFoodOrdered.setEditable(false);
        cbbRestName.setEnabled(false);
        btnAddFood.setEnabled(false);
        txtTotal.setEnabled(false);
        dc.setEnabled(false);
        btnAddOrder.setEnabled(false);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                homePage.setVisible(true);
            }
        });
    }

    private void displayRestaurantName() {
        List<Restaurant> restaurants = clientOp.getRestList();

        String[] restaurantNames = new String[restaurants.size()];
        for (int i = 0; i < restaurants.size(); i++) {
            restaurantNames[i] = restaurants.get(i).getName();
        }

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(restaurantNames);

        cbbRestName.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnValidCustId = new javax.swing.JButton();
        txtCustId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplayFood = new javax.swing.JTable();
        cbbRestName = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnAddOrder = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtFoodOrdered = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        dc = new com.toedter.calendar.JDateChooser();
        btnClear = new javax.swing.JButton();
        btnAddFood = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDisplayOrder = new javax.swing.JTable();
        SpnQty = new javax.swing.JSpinner();
        btnChangeRest = new javax.swing.JButton();
        btnClearCart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ADD ORDER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Customer ID       :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Restaurant Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Date Ordered :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Total Amount to be Paid: RM ");

        btnValidCustId.setText("Valid Customer ID");
        btnValidCustId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidCustIdActionPerformed(evt);
            }
        });

        tblDisplayFood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Price"
            }
        ));
        tblDisplayFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayFoodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisplayFood);

        cbbRestName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbRestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbRestNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Food Name   :");

        btnAddOrder.setText("Confirm Order");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Quantity: ");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        dc.setDateFormatString("d, MMM, yyyy");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAddFood.setText("Add Food to Cart");
        btnAddFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodActionPerformed(evt);
            }
        });

        tblDisplayOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Ordered", "Price", "Quantity", "SubPrice"
            }
        ));
        jScrollPane3.setViewportView(tblDisplayOrder);

        SpnQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        btnChangeRest.setText("Change Restaurant");
        btnChangeRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeRestActionPerformed(evt);
            }
        });

        btnClearCart.setText("Clear Cart");
        btnClearCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFoodOrdered, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SpnQty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbbRestName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnChangeRest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnValidCustId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(btnAddOrder)))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnClear)
                .addGap(229, 229, 229))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnAddFood, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClearCart)
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValidCustId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbRestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeRest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFoodOrdered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(SpnQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClearCart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddOrder))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidCustIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidCustIdActionPerformed
        //UPDATE

        String custId = txtCustId.getText();

        if (custId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in ID!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int customerId = Integer.parseInt(custId);
                if (clientOp.isCustomerRegistered(customerId)) {
                    JOptionPane.showMessageDialog(this, "Customer ID is valid! You can order now!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    //txtQtty.setEnabled(true);

                    //cannot
                    SpnQty.setEnabled(true);
                    cbbRestName.setEnabled(true);
                    btnAddFood.setEnabled(true);
                    txtTotal.setEnabled(true);
                    dc.setEnabled(true);
                    dc.setDate(new Date());
                    btnAddOrder.setEnabled(true);
                    tblDisplayFood.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "You haven't registered!", "Error", JOptionPane.ERROR_MESSAGE);
                    txtCustId.setText("");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid ID format!", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_btnValidCustIdActionPerformed

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed

        try {
            int customerId = Integer.parseInt(txtCustId.getText());
            String restaurantName = (String) cbbRestName.getSelectedItem();

            // Convert java.util.Date to java.sql.Date
            java.util.Date utilDate = dc.getDate();
            if (utilDate == null) {
                JOptionPane.showMessageDialog(this, "Please select a date!");
                return;
            }
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            double totalAmount = updateTotalAmount();

            int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to place this order?", "Confirm Order", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                Order newOrder = new Order(0, customerId, restaurantName, sqlDate, totalAmount, orderedFood);
                clientOp.addOrder(newOrder);

                JOptionPane.showMessageDialog(this, "Order added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                txtCustId.setText("");
                txtFoodOrdered.setText("");
                SpnQty.setValue(1);
                txtTotal.setText("");
                DefaultTableModel model = (DefaultTableModel) tblDisplayOrder.getModel();
                model.setRowCount(0);

                DefaultTableModel model2 = (DefaultTableModel) tblDisplayFood.getModel();
                model2.setRowCount(0);
                
                dc.setDate(null);
            
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid customer ID format!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while adding the order!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        homePage.setLocationRelativeTo(null);
        homePage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        orderedFood.clear();
        updateTotalAmount();
        SpnQty.setValue(1);
        txtFoodOrdered.setText("");
        txtTotal.setText("");
        txtCustId.setText("");
        
        dc.setDate(new Date());

        DefaultTableModel model = (DefaultTableModel) tblDisplayOrder.getModel();
        model.setRowCount(0);

        DefaultTableModel model2 = (DefaultTableModel) tblDisplayFood.getModel();
        model2.setRowCount(0);

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodActionPerformed
        String foodName = txtFoodOrdered.getText();
        
        int quantity = (int) SpnQty.getValue();

        
        String selectedRestaurant = (String) cbbRestName.getSelectedItem();
        foodServed = clientOp.getFoodsByRestaurantName(selectedRestaurant);

        Food selectedFood = null;
        for (Food food : foodServed) {
            if (food.getFood().equals(foodName)) {
                selectedFood = food;
                break;
            }
        }

        if (selectedFood != null) {
            Double price = selectedFood.getPrice();
            Double subPrice = price * quantity;

            boolean isDuplicate = false;
            for (OrderItem item : orderedFood) {
                if (item.getFoodName().equals(foodName)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                orderedFood.add(new OrderItem(foodName, price, quantity, subPrice));

                DefaultTableModel model = (DefaultTableModel) tblDisplayOrder.getModel();
                //model.setRowCount(0);
                model.addRow(new Object[]{foodName, price, quantity, String.format("%.2f", subPrice)});
                updateTotalAmount();

                JOptionPane.showMessageDialog(this, "Food added to cart successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "This food is already in the cart.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Food not found in the selected restaurant's menu.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddFoodActionPerformed

    private void tblDisplayFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayFoodMouseClicked
        // TODO add your handling code here:
        int row = tblDisplayFood.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblDisplayFood.getModel();
        txtFoodOrdered.setText(model.getValueAt(row, 0).toString());
    }//GEN-LAST:event_tblDisplayFoodMouseClicked

    private void cbbRestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbRestNameActionPerformed

        String selectedRestaurant = (String) cbbRestName.getSelectedItem();
        foodServed = clientOp.getFoodsByRestaurantName(selectedRestaurant);

        DefaultTableModel model = (DefaultTableModel) tblDisplayFood.getModel();
        model.setRowCount(0);

        for (Food food : foodServed) {
            model.addRow(new Object[]{food.getFood(), food.getPrice()});
        }

        cbbRestName.setEnabled(false);
    }//GEN-LAST:event_cbbRestNameActionPerformed

    private void btnChangeRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeRestActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Changing the restaurant will clear the food cart. Do you want to proceed?", "Confirm Change Restaurant", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            // Clear the food cart and reset fields
            orderedFood.clear();
            updateTotalAmount();

            txtFoodOrdered.setText("");
            SpnQty.setValue(1);
            txtTotal.setText("");

            // Clear the table of food orders
            DefaultTableModel model = (DefaultTableModel) tblDisplayOrder.getModel();
            model.setRowCount(0);

            // Enable the combo box for changing the restaurant
            cbbRestName.setEnabled(true);

            JOptionPane.showMessageDialog(this, "Restaurant changed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnChangeRestActionPerformed

    private void btnClearCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCartActionPerformed
        orderedFood.clear();
        updateTotalAmount();

        txtFoodOrdered.setText("");
        SpnQty.setValue(1);
        txtTotal.setText("");

        DefaultTableModel model = (DefaultTableModel) tblDisplayOrder.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnClearCartActionPerformed

    private double updateTotalAmount() {
        double totalAmount = 0.0;
        for (OrderItem item : orderedFood) {
            totalAmount += item.getSubPrice();
        }
        txtTotal.setText(String.format("%.2f", totalAmount));
        return totalAmount;
    }

    public static void main(String args[]) {
        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddOrder addOrder = new AddOrder(new HomePage());
                addOrder.setLocationRelativeTo(null);
                addOrder.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpnQty;
    private javax.swing.JButton btnAddFood;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChangeRest;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearCart;
    private javax.swing.JButton btnValidCustId;
    private javax.swing.JComboBox<String> cbbRestName;
    private com.toedter.calendar.JDateChooser dc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblDisplayFood;
    private javax.swing.JTable tblDisplayOrder;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtFoodOrdered;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
